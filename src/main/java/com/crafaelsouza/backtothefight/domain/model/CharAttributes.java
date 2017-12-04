package com.crafaelsouza.backtothefight.domain.model;

import com.crafaelsouza.backtothefight.domain.GameConstants;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CharAttributes {

	private int strength;
	private int defence;
	private int agility;
	private int critical;

	
	public CharAttributes(int strength, int defence, int agility, int critical) {
		super();
		
		ValidatorUtil.validateRangeValueAttribute(strength, GameConstants.MIN_VALUE_CHAR_ATTRIBUTES, GameConstants.MAX_VALUE_CHAR_ATTRIBUTES, "Strength");
		ValidatorUtil.validateRangeValueAttribute(defence, GameConstants.MIN_VALUE_CHAR_ATTRIBUTES, GameConstants.MAX_VALUE_CHAR_ATTRIBUTES, "Defence");
		ValidatorUtil.validateRangeValueAttribute(agility, GameConstants.MIN_VALUE_CHAR_ATTRIBUTES, GameConstants.MAX_VALUE_CHAR_ATTRIBUTES, "Agility");
		ValidatorUtil.validateRangeValueAttribute(critical, GameConstants.MIN_VALUE_CHAR_ATTRIBUTES, GameConstants.MAX_VALUE_CHAR_ATTRIBUTES, "Critical");
		
		this.strength = strength;
		this.defence = defence;
		this.agility = agility;
		this.critical = critical;
	}

	
}
