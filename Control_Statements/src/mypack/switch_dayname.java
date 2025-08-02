package mypack;

import java.util.Scanner;

public class switch_dayname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Display day name based on number (1–7).
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day_num(1-7): ");
		int day_num = sc.nextInt();
		switch (day_num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Input! Try again");
		}

	}

}
