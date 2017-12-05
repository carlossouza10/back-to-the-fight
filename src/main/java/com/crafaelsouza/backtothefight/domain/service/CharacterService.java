package com.crafaelsouza.backtothefight.domain.service;

import java.util.List;

import com.crafaelsouza.backtothefight.domain.model.GameCharacter;

public interface CharacterService {

	public List<GameCharacter> getAvailableCharacters();
	public Character create(Character character);
}
