package mypack;

import java.util.Scanner;

public class while_loop_accept_num_until_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Accept numbers until user enters 0.
		Scanner sc = new Scanner(System.in);
		int i;
		do {
			System.out.print("Enter a number (0 to stop): ");
			i = sc.nextInt();
		} while (i != 0);
		System.out.print("Program ended.");
		sc.close();

	}

}
