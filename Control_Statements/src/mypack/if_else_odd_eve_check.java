package mypack;

import java.util.Scanner;

public class if_else_odd_eve_check {

	public static void main(String[] args) {
		// Check if a number is even or odd.
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("Entered number is even.");
		} else {
			System.out.println("Entered number is odd.");
		}

	}

}
