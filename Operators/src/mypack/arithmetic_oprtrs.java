package mypack;
import java.util.Scanner;

public class arithmetic_oprtrs {

	public static void main(String[] args) {
		//addition, subtraction, multiplication, division, and modulus of two numbers
				int a,b;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 1st number:");
				a=sc.nextInt();
				System.out.println("Enter 2nd number:");
				b=sc.nextInt();
				System.out.println("Addition : " + (a+b));
				System.out.println("Subtraction : " + (a-b));
				System.out.println("Multiplication : " + (a*b));
				System.out.println("Division : " + (a/b));
				System.out.println("Modulus : " + (a%b));

	}

}
