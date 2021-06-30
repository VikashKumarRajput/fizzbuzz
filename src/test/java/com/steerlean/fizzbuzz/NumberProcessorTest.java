package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class NumberProcessorTest {

	@Test
	public void testRulePassed() {
		RuleEngine ruleEngine = Mockito.mock(RuleEngine.class);
		List<String> processedNumbers = new ArrayList<>();
		NumberProcessor numberProcessor = new NumberProcessor(ruleEngine);
		Mockito.when(ruleEngine.run(1)).thenReturn("test");
		Mockito.when(ruleEngine.run(2)).thenReturn("test2");
		Mockito.when(ruleEngine.run(3)).thenReturn("test3");
		numberProcessor.processRange(1, 3, processedNumbers);
		Assert.assertEquals(3, processedNumbers.size());

	}
}
