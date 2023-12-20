package com.swapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swapi.dto.Film;
import com.swapi.service.FilmService;

@RestController
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/films/{designation}")
	public List<Film> getFilmDetail(@RequestParam String directorName,@PathVariable String designation) {
		return filmService.getFilmDetails(directorName,designation);
	}
}
