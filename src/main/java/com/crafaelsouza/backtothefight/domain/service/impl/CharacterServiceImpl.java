package com.crafaelsouza.backtothefight.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crafaelsouza.backtothefight.domain.model.GameCharacter;
import com.crafaelsouza.backtothefight.domain.repository.CharacterRepository;
import com.crafaelsouza.backtothefight.domain.service.CharacterService;

@Service
public class CharacterServiceImpl implements CharacterService {

	@Autowired
	private CharacterRepository repository;
	
	@Override
	public List<GameCharacter> getAvailableCharacters() {
		return repository.getAllCharacter();
	}

	@Override
	public Character create(Character character) {
		return null;
	}

}
