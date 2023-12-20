package com.swapi.service;

import java.util.List;

import com.swapi.dto.Characters;

public interface CharacterService {
	List<Characters> searchCharacters(String term);
	List<Characters> sortCharacters(String attribute);

}
