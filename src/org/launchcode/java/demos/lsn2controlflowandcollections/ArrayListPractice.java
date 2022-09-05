package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
				nums.add(i);
		}

		int sum = ArrayListPractice.sumAllEvenNumbers(nums);

		System.out.println(sum);
	}

	static int sumAllEvenNumbers(ArrayList<Integer> nums) {
		int total = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				total += num;
			}
		}
		return total;
	}
}


