package mypack;
import java.util.Scanner;

public class logical_AND {

	public static void main(String[] args) {
		// Check if a student passed both theory and practical exams using logical AND.
				float theory_marks , practical_marks;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your theory marks: ");
				theory_marks = sc.nextFloat();
				System.out.println("Enter your practical marks: ");
				practical_marks = sc.nextFloat();
				if(theory_marks>=50 && practical_marks>=50)
				{
					System.out.println("Student Passed in both exams.");
					
				}else if(theory_marks<=50 && practical_marks>=50)
				{
					System.out.println("Student Passed only in practical exam.");
				}
				else if(theory_marks>=50 && practical_marks<=50) {
					System.out.println("Student Passed only in theory exam.");
				}else {
					System.out.println("Student failed in both exams");
				}

	}

}
