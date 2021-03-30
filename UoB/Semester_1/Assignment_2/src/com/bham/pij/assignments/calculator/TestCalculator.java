package com.bham.pij.assignments.calculator;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String exp = in.nextLine();
		
		Calculator calc = new Calculator();
		
		float result = calc.evaluate(exp);
		
		System.out.println(result);
	}
}
