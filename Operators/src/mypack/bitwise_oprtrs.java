package mypack;
import java.util.Scanner;

public class bitwise_oprtrs {

	public static void main(String[] args) {
		
		// Demonstrate bitwise AND, OR, XOR, and complement operators on two numbers.
			int n1,n2;
				Scanner sc  = new Scanner(System.in);

	            System.out.print("Enter a binary number (e.g., 100): ");
	            String binaryInput = sc.nextLine();
				System.out.println("Enter number1 in binary form(bits): ");
				n1 = sc.nextInt();
				System.out.println("Enter number2 in binary form(bits): ");
				n2 = sc.nextInt();
				
		
		        int res_And = (n1&n2);
			    int res_Or = (n1|n2);
			    int res_Xor = (n1^n2);
		        System.out.println("Bitwise AND : " + res_And);
			    System.out.println("Bitwise OR : " + res_Or);
			    System.out.println("Bitwise XOR : " + res_Xor);
			   


			            StringBuilder complement = new StringBuilder();

			            for (int i = 0; i < binaryInput.length(); i++) {
			                char bit = binaryInput.charAt(i);
			                if (bit == '0') {
			                    complement.append('1');
			                } else if (bit == '1') {
			                    complement.append('0');
			                } else {
			                    System.out.println("Invalid binary input.");
			                    return;
			                }
			            }

			            System.out.println("Bitwise Complement: " + complement.toString());
			
		    }
}
