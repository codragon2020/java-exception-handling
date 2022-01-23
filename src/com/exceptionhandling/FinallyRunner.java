package com.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);

			int[] numbers = { 23, 3, 4, 5 };
			int number = numbers[2];


		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before Scanner close");
			if (scanner != null) {
				scanner.close();
			}
		}

		System.out.println("Before closing out main");
	}
}
