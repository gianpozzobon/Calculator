package br.edu.up.javaCalculator;

import java.util.Scanner;

public class Interface extends ComplexOperations {
	public Scanner scanner = new Scanner(System.in);
	public int option;
	public String selectedOperation = "";

	public void run() {
		Menu menu = new Menu();
		while (true) {
			menu.show();
			option = Integer.parseInt(readOption());
			if (option == 9)
				return;
			else if (option == 1)
				addiction();
			else if (option == 2)
				subtraction();
			else if (option == 3)
				multiplication();
			else if (option == 4)
				division();
			else if (option == 5)
				average();
			else
				invalidOption();
		}
	}

	public String readOption() {
		String value = scanner.nextLine();
		return value;
	}

	private void addiction() {
		System.out.println("---------------Addiction---------------");

		System.out.print("Result: ");
		System.out.println(super.addition(1, 2));
	}

	private void subtraction() {
		System.out.println("---------------Subtraction---------------");

		System.out.print("Result: ");
		System.out.println(super.subtraction(1, 2));
	}

	private void multiplication() {
		System.out.println("---------------Multiplication---------------");

		System.out.print("Result: ");
		System.out.println(super.multiplication(1, 2));
	}

	private void division() {
		System.out.println("---------------Division---------------");

		System.out.print("Result: ");
		System.out.println(super.division(1, 2));
	}

	private void average() {
		double myGrades[] = {};
		double myCoefficients[] = {};
		System.out.println("---------------Average---------------\n");
		int loopsCount = 1;
		String exitAverage = "";
		while (true) {
			System.out.print("Insert note " + loopsCount + ": ");
			String gradeInput = readOption();
			System.out.print("Insert coefficient " + loopsCount + ": ");
			String coefficientInput = readOption();
			double grade = gradeInput != "" ? Double.parseDouble(gradeInput) : 0;
			double coefficient = coefficientInput != "" ? Double.parseDouble(coefficientInput) : 0;
			while (true) {
				System.out.print("Do you want to insert another note? (Y / n)");
				exitAverage = readOption();
				if (exitAverage.equals("Y") || exitAverage.equals("y") || exitAverage.equals("")
						|| exitAverage.equals("N") || exitAverage.equals("n"))
					break;
				else {
					System.out.println(exitAverage);
					invalidOption();
				}
			}
			if (exitAverage.equals("N") || exitAverage.equals("n"))
				break;
			loopsCount++;
		}
		System.out.print("Result: ");
		System.out.println(super.average(myGrades, myCoefficients));
	}

	private void invalidOption() {
		System.out.println("Option invalid");
	}
}
