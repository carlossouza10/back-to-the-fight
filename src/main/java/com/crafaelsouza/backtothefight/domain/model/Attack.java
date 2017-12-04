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
public class Attack {

	private String name;
	private int damage;
	private int duration;
	private boolean isSpecial;
	private int mpRequired;

	public Attack(String name, int damage, int duration, boolean isSpecial,
		int mpRequired) {
		super();
		
		ValidatorUtil.validateNullOrEmptyValue(name, "Name of Attack");
		ValidatorUtil.validateRangeValueAttribute(duration, GameConstants.MIN_ATTACK_DURATION, GameConstants.MAX_ATTACK_DURATION, "Duration");
		ValidatorUtil.validateRangeValueAttribute(damage, GameConstants.MIN_DAMAGE_VALUE, GameConstants.MAX_DAMAGE_VALUE, "Damage");
		ValidatorUtil.validateRangeValueAttribute(mpRequired, GameConstants.MIN_REQUIRED_MP_PER_ATTACK, GameConstants.MAX_REQUIRED_MP_PER_ATTACK, "MP Required");
		
		this.name = name;
		this.damage = damage;
		this.duration = duration;
		this.isSpecial = isSpecial;
		this.mpRequired = mpRequired;
	}

	
}
