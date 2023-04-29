package com.jda.mealplanner.spoonacular.service;

import java.util.stream.Collectors;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.jda.mealplanner.model.MealInfo;
import com.jda.mealplanner.spoonacular.bindings.GenerateSingleDayMealPlanResponse;
import com.jda.mealplanner.spoonacular.bindings.RecipeResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class MealPlanningService {

	private final WebClient client = WebClient.builder().baseUrl("https://api.spoonacular.com").build();

	private static final String RECIPE_INFO_URL = "/recipes/{id}/information";
	private static final String MEAL_PLAN_URL = "/recipes/mealplans/generate";
	private static final String API_KEY = "d73a338a1e4845179010effce403a064";

	public Flux<MealInfo> generate(int calories, String suggestedDiet) {
		Mono<GenerateSingleDayMealPlanResponse> resp = client.get().uri(uriBuilder -> {
			uriBuilder.path(MEAL_PLAN_URL).queryParam("apiKey", API_KEY).queryParam("timeFrame", "one");
			if (calories > 0)
				uriBuilder.queryParam("targetCalories", calories);
			if (suggestedDiet != null && !suggestedDiet.isEmpty()) {
				uriBuilder.queryParam("diet", suggestedDiet);
			}
			return uriBuilder.build();
		})
		.retrieve()
		.bodyToMono(GenerateSingleDayMealPlanResponse.class);
		return resp.subscribeOn(Schedulers.boundedElastic())
				.log()
				.flatMapIterable(mealResp -> mealResp.getMeals())
				.flatMap(meal -> {
					Mono<RecipeResponse> recipeResponse = client.get().uri(uriBuilder -> {
						uriBuilder.path(RECIPE_INFO_URL).queryParam("apiKey", API_KEY);
						return uriBuilder.build(meal.getId());
					})
					.retrieve()
					.bodyToMono(RecipeResponse.class);
					return recipeResponse.subscribeOn(Schedulers.boundedElastic())
							.log()
							.map(recipe -> new MealInfo(meal.getTitle(), meal.getReadyInMinutes(),
									recipe.getAnalyzedInstructions().stream()
										  .flatMap(instr -> instr.getSteps().stream()).map(step -> step.getStep())
										  .collect(Collectors.joining("\n")), meal.getCalories));
				});
	}
}