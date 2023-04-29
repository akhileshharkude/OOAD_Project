package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "vegetarian", "vegan", "glutenFree", "dairyFree", "veryHealthy", "cheap", "veryPopular",
		"sustainable", "weightWatcherSmartPoints", "gaps", "lowFodmap", "ketogenic", "whole30", "preparationMinutes",
		"cookingMinutes", "sourceUrl", "spoonacularSourceUrl", "aggregateLikes", "spoonacularScore", "healthScore",
		"creditsText", "sourceName", "pricePerServing", "extendedIngredients", "id", "title", "readyInMinutes",
		"servings", "image", "imageType", "cuisines", "dishTypes", "diets", "occasions", "winePairing", "instructions",
		"analyzedInstructions" })
public class RecipeResponse {

	private boolean vegetarian;
	private boolean vegan;
	private boolean glutenFree;
	private boolean dairyFree;
	private boolean veryHealthy;
	private boolean cheap;
	private boolean veryPopular;
	private boolean sustainable;
	private int weightWatcherSmartPoints;
	private String gaps;
	private boolean lowFodmap;
	private boolean ketogenic;
	private boolean whole30;
	private int preparationMinutes;
	private int cookingMinutes;
	private String sourceUrl;
	private String spoonacularSourceUrl;
	private int aggregateLikes;
	private double spoonacularScore;
	private double healthScore;
	private String creditsText;
	private String sourceName;
	private double pricePerServing;
	private List<ExtendedIngredient> extendedIngredients = null;
	private int id;
	private String title;
	private int readyInMinutes;
	private int servings;
	private String image;
	private String imageType;
	private List<Object> cuisines = null;
	private List<String> dishTypes = null;
	private List<String> diets = null;
	private List<String> occasions = null;
	private WinePairing winePairing;
	private String instructions;
	private List<AnalyzedInstruction> analyzedInstructions = null;

	@JsonProperty("vegetarian")
	public boolean isVegetarian() {
		return vegetarian;
	}

	@JsonProperty("vegan")
	public boolean isVegan() {
		return vegan;
	}

	@JsonProperty("glutenFree")
	public boolean isGlutenFree() {
		return glutenFree;
	}

	@JsonProperty("dairyFree")
	public boolean isDairyFree() {
		return dairyFree;
	}

	@JsonProperty("veryHealthy")
	public boolean isVeryHealthy() {
		return veryHealthy;
	}

	@JsonProperty("cheap")
	public boolean isCheap() {
		return cheap;
	}

	@JsonProperty("veryPopular")
	public boolean isVeryPopular() {
		return veryPopular;
	}

	@JsonProperty("sustainable")
	public boolean isSustainable() {
		return sustainable;
	}

	@JsonProperty("weightWatcherSmartPoints")
	public int getWeightWatcherSmartPoints() {
		return weightWatcherSmartPoints;
	}

	@JsonProperty("gaps")
	public String getGaps() {
		return gaps;
	}

	@JsonProperty("lowFodmap")
	public boolean isLowFodmap() {
		return lowFodmap;
	}

	@JsonProperty("ketogenic")
	public boolean isKetogenic() {
		return ketogenic;
	}

	@JsonProperty("whole30")
	public boolean isWhole30() {
		return whole30;
	}

	@JsonProperty("preparationMinutes")
	public int getPreparationMinutes() {
		return preparationMinutes;
	}

	@JsonProperty("cookingMinutes")
	public int getCookingMinutes() {
		return cookingMinutes;
	}

	@JsonProperty("sourceUrl")
	public String getSourceUrl() {
		return sourceUrl;
	}

	@JsonProperty("spoonacularSourceUrl")
	public String getSpoonacularSourceUrl() {
		return spoonacularSourceUrl;
	}

	@JsonProperty("aggregateLikes")
	public int getAggregateLikes() {
		return aggregateLikes;
	}

	@JsonProperty("spoonacularScore")
	public double getSpoonacularScore() {
		return spoonacularScore;
	}

