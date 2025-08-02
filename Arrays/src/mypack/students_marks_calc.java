package mypack;
import java.util.Scanner;

public class students_marks_calc {
	public static void main(String[] args) {
		// program to take student's six subject's marks and print the subject marks, total, average.
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int marks[] = new int[6];
		System.out.println("Enter 6 subjects marks: ");
		for(int i=0;i<6;i++) {
			marks[i] = sc.nextInt();
		}
		for(int i=0;i<6;i++) {
			System.out.println("Subject" + (i+1) + ": " + marks[i]);
			total += marks[i];
			
			
		}
		int avg = total / 6;
		System.out.println("Total marks : " + total);
		System.out.println("Average: " + avg);
	}
}
