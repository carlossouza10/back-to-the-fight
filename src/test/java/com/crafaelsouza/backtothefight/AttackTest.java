package com.crafaelsouza.backtothefight;

import org.junit.Assert;
import org.junit.Test;

import com.crafaelsouza.backtothefight.domain.model.Attack;


public class AttackTest {

	@Test
	public void testCreatingWithMinValues() {
		Attack attack = Attack.builder()
			  .name("Brutal Spin")
			  .duration(1)
			  .damage(1)
			  .isSpecial(false)
			  .mpRequired(0)
			  .build();
		Assert.assertNotNull(attack);
		Assert.assertTrue(1 == attack.getDuration());
		Assert.assertTrue(1 == attack.getDamage());
		Assert.assertTrue(!attack.isSpecial());
		Assert.assertTrue(0 == attack.getMpRequired());
	}
	
	@Test
	public void testCreatingWithMaxValues() {
		Attack attack = Attack.builder()
			  .name("Brutal Spin")
			  .duration(3)
			  .damage(50)
			  .isSpecial(true)
			  .mpRequired(100)
			  .build();
		
		Assert.assertNotNull(attack);
		Assert.assertTrue(3 == attack.getDuration());
		Assert.assertTrue(50 == attack.getDamage());
		Assert.assertTrue(attack.isSpecial());
		Assert.assertTrue(100 == attack.getMpRequired());
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithDurationGreaterThanMaxValue() {
		Attack.builder()
			  .name("Brutal Spin")
			  .duration(4)
			  .damage(50)
			  .isSpecial(true)
			  .mpRequired(100)
			  .build();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithDamageGreaterThanMaxValue() {
		Attack.builder()
			  .name("Brutal Spin")
			  .duration(3)
			  .damage(51)
			  .isSpecial(true)
			  .mpRequired(100)
			  .build();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithmpRequiredGreaterThanMaxValue() {
		Attack.builder()
			  .name("Brutal Spin")
			  .duration(3)
			  .damage(50)
			  .isSpecial(true)
			  .mpRequired(101)
			  .build();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithDurationLessThanMinValue() {
		Attack.builder()
			  .name("Brutal Spin")
			  .duration(4)
			  .damage(0)
			  .isSpecial(true)
			  .mpRequired(100)
			  .build();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithDamageLessThanMinValue() {
		Attack.builder()
			  .name("Brutal Spin")
			  .duration(3)
			  .damage(0)
			  .isSpecial(true)
			  .mpRequired(100)
			  .build();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreatingWithmpRequiredLessThanMaxValue() {
		Attack.builder()
			  .name("Brutal Spin")
			  .duration(3)
			  .damage(50)
			  .isSpecial(true)
			  .mpRequired(-1)
			  .build();
		
	}
}
