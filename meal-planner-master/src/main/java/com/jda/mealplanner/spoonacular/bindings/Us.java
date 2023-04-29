package com.jda.mealplanner.spoonacular.bindings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "amount", "unitShort", "unitLong" })
public class Us {

	private double amount;
	private String unitShort;
	private String unitLong;

	@JsonProperty("amount")
	public double getAmount() {
		return amount;
	}

	@JsonProperty("unitShort")
	public String getUnitShort() {
		return unitShort;
	}

	@JsonProperty("unitLong")
	public String getUnitLong() {
		return unitLong;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setUnitShort(String unitShort) {
		this.unitShort = unitShort;
	}

	public void setUnitLong(String unitLong) {
		this.unitLong = unitLong;
	}

}