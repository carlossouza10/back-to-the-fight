package com.crafaelsouza.backtothefight.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.crafaelsouza.backtothefight.domain.model.GameCharacter;
import com.crafaelsouza.backtothefight.domain.repository.CharacterRepository;

@ConfigurationProperties(prefix = "character-config-starter")
@Configuration
@Repository
public class CharacterRepositoryImpl implements CharacterRepository {

	private List<GameCharacter> characters = new ArrayList<GameCharacter>();

	@Override
	public List<GameCharacter> getAllCharacter() {
		return characters;
	}

}
