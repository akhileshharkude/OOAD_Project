package com.jda.mealplanner.spoonacular.bindings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "metric", "us" })
public class Amount {

	private Metric metric;
	private Us us;

	@JsonProperty("metric")
	public Metric getMetric() {
		return metric;
	}

	public void setMetric(Metric metric) {
		this.metric = metric;
	}

	@JsonProperty("us")
	public Us getUs() {
		return us;
	}

	public void setUs(Us us) {
		this.us = us;
	}

}
