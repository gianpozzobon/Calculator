package br.edu.up.javaCalculator;

import java.util.ArrayList;

public class ComplexOperations extends Operations {

	public ArrayList<Float> values = new ArrayList<Float>();
	public ArrayList<Float> points = new ArrayList<Float>();

	public void average() {
		float valuesSum = 0, pointsSum = 0;
		for (int i = 0; i < values.size(); i++) {
			setFirstValue(values.get(i));
			setSecondValue(points.get(i));
			super.multiplication();
			setFirstValue(valuesSum);
			setSecondValue(getAns());
			super.addition();
			valuesSum = getAns();
			setFirstValue(pointsSum);
			setSecondValue(points.get(i));
			super.addition();
			pointsSum = getAns();
		}
		setFirstValue(valuesSum);
		setSecondValue(pointsSum);
		super.division();
		values.clear();
		points.clear();
		return;
	}

}
