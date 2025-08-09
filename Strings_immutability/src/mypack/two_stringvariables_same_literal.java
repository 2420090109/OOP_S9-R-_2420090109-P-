package mypack;

public class two_stringvariables_same_literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program where two String variables refer to the same literal. Change one variable’s value.
		//Print both variables and explain the output.
		
		        String str1 = "Hello"; 
		        String str2 = "Hello"; 

		        System.out.println("Before change:");
		        System.out.println("str1: " + str1);
		        System.out.println("str2: " + str2);

		   
		        str1 = "World"; 

		        System.out.println("\nAfter change:");
		        System.out.println("str1: " + str1);
		        System.out.println("str2: " + str2);
		    
	}

}
