package com.crafaelsouza.backtothefight.domain.repository;

import java.util.List;

import com.crafaelsouza.backtothefight.domain.model.GameCharacter;

public interface CharacterRepository {

	public List<GameCharacter> getAllCharacter();
}
