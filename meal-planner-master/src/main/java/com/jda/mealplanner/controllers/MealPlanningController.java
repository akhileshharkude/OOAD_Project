package com.jda.mealplanner.controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jda.mealplanner.model.MealInfo;
import com.jda.mealplanner.spoonacular.service.MealPlanningService;

import reactor.core.publisher.Flux;

import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class MealPlanningController {

	@Autowired
	MealPlanningService service;

	@GetMapping
	public String index() {
		return "login";
	}

	@GetMapping("/planning")
	public String planning(Model model) {
		 return "redirect:http://localhost:8082/planning";
	}

	
	public String add(@ModelAttribute("form") GenerateMealPlan form, Model model) {
	    Flux<MealInfo> meals = service.generate(Integer.valueOf(form.getCalories()), form.getSuggestedDiet());
	    model.addAttribute("meals", meals);
	    return "redirect:http://localhost:8082/planning";
	}
}

