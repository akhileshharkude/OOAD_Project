package com.jda.mealplanner.spoonacular.bindings;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "aisle", "image", "consitency", "name", "original", "originalString", "originalName",
		"amount", "unit", "meta", "metaInformation", "measures" })
public class ExtendedIngredient {

	private int id;
	private String aisle;
	private String image;
	private String consitency;
	private String name;
	private String original;
	private String originalString;
	private String originalName;
	private double amount;
	private String unit;
	private List<String> meta = Collections.emptyList();
	private List<String> metaInformation = Collections.emptyList();
	private Measures measures;

	@JsonProperty("id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonProperty("aisle")
	public String getAisle() {
		return aisle;
	}

	public void setAisle(String aisle) {
		this.aisle = aisle;
	}

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@JsonProperty("consitency")
	public String getConsitency() {
		return consitency;
	}

	public void setConsitency(String consitency) {
		this.consitency = consitency;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("original")
	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	@JsonProperty("originalString")
	public String getOriginalString() {
		return originalString;
	}

	public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}

	@JsonProperty("originalName")
	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	@JsonProperty("amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@JsonProperty("unit")
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@JsonProperty("meta")
	public List<String> getMeta() {
		return meta;
	}

	public void setMeta(List<String> meta) {
		this.meta = meta;
	}

	@JsonProperty("metaInformation")
	public List<String> getMetaInformation() {
		return metaInformation;
	}

	public void setMetaInformation(List<String> metaInformation) {
		this.metaInformation = metaInformation;
	}

	@JsonProperty("measures")
	public Measures getMeasures() {
		return measures;
	}

	public void setMeasures(Measures measures) {
		this.measures = measures;
	}

}