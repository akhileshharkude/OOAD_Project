package com.jda.mealplanner.spoonacular.bindings;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pairedWines", "pairingText", "productMatches" })
public class WinePairing {

	private List<Object> pairedWines = Collections.emptyList();
	private String pairingText;
	private List<Object> productMatches = Collections.emptyList();

	@JsonProperty("pairedWines")
	public List<Object> getPairedWines() {
		return pairedWines;
	}

	public void setPairedWines(List<Object> pairedWines) {
		this.pairedWines = pairedWines;
	}

	@JsonProperty("pairingText")
	public String getPairingText() {
		return pairingText;
	}

	public void setPairingText(String pairingText) {
		this.pairingText = pairingText;
	}

	@JsonProperty("productMatches")
	public List<Object> getProductMatches() {
		return productMatches;
	}

	public void setProductMatches(List<Object> productMatches) {
		this.productMatches = productMatches;
	}

}
