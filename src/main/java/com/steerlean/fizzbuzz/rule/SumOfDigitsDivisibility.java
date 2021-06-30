package com.steerlean.fizzbuzz.rule;

public class SumOfDigitsDivisibility implements IRule {
	private Integer divisor;
	private String processedString;

	public SumOfDigitsDivisibility(Integer divisor, String processedString) {
		this.divisor = divisor;
		this.processedString = processedString;
	}

	public String parse(Integer number) {
		Integer sumOfDigits = calculateSumOfDigits(number);

		if (sumOfDigits % divisor == 0)
			return processedString;
		return "";
	}

	private Integer calculateSumOfDigits(Integer number) {
		Integer sumOfDigits = 0;

		while (number != 0) {
			sumOfDigits += number % 10;
			number /= 10;
		}

		return sumOfDigits;
	}
}
