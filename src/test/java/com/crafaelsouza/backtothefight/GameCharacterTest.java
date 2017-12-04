package com.crafaelsouza.backtothefight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.crafaelsouza.backtothefight.domain.model.Attack;
import com.crafaelsouza.backtothefight.domain.model.CharAttributes;
import com.crafaelsouza.backtothefight.domain.model.CharacterType;
import com.crafaelsouza.backtothefight.domain.model.GameCharacter;


public class GameCharacterTest {

	@Test
	public void testCreatingWithMinValues() {
		
		GameCharacter character = GameCharacter.builder()
				.name("Joseph123")
				.type(CharacterType.KNIGHT)
				.hp(1)
				.mp(0)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
		
		Assert.assertNotNull(character);
		Assert.assertTrue("Joseph123".equals(character.getName()));
		Assert.assertTrue(1 == character.getHp());
		Assert.assertTrue(0 == character.getMp());
		Assert.assertTrue(CharacterType.KNIGHT.equals(character.getType()));
	}

	@Test
	public void testCreatingWithMaxValues() {
		
		GameCharacter character = GameCharacter.builder()
				.name("Joseph123")
				.type(CharacterType.KNIGHT)
				.hp(100)
				.mp(100)
				.xp(99.9)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
		
		Assert.assertNotNull(character);
		Assert.assertTrue("Joseph123".equals(character.getName()));
		Assert.assertTrue(100 == character.getHp());
		Assert.assertTrue(100 == character.getMp());
		Assert.assertTrue(CharacterType.KNIGHT.equals(character.getType()));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithHPGreaterThanMaxValue() {
		
		GameCharacter.builder()
				.name("Joseph123")
				.type(CharacterType.KNIGHT)
				.hp(101)
				.mp(100)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithHPLessThanMinValue() {
		
		GameCharacter.builder()
				.name("Joseph123")
				.type(CharacterType.KNIGHT)
				.hp(0)
				.mp(100)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithMPGreaterThanMaxValue() {
		
		GameCharacter.builder()
				.name("Joseph123")
				.type(CharacterType.KNIGHT)
				.hp(1)
				.mp(101)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithMPLessThanMinValue() {
		
		GameCharacter.builder()
				.name("Joseph123")
				.type(CharacterType.KNIGHT)
				.hp(1)
				.mp(-1)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithNullName() {
		
		GameCharacter.builder()
				.type(CharacterType.KNIGHT)
				.hp(1)
				.mp(1)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
	}

	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithNullType() {
		
		GameCharacter.builder()
				.name("Joseph123")
				.hp(1)
				.mp(1)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithNullAtacks() {
		
		GameCharacter.builder()
				.name("Joseph123")
				.hp(1)
				.mp(1)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.build();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreatingWithEmptyAtacks() {
		
		GameCharacter.builder()
				.name("Joseph123")
				.hp(1)
				.mp(1)
				.xp(0)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(new ArrayList<>())
				.build();
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithXPLessThanMinValue() {
		GameCharacter.builder()
				.name("Joseph123")
				.type(CharacterType.KNIGHT)
				.hp(100)
				.mp(100)
				.xp(-1)
				.level(1)
				.charAttributes(getCharAttribute())
				.attacks(getAttacks())
				.build();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithLevelLessThanMinValue() {
		GameCharacter.builder()
			.name("Joseph123")
			.type(CharacterType.KNIGHT)
			.hp(100)
			.mp(100)
			.xp(1)
			.level(0)
			.charAttributes(getCharAttribute())
			.attacks(getAttacks())
			.build();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithXPGreaterThanMaxValue() {
		GameCharacter.builder()
			.name("Joseph123")
			.type(CharacterType.KNIGHT)
			.hp(100)
			.mp(100)
			.xp(100)
			.level(1)
			.charAttributes(getCharAttribute())
			.attacks(getAttacks())
			.build();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithLevelGreaterThanMaxValues() {
		GameCharacter.builder()
			.name("Joseph123")
			.type(CharacterType.KNIGHT)
			.hp(100)
			.mp(100)
			.xp(1)
			.level(101)
			.charAttributes(getCharAttribute())
			.attacks(getAttacks())
			.build();
	}
	
	private CharAttributes getCharAttribute() {
		return CharAttributes.builder()
				.agility(10)
				.critical(10)
				.defence(10)
				.strength(10)
				.build();
		
	}
	
	private List<Attack> getAttacks() {
		Attack attack = Attack.builder()
				  .name("Brutal Spin")
				  .duration(3)
				  .damage(50)
				  .isSpecial(true)
				  .mpRequired(100)
				  .build();
		
		List<Attack> attacks = Arrays.asList(attack);
		return attacks;
	}

}
