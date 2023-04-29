package com.jda.mealplanner.spoonacular.bindings;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "steps" })
public class AnalyzedInstruction {

	private String name;
	private List<Step> steps = Collections.emptyList();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public List<Step> getSteps() {
		return steps;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

}
