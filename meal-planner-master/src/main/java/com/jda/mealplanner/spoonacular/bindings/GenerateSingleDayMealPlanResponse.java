package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "meals", "nutrients" })
public class GenerateSingleDayMealPlanResponse {

	@JsonProperty("meals")
	private List<Meal> meals = null;
	@JsonProperty("nutrients")
	private Nutrients nutrients;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public GenerateSingleDayMealPlanResponse() {
	}

	/**
	 *
	 * @param meals
	 * @param nutrients
	 */
	public GenerateSingleDayMealPlanResponse(List<Meal> meals, Nutrients nutrients) {
		super();
		this.meals = meals;
		this.nutrients = nutrients;
	}

	@JsonProperty("meals")
	public List<Meal> getMeals() {
		return meals;
	}

	@JsonProperty("meals")
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	@JsonProperty("nutrients")
	public Nutrients getNutrients() {
		return nutrients;
	}

	@JsonProperty("nutrients")
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meals == null) ? 0 : meals.hashCode());
		result = prime * result + ((nutrients == null) ? 0 : nutrients.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenerateSingleDayMealPlanResponse other = (GenerateSingleDayMealPlanResponse) obj;
		if (meals == null) {
			if (other.meals != null)
				return false;
		} else if (!meals.equals(other.meals))
			return false;
		if (nutrients == null) {
			if (other.nutrients != null)
				return false;
		} else if (!nutrients.equals(other.nutrients))
			return false;
		return true;
	}
}
