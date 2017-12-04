package com.crafaelsouza.backtothefight;

import org.junit.Assert;
import org.junit.Test;

import com.crafaelsouza.backtothefight.domain.model.CharAttributes;


public class CharAttributesTest {

	@Test
	public void testCreatingWithMinimumValues() {
		CharAttributes charAttributes = CharAttributes.builder()
				.agility(0)
				.critical(0)
				.defence(0)
				.strength(0)
				.build();
		
		Assert.assertNotNull(charAttributes);
		Assert.assertTrue(0 == charAttributes.getStrength());
		Assert.assertTrue(0 == charAttributes.getCritical());
		Assert.assertTrue(0 == charAttributes.getAgility());
		Assert.assertTrue(0 == charAttributes.getDefence());
	}
	
	@Test
	public void testCreatingWithMaxValues() {
		CharAttributes charAttributes = CharAttributes.builder()
				.agility(10)
				.critical(10)
				.defence(10)
				.strength(10)
				.build();
		
		Assert.assertNotNull(charAttributes);
		Assert.assertTrue(10 == charAttributes.getStrength());
		Assert.assertTrue(10 == charAttributes.getCritical());
		Assert.assertTrue(10 == charAttributes.getAgility());
		Assert.assertTrue(10 == charAttributes.getDefence());
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testCreatingWithAgilityGreaterThanMax() {
		CharAttributes.builder()
				.agility(11)
				.critical(10)
				.defence(10)
				.strength(10)
				.build();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testCreatingWithCriticalGreaterThanMax() {
		CharAttributes.builder()
				.agility(10)
				.critical(11)
				.defence(10)
				.strength(10)
				.build();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testCreatingWithDefenceGreaterThanMax() {
		CharAttributes.builder()
				.agility(10)
				.critical(10)
				.defence(11)
				.strength(10)
				.build();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testCreatingWithStrengthGreaterThanMax() {
		CharAttributes.builder()
				.agility(10)
				.critical(10)
				.defence(10)
				.strength(11)
				.build();
	}
}
