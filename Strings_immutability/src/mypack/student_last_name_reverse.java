package mypack;
import java.util.Scanner;

public class student_last_name_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		        System.out.print("Enter full name: ");
		        StringBuffer fullName = new StringBuffer(sc.nextLine());

		        int lastSpaceIndex = fullName.lastIndexOf(" ");
		        if (lastSpaceIndex == -1) {
		            System.out.println("Please enter at least first and last name.");
		        } else {
		           
		            StringBuffer lastName = new StringBuffer(fullName.substring(lastSpaceIndex + 1));

		            lastName.reverse();

		          
		            fullName.replace(lastSpaceIndex + 1, fullName.length(), lastName.toString());

		            System.out.println("Modified Name: " + fullName);
		        }
		        sc.close();
		   

	}

}
