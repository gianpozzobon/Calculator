package br.edu.up.javaCalculator;

public class Operations {

	private float firstValue = 0;
	private float secondValue = 0;
	private float ans = 0;

	public float getFirstValue() {
		return firstValue;
	}

	public float getSecondValue() {
		return secondValue;
	}

	public float getAns() {
		return ans;
	}

	public void setFirstValue(float value) {
		firstValue = value;
	}

	public void setSecondValue(float value) {
		secondValue = value;
	}

	public void setAns(float value) {
		ans = value;
	}

	public void addition() {
		ans = firstValue + secondValue;
	}

	public void subtraction() {
		ans = firstValue - secondValue;
	}

	public void multiplication() {
		ans = firstValue * secondValue;
	}

	public void division() {
		ans = firstValue / secondValue;
	}
}
