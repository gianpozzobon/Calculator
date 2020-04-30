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
			if (option.equals("9")) {
				System.out.println();
				System.out.println("Bye! See you later!");
				return;
			} else if (option.equals("1"))
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

	public float readNumber() {
		float value = Float.parseFloat(scanner.nextLine());
		return value;
	}

	public boolean getConfirmation(String message) {
		while (true) {
			System.out.println();
			System.out.print(message + " (Y/n)");
			String useLastResult = readOption().toLowerCase();
			System.out.println();
			if (useLastResult.equals("y") || useLastResult.equals(""))
				return true;
			else if (useLastResult.equals("n"))
				return false;
			invalidOption();
		}
	}

	public void invalidOption() {
		System.out.println();
		System.out.println("This value is invalid!Try again!");
		System.out.println();
	}

	public void showResult() {
		System.out.println();
		System.out.println("Result: " + ans);
		System.out.println();
		System.out.println();
		System.out.println("Press enter to continue... ");
		readOption();
	}

	public void operationsSetup(String operation) {
		System.out.println();
		System.out.println();
		System.out.println("---------------" + operation + "---------------");
		System.out.println();
		System.out.println("You can enter numbers or 'ans' to use last result!");
		System.out.println();
		while (true) {
			System.out.print("Insert your first value: ");
			String getFirstNumber = readOption();
			try {
				firstValue = getFirstNumber.toLowerCase().equals("ans") ? ans : Float.parseFloat(getFirstNumber);
				break;
			} catch (NumberFormatException e) {
				invalidOption();
			}
		}
		while (true) {
			System.out.print("Insert your second value: ");
			String getSecondNumber = readOption();
			try {
				secondValue = getSecondNumber.equals("ans") ? ans : Float.parseFloat(getSecondNumber);
				break;
			} catch (NumberFormatException e) {
				invalidOption();
			}
		}
	}

	public void addition() {
		operationsSetup("Addition");
		super.addition();
		showResult();
	}

	public void subtraction() {
		operationsSetup("Subtraction");
		super.subtraction();
		showResult();
	}

	public void multiplication() {
		operationsSetup("Multiplication");
		super.multiplication();
		showResult();
	}

	public void division() {
		operationsSetup("Division");
		super.division();
		showResult();
	}

	public void average() {
		System.out.println();
		System.out.println();
		System.out.println("---------------Average---------------");
		int gradesCount = 1;
		float pointsCount = 0;
		float gradeInput, pointsInput;
		while (true) {
			while (true) {
				System.out.print("Insert grade " + gradesCount + " (0 to 10): ");
				try {
					gradeInput = readNumber();
					if (gradeInput < 0.0 || gradeInput > 10.0)
						throw new NumberFormatException("This grade is out permitted range!");
					break;
				} catch (NumberFormatException e) {
					System.out.println(e);
				}
			}
			while (true) {
				System.out.print("Insert points " + gradesCount + " (0.01 to 1.0): ");
				try {
					pointsInput = readNumber();
					if (pointsInput < 0.01 || pointsInput > 1.0)
						throw new NumberFormatException("This points is out permitted range!");
					else if (pointsCount + pointsInput > 1.0)
						throw new NumberFormatException(
								"The sum of the points is: " + (pointsCount + pointsInput) + " and exceeds the limit!");
					pointsCount += pointsInput;
					break;
				} catch (NumberFormatException e) {
					System.out.println(e);
				}
			}
			values.add(gradeInput);
			points.add(pointsInput);
			gradesCount++;
			if (pointsCount < 1) {
				boolean confirm = getConfirmation("Would you like to insert a new grade?");
				if (!confirm) {
					if (pointsCount < 1.0) {
						float pointsRemaining = 1 - pointsCount;
						values.add((float) 0);
						points.add(pointsRemaining);
					}
					break;
				}
			} else
				break;
		}
		super.average();
		showResult();
	}

}
