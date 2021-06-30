package com.steerlean.fizzbuzz.rule;

public class DivisibilityRule implements IRule {
	private Integer divisor;
	private String processedString;

	public DivisibilityRule(Integer divisor, String processedString) {
		this.divisor = divisor;
		this.processedString = processedString;
	}

	public String parse(Integer number) {
		if (number % divisor == 0)
			return processedString;
		return "";
	}
}
