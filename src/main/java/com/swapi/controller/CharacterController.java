package com.swapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swapi.dto.Characters;
import com.swapi.service.CharacterService;

@RestController
public class CharacterController {
	
	@Autowired
	private CharacterService characterService;
	
	@GetMapping("/characters/search")
	public List<Characters> searchCharacters(@RequestParam String term){
		return characterService.searchCharacters(term);
	}
	
	@GetMapping("/characters/sort")
	public List<Characters> sortCharacters(@RequestParam String attribute){
		return characterService.sortCharacters(attribute);
	}
}
