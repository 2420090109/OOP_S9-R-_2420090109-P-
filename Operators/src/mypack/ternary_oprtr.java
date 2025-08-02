package mypack;
import java.util.Scanner;

public class ternary_oprtr {

	public static void main(String[] args) {
		 //Find the greater of two numbers using a ternary operator.
	    int num1,num2;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter 2 numbers: ");
	    num1 = sc.nextInt();
	    num2 = sc.nextInt();
	    int result = (num1>num2)? (num1) : (num2);
	    System.out.println("(Ternary Operator) Greatest is : " + result);
	}

}
