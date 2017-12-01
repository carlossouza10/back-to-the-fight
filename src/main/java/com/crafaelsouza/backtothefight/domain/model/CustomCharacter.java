package com.crafaelsouza.backtothefight.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CustomCharacter {

	private String name;
	private int strength;
	private int agility;
	private int endurence;
	private int attackPrecision;
	
	public CustomCharacter(String name, int strength, int agility, int endurence, int attackPrecision) {
		super();
		this.name = name;
		this.strength = strength;
		this.agility = agility;
		this.endurence = endurence;
		this.attackPrecision = attackPrecision;
	}
	
}