	@JsonProperty("healthScore")
	public double getHealthScore() {
		return healthScore;
	}

	@JsonProperty("creditsText")
	public String getCreditsText() {
		return creditsText;
	}

	@JsonProperty("sourceName")
	public String getSourceName() {
		return sourceName;
	}

	@JsonProperty("pricePerServing")
	public double getPricePerServing() {
		return pricePerServing;
	}

	@JsonProperty("extendedIngredients")
	public List<ExtendedIngredient> getExtendedIngredients() {
		return extendedIngredients;
	}

	@JsonProperty("id")
	public int getId() {
		return id;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("readyInMinutes")
	public int getReadyInMinutes() {
		return readyInMinutes;
	}

	@JsonProperty("servings")
	public int getServings() {
		return servings;
	}

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("imageType")
	public String getImageType() {
		return imageType;
	}

	@JsonProperty("cuisines")
	public List<Object> getCuisines() {
		return cuisines;
	}

	@JsonProperty("dishTypes")
	public List<String> getDishTypes() {
		return dishTypes;
	}

	@JsonProperty("diets")
	public List<String> getDiets() {
		return diets;
	}

	@JsonProperty("occasions")
	public List<String> getOccasions() {
		return occasions;
	}

	@JsonProperty("winePairing")
	public WinePairing getWinePairing() {
		return winePairing;
	}

	@JsonProperty("instructions")
	public String getInstructions() {
		return instructions;
	}

	@JsonProperty("analyzedInstructions")
	public List<AnalyzedInstruction> getAnalyzedInstructions() {
		return analyzedInstructions;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}

	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public void setDairyFree(boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	public void setVeryHealthy(boolean veryHealthy) {
		this.veryHealthy = veryHealthy;
	}

	public void setCheap(boolean cheap) {
		this.cheap = cheap;
	}

	public void setVeryPopular(boolean veryPopular) {
		this.veryPopular = veryPopular;
	}

	public void setSustainable(boolean sustainable) {
		this.sustainable = sustainable;
	}

	public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints) {
		this.weightWatcherSmartPoints = weightWatcherSmartPoints;
	}

	public void setGaps(String gaps) {
		this.gaps = gaps;
	}

	public void setLowFodmap(boolean lowFodmap) {
		this.lowFodmap = lowFodmap;
	}

	public void setKetogenic(boolean ketogenic) {
		this.ketogenic = ketogenic;
	}

	public void setWhole30(boolean whole30) {
		this.whole30 = whole30;
	}

	public void setPreparationMinutes(int preparationMinutes) {
		this.preparationMinutes = preparationMinutes;
	}

	public void setCookingMinutes(int cookingMinutes) {
		this.cookingMinutes = cookingMinutes;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public void setSpoonacularSourceUrl(String spoonacularSourceUrl) {
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	public void setAggregateLikes(int aggregateLikes) {
		this.aggregateLikes = aggregateLikes;
	}

	public void setSpoonacularScore(double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}

	public void setHealthScore(double healthScore) {
		this.healthScore = healthScore;
	}

	public void setCreditsText(String creditsText) {
		this.creditsText = creditsText;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public void setPricePerServing(double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public void setExtendedIngredients(List<ExtendedIngredient> extendedIngredients) {
		this.extendedIngredients = extendedIngredients;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setReadyInMinutes(int readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public void setCuisines(List<Object> cuisines) {
		this.cuisines = cuisines;
	}

	public void setDishTypes(List<String> dishTypes) {
		this.dishTypes = dishTypes;
	}

	public void setDiets(List<String> diets) {
		this.diets = diets;
	}

	public void setOccasions(List<String> occasions) {
		this.occasions = occasions;
	}

	public void setWinePairing(WinePairing winePairing) {
		this.winePairing = winePairing;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public void setAnalyzedInstructions(List<AnalyzedInstruction> analyzedInstructions) {
		this.analyzedInstructions = analyzedInstructions;
	}

}