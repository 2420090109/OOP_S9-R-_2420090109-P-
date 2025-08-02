package mypack;

import java.util.Scanner;

public class for_loop_print_nums_1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print numbers from 1 to N.
		System.out.println("Enter last limit number: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println("USing for loop: ");
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		System.out.println("USing while loop: ");
		int i = 1;
		while (i != N + 1) {
			System.out.println(i);
			i++;
		}

	}

}
