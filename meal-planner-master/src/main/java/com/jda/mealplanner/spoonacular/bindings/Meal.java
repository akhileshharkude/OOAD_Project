package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "title", "readyInMinutes", "servings", "image", "imageUrls", "author" })
public class Meal {

	@JsonProperty("id")
	private int id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("readyInMinutes")
	private int readyInMinutes;
	@JsonProperty("servings")
	private int servings;
	@JsonProperty("image")
	private String image;
	@JsonProperty("imageUrls")
	private List<String> imageUrls = null;
	@JsonProperty("author")
	private String author;
	public int getCalories;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(int readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<String> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((imageUrls == null) ? 0 : imageUrls.hashCode());
		result = prime * result + readyInMinutes;
		result = prime * result + servings;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meal other = (Meal) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (imageUrls == null) {
			if (other.imageUrls != null)
				return false;
		} else if (!imageUrls.equals(other.imageUrls))
			return false;
		if (readyInMinutes != other.readyInMinutes)
			return false;
		if (servings != other.servings)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}