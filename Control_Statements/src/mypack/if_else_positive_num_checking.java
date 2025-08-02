package mypack;

import java.util.Scanner;

public class if_else_positive_num_checking {

	public static void main(String[] args) {
		// Check if a number is positive.

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("Entered num is positive");
		} else if (n < 0) {
			System.out.println("Entered num is negative");
		} else {
			System.out.println("Entered num is ZERO");
		}

	}

}
