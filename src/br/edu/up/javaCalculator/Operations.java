package br.edu.up.javaCalculator;

import java.util.Scanner;



public class Operations {
	public Scanner scanner = new Scanner(System.in);
	double addition(double lastValue) {
		System.out.println("Would you like to use your last result? (y/n)");
		String desire = scanner.nextLine();
		if (desire.equals("Y")|| desire.equals("y")) {
			System.out.println("Insert your nest value: ");
			Double FirstValue = scanner.nextDouble();
			FirstValue = FirstValue + lastValue;
			return FirstValue;
		}
		else {
			System.out.println("Insert your first value: ");
			Double FirstValue = scanner.nextDouble();
			System.out.println("Insert your second value: ");
			Double SecondValue = scanner.nextDouble();
			FirstValue = FirstValue + SecondValue;
			return FirstValue;
		}
	}

	double subtraction(double lastValue) {
		System.out.println("Would you like to use your last result? (y/n)");
		String desire = scanner.nextLine();		
		if (desire.equals("Y")|| desire.equals("y")) {
			System.out.println("Insert your nest value: ");
			Double FirstValue = scanner.nextDouble();
			FirstValue = FirstValue - lastValue;
			return FirstValue;
		}
		else {
			System.out.println("Insert your first value: ");
			Double FirstValue = scanner.nextDouble();
			System.out.println("Insert your second value: ");
			Double SecondValue = scanner.nextDouble();
			FirstValue = FirstValue - SecondValue;
			return FirstValue;
		}

	}

	double multiplication(double lastValue) {
		System.out.println("Would you like to use your last result? (y/n)");
		String desire = scanner.nextLine();
		if (desire.equals("Y")|| desire.equals("y")) {
			System.out.println("Insert your nest value: ");
			Double FirstValue = scanner.nextDouble();
			FirstValue = FirstValue*lastValue;
			return FirstValue;
		}
		else {
			System.out.println("Insert your first value: ");
			Double FirstValue = scanner.nextDouble();
			System.out.println("Insert your second value: ");
			Double SecondValue = scanner.nextDouble();
			FirstValue = FirstValue*SecondValue;
			return FirstValue;
		}
	}

	double division(double lastValue) {
		System.out.println("Would you like to use your last result? (y/n)");
		String desire = scanner.nextLine();
		if (desire.equals("Y")|| desire.equals("y")) {
			System.out.println("Insert your nest value: ");
			Double FirstValue = scanner.nextDouble();
			FirstValue = FirstValue / lastValue;
			return FirstValue;
		}
		else {
			System.out.println("Insert your first value: ");
			Double FirstValue = scanner.nextDouble();
			System.out.println("Insert your second value: ");
			Double SecondValue = scanner.nextDouble();
			FirstValue = FirstValue / SecondValue;
			return FirstValue;
		}
	}
}
