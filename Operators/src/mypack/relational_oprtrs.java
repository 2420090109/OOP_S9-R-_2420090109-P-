package mypack;
import java.util.Scanner;

public class relational_oprtrs {
	//Compare two integers and display which one is greater or if they are equal.
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int p,q;
			System.out.println("Enter 1st number:");
			p=sc.nextInt();
			System.out.println("Enter 2nd number:");
			q=sc.nextInt();
			if(p>q) {
				System.out.println(p + " is greater");
				
				}else if(q>p) {
			System.out.println(q + " is greater");
				}else {
			System.out.println(p + " and " + q + " are equal");
				}

		}
}

