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
				Saddiction();
			else if (option == 2)
				Ssubtraction();
			else if (option == 3)
				Smultiplication();
			else if (option == 4)
				Sdivision();
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
	private double lastValuev=0;

	private void Saddiction() {
		System.out.println("---------------Addiction---------------");
		lastValuev = super.addition(lastValuev);
		System.out.println("Result: " + lastValuev);
		
		
	}

	private void Ssubtraction() {
		System.out.println("---------------Subtraction---------------");
		lastValuev = super.subtraction(lastValuev);
		System.out.println("Result: " + lastValuev);
	}

	private void Smultiplication() {
		System.out.println("---------------Multiplication---------------");
		lastValuev = super.multiplication(lastValuev);
		System.out.println("Result: " + lastValuev);
		
	}

	private void Sdivision() {
		System.out.println("---------------Division---------------");
		lastValuev = super.division(lastValuev);
		System.out.println("Result: " + lastValuev);
		
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
