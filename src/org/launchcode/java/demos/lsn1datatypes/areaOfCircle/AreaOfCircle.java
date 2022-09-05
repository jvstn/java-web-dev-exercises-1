package org.launchcode.java.demos.lsn1datatypes.areaOfCircle;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Enter radius: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		System.out.println("Area of the circle is: " + Circle.getArea(radius));
	}
}
