package com.crafaelsouza.backtothefight.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.crafaelsouza.backtothefight.domain.model.GameCharacter;

import lombok.Getter;

@ConfigurationProperties(prefix = "character-config-starter")
@Configuration
@Getter
public class CharacterStarterConfig {

	private List<GameCharacter> characters = new ArrayList<GameCharacter>();
	
}
