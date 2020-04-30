package br.edu.up.javaCalculator;

import java.util.ArrayList;

public class ComplexOperations extends Operations {

	public ArrayList<Float> values = new ArrayList<Float>();
	public ArrayList<Float> points = new ArrayList<Float>();

//	public Scanner scanner = new Scanner(System.in);

	public void average() {
		float valuesSum = 0, pointsSum = 0;
		for (int i = 0; i < values.size(); i++) {
			firstValue = values.get(i);
			secondValue = points.get(i);
			super.multiplication();
			firstValue = valuesSum;
			secondValue = ans;
			super.addition();
			valuesSum = ans;
			firstValue = pointsSum;
			secondValue = points.get(i);
			super.addition();
			pointsSum = ans;
		}
		firstValue = valuesSum;
		secondValue = pointsSum;
		super.division();
		return;
	}

}
