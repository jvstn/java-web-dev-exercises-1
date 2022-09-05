package org.launchcode.java.demos.lsn1datatypes.areaOfCircle;

public class Circle {
	public static Double getArea(Double radius) {
		if (radius < 0) {
			throw new Error("Please enter non-negative number");
		}
		if (radius.toString().equals("")) {
			throw new Error("Please enter something");
		}
		if (radius.isNaN()) {
			throw new Error("Please enter a number");
		}
		double areaOfCircle = 3.14 * radius * radius;
		return areaOfCircle;
	}
}
