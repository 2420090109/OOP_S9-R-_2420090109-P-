package mypack;
import java.util.Scanner;
public class left_right_shift_oprtrs {
	public static void main(String[] args) {
		//Demonstrate left shift and right shift operations on an integer.
				int integer;
				  Scanner sc = new Scanner(System.in);
				    System.out.println("Enter a number: ");
				    integer = sc.nextInt();
				System.out.println("Left shift: " + (integer<<2));
			  System.out.println("Right Shift: " + (integer>>2));
	}

}
