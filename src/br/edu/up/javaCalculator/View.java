package br.edu.up.javaCalculator;

import java.util.Scanner;

public class View extends ComplexOperations {

	public Scanner scanner = new Scanner(System.in);
	public Menu menu = new Menu();
	public String option;

	public void run() {
		while (true) {
			menu.show();
			option = readOption();
			if (option.equals("9"))
				return;
			else if (option.equals("1"))
				addition();
			else if (option.equals("2"))
				subtraction();
			else if (option.equals("3"))
				multiplication();
			else if (option.equals("4"))
				division();
			else if (option.equals("5"))
				average();
			else
				invalidOption();
		}
	}

	public String readOption() {
		String value = scanner.nextLine();
		return value;
	}

	public double readNumber() {
		double value = Double.parseDouble(scanner.nextLine());
		return value;
	}

	public void invalidOption() {
		System.out.println("Option invalid");
	}

	public void showResult() {
		System.out.println("");
		System.out.println("Result: " + ans);
		System.out.println("");
		System.out.println("");
		System.out.println("Press enter to continue... ");
		readOption();
	}

	public void operationsSetup() {
		System.out.println("Would you like to use your last result? (Y/n)");
		String useLastResult = readOption();
		if (useLastResult.equals("Y") || useLastResult.equals("y") || useLastResult.equals("")) {
			firstValue = ans;
			System.out.print("Insert your nest value: ");
			secondValue = readNumber();
		} else if (useLastResult.equals("N") || useLastResult.equals("n")) {
			System.out.print("Insert your first value: ");
			firstValue = readNumber();
			System.out.print("Insert your second value: ");
			secondValue = readNumber();
		}
	}

	public void addition() {
		System.out.println("---------------addition---------------");
		operationsSetup();
		super.addition();
		showResult();
	}

	public void subtraction() {
		System.out.println("---------------Subtraction---------------");
		operationsSetup();
		super.subtraction();
		showResult();
	}

	public void multiplication() {
		System.out.println("---------------Multiplication---------------");
		operationsSetup();
		super.multiplication();
		showResult();
	}

	public void division() {
		System.out.println("---------------Division---------------");
		operationsSetup();
		super.division();
		showResult();
	}

	public void average() {
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

}
