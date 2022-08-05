package org.launchcode.java.demos.lsn1datatypes.exercises;
import java.util.Scanner;

public class Numerics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Length of rectangle?");
		Double length = input.nextDouble();
		System.out.println("Width of rectangle?");
		Double width = input.nextDouble();
		Double area = length * width;
		System.out.println("The area is " + area + "sq ft");
	}
}
