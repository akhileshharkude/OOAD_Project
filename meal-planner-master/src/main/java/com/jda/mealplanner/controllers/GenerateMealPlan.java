package com.jda.mealplanner.controllers;

public class GenerateMealPlan {

    private int calories;
    private String suggestedDiet;

    private GenerateMealPlan() {}

    public int getCalories() {
        return calories;
    }

    public String getSuggestedDiet() {
        return suggestedDiet;
    }

    public static class Builder {
        private final GenerateMealPlan instance = new GenerateMealPlan();

        public Builder withCalories(int calories) {
            instance.calories = calories;
            return this;
        }

        public Builder withSuggestedDiet(String suggestedDiet) {
            instance.suggestedDiet = suggestedDiet;
            return this;
        }

        public GenerateMealPlan build() {
            return instance;
        }
    }
}
