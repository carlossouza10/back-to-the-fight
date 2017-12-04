package com.crafaelsouza.backtothefight.domain.model;

import java.util.ArrayList;
import java.util.List;

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
public class GameCharacter {

	private String name;
	private CharacterType type;
	private int hp;
	private int mp;
	private double xp;
	private int level;
	private CharAttributes charAttributes;
	private List<Attack> attacks = new ArrayList<Attack>();
	
	public GameCharacter(String name, CharacterType type, int hp, int mp, double xp, int level,
			CharAttributes charAttributes, List<Attack> attacks) {
		super();
		
		ValidatorUtil.validateNullOrEmptyValue(name, "Character's Name");
		ValidatorUtil.validateNullObject(type, "Character's Type");
		ValidatorUtil.validateRangeValueAttribute(hp, GameConstants.MIN_HP, GameConstants.MAX_HP, "HP");
		ValidatorUtil.validateRangeValueAttribute(mp, GameConstants.MIN_MP, GameConstants.MAX_MP, "MP");
		ValidatorUtil.validateRangeValueAttribute(xp, GameConstants.MIN_EXP, GameConstants.MAX_EXP, "XP");
		ValidatorUtil.validateRangeValueAttribute(level, GameConstants.MIN_LEVEL, GameConstants.MAX_LEVEL, "Level");
		ValidatorUtil.validateNullorEmptyList(attacks, "Attacks");
		
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.mp = mp;
		this.xp = xp;
		this.level = level;
		this.charAttributes = charAttributes;
		this.attacks = attacks;
	}

	
}
