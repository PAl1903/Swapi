package com.swapi.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.client.RestTemplate;

import com.swapi.dto.Characters;
import com.swapi.service.CharacterService;

public class CharacterServiceImpl implements CharacterService {
	private final String SWAPI_BASE_URL="https://swapi.dev/api/people";
	
	private RestTemplate restTemplate;

	@Override
	@Cacheable("characters")
	public List<Characters> searchCharacters(String term) {
		String url=SWAPI_BASE_URL+"?search="+term;
		Characters[] characters=restTemplate.getForObject(url,Characters[].class);
		return Arrays.asList(characters);
	}

	@Override
	@Cacheable("characters")
	public List<Characters> sortCharacters(String attribute) {
		String url=SWAPI_BASE_URL;
		Characters[] characters=restTemplate.getForObject(url,Characters[].class);
		switch(attribute) {
		
		case "name":
			List<Characters> sortedCharacterByName=Arrays.stream(characters)
			.sorted((c1,c2)->c1.getName().compareTo(c2.getName()))
			.collect(Collectors.toList());
			return sortedCharacterByName;
		
		case "gender":
			List<Characters> sortedCharacterByGender=Arrays.stream(characters)
			.sorted((c1,c2)->c1.getGender().compareToIgnoreCase(c2.getGender()))
			.collect(Collectors.toList());
			return sortedCharacterByGender;
			
		//We can add more attribute as per our requirement
		default:
			return Arrays.asList(characters);
		}
	}

}
