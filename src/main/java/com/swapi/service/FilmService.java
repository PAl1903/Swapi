package com.swapi.service;

import java.util.List;

import com.swapi.dto.Film;

public interface FilmService {
	List<Film> getFilmDetails(String term,String designation);

}
