package mypack;

public class print_static_values {
		public static void main(String[] args) {
			//program to print elements with static values
			        
			        int[] marks = {85, 90, 78, 92, 88};

			        System.out.println("---- Student Marks ----");

			        
			        for (int i = 0; i < marks.length; i++) {
			            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
			        }
			  

		}
}
