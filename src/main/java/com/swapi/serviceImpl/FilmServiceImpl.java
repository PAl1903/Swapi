package com.swapi.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.client.RestTemplate;

import com.swapi.dto.Film;
import com.swapi.service.FilmService;

public class FilmServiceImpl implements FilmService {
	
	private final String SWAPI_BASE_URL="https://swapi.dev/api/films";
	
	private RestTemplate restTemplate;
	@Override
	@Cacheable("Film")
	public List<Film> getFilmDetails(String term,String designation) {
		String url=SWAPI_BASE_URL;
		Film[] films=restTemplate.getForObject(url, Film[].class);
		List<Film> result=new ArrayList<>();
		
		for(Film f:films) {
			if(term.equalsIgnoreCase("director") && f.getDirector().contains(term)) {
				result.add(f);
			}
			else if(term.equalsIgnoreCase("characters") && f.getCharacters().contains(term)) {
				result.add(f);
			}
			else {
				return Arrays.asList(films);
			}
		}
		
		return result;
	}
		
}
