package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.SumOfDigitsDivisibility;

import junit.framework.Assert;

public class RuleEngineTest {

	@Test
	public void testRulePassed() {
		DivisibilityRule divisibilityRule = Mockito.mock(DivisibilityRule.class);
		SumOfDigitsDivisibility sumOfDigitsDivisibility = Mockito.mock(SumOfDigitsDivisibility.class);
		List<IRule> rules = new ArrayList<>();
		rules.add(divisibilityRule);
		rules.add(sumOfDigitsDivisibility);
		Mockito.when(divisibilityRule.parse(1)).thenReturn("test");
		Mockito.when(sumOfDigitsDivisibility.parse(1)).thenReturn("test");
		RuleEngine ruleEngine = new RuleEngine(rules);
		String result = ruleEngine.run(1);
		Assert.assertEquals("testtest", result);

	}

	@Test
	public void testRuleNotPassed() {
		List<IRule> rules = new ArrayList<>();
		RuleEngine ruleEngine = new RuleEngine(rules);
		String result = ruleEngine.run(1);
		Assert.assertEquals(""+1, result);

	}

}