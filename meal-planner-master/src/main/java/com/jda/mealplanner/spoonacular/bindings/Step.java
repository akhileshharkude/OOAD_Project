package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "number", "step", "ingredients", "equipment", "length" })
public class Step {

	@JsonProperty("number")
	public int number;
	@JsonProperty("step")
	public String step;
	@JsonProperty("ingredients")
	public List<Ingredient> ingredients = null;
	@JsonProperty("equipment")
	public List<Equipment> equipment = null;
	@JsonProperty("length")
	public Length length;

	public int getNumber() {
		return number;
	}

	public String getStep() {
		return step;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public Length getLength() {
		return length;
	}

}
