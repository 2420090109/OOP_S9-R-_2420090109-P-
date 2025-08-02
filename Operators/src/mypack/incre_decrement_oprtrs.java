package mypack;
import java.util.Scanner;

public class incre_decrement_oprtrs {

	public static void main(String[] args) {
		//Demonstrate increment and decrement operators on a variable.
		   Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a number: ");
		    int v1 = sc.nextInt();
		    System.out.println("Increment : " + (++v1));
		    System.out.println("Enter a number: ");
		    int v2 = sc.nextInt();
		    System.out.println("Decrement : " + (--v2));

	}

}
