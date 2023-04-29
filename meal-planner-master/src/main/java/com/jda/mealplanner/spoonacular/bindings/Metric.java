package com.jda.mealplanner.spoonacular.bindings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "amount", "unitShort", "unitLong" })
public class Metric {

	private double amount;
	private String unitShort;
	private String unitLong;

	@JsonProperty("amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@JsonProperty("unitShort")
	public String getUnitShort() {
		return unitShort;
	}

	public void setUnitShort(String unitShort) {
		this.unitShort = unitShort;
	}

	@JsonProperty("unitLong")
	public String getUnitLong() {
		return unitLong;
	}

	public void setUnitLong(String unitLong) {
		this.unitLong = unitLong;
	}

}
