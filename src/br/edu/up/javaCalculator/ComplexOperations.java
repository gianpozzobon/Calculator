package br.edu.up.javaCalculator;

import java.util.Scanner;

public class ComplexOperations extends Operations {
	
	public Scanner scanner = new Scanner(System.in);

	public void average() {
		double result = 0, checkError;
		int loopsCount = 1;
		double coefficientCount = 0;
		while (coefficientCount < 1 ) {
			System.out.print("Insert note " + loopsCount + ": ");
			Double gradeInput = Double.parseDouble(scanner.nextLine());
			System.out.print("Insert coefficient " + loopsCount + ": ");
			Double coefficientInput = Double.parseDouble(scanner.nextLine());
			loopsCount++;
			coefficientCount = coefficientInput + coefficientCount;
			System.out.println(coefficientCount);
			checkError = 1 - coefficientCount;
			if(checkError <= 0.01) {
				coefficientCount= coefficientCount + 0.1;
			}
			result = gradeInput * coefficientInput + result;
		}
		System.out.println("");
		System.out.println("Result: " + result);
		System.out.println("");
		System.out.println("");
		System.out.println("Press enter to continue... ");
		scanner.nextLine();
	}

}
