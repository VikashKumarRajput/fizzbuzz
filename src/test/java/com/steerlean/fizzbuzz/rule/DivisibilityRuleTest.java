package com.steerlean.fizzbuzz.rule;

import org.junit.Test;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;

import junit.framework.Assert;

public class DivisibilityRuleTest {

	private DivisibilityRule divisibilityRule;

	@Test
	public void testIsDivisible() {
		divisibilityRule = new DivisibilityRule(1, "test");
		String result = divisibilityRule.parse(1);
		Assert.assertEquals("test", result);
	}

	@Test
	public void testIsNotDivisible() {
		divisibilityRule = new DivisibilityRule(2, "test");
		String result = divisibilityRule.parse(1);
		Assert.assertEquals("", result);
	}

}
