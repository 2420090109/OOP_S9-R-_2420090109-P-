package mypack;

import java.util.Scanner;

public class if_else_grade_student {
	public static void main(String[] args) {

		// Grade a student based on marks.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's Marks: ");
		float Marks = sc.nextFloat();
		if (Marks >= 90) {
			System.out.println("A Grade.");
		} else if (Marks <= 50 && Marks >= 30) {
			System.out.println("B Grade");
		} else {
			System.out.println("Fail");
		}
	}

}
