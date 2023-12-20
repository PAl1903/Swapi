package com.swapi.dto;

import java.util.List;

public class Film {
	private String title;
	private String director;
	private String releaseDate;
	private List<String> characters;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<String> getCharacters() {
		return characters;
	}
	public void setCharacters(List<String> characters) {
		this.characters = characters;
	}
	public Film(String title, String director, String releaseDate, List<String> characters) {
		super();
		this.title = title;
		this.director = director;
		this.releaseDate = releaseDate;
		this.characters = characters;
	}
	

}
