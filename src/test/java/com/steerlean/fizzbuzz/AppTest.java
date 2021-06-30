package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class AppTest {

	@Test
	public void testStart() {
		List<String> processedRange = new ArrayList<String>();
		NumberProcessor processor = Mockito.mock(NumberProcessor.class);
		App app = new App(processor);
		List<String> result = app.start();
		Assert.assertEquals(result, processedRange);
	}

}
