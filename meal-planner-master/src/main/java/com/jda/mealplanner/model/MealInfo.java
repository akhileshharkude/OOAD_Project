package com.jda.mealplanner.model;

public class MealInfo {

	private final String name;
	private final int readyInMinutes;
	private final String instructions;
	private int calories;

	public MealInfo(String name, int timeToPrepare, String instructions, int calories) {
		super();
		this.name = name;
		this.readyInMinutes = timeToPrepare;
		this.instructions = instructions;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public int getReadyInMinutes() {
		return readyInMinutes;
	}

	public String getInstructions() {
		return instructions;
	}

	public int getCalories() {
		return calories;
	}

}
