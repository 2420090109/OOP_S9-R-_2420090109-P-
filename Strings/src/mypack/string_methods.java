package mypack;
import java.util.Scanner;
public class string_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to work with multiple string methods.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String1: ");
		String str = sc.nextLine();
		System.out.println("Enter your String2: ");
		String str2 = sc.nextLine();
		//length();
		System.out.println("Length method (usage) : " + str.length());
		//charAt(int index);
		System.out.println("charAt(int index) method (usage) : " + str.charAt(0));
		// substring(int beginIndex)
		System.out.println("Substring method - Lastname of a student: " + str.substring(5));
		//substring(int beginIndex, int endIndex)
		System.out.println("substring(int beginIndex, int endIndex) method: " + str.substring(2,6));
		//equals(String anotherString)
		boolean isEqual = str.equals(str2);
		System.out.println("equals method: isEqual = " + isEqual);
		//equalsIgnoreCase(String anotherString)
		boolean isEqual1 = str.equalsIgnoreCase(str2);
		System.out.println("equalsIgnoreCase method: isEqual= " + isEqual1);
		//compareTo(String anotherString)
		String str1 = "apple";
		String str21 = "banana";
		String str3 = "apple";

		int result1 = str1.compareTo(str21); 
		int result2 = str21.compareTo(str1); 
		int result3 = str1.compareTo(str3); 
		System.out.println("Comp method: " + result1);
		System.out.println("Comp method: " + result2);
		System.out.println("Comp method: " + result3);
		
		// compareToIgnoreCase(String anotherString)
		String str11 = "apple";
		String str20 = "banana";
		String str30 = "Apple";

		int result11 = str11.compareTo(str20); 
		int result22 = str20.compareTo(str11); 
		int result33 = str11.compareTo(str30); 
		System.out.println("compareToIgnoreCasemethod : " + result11);
		System.out.println("compareToIgnoreCasemethod : " + result22);
		System.out.println("compareToIgnoreCasemethod : " + result33);
		
		//contains(CharSequence s)
		String mainString = "Programming Java in JDK Java is fun";
		boolean containsJava = mainString.contains("Java"); 
		boolean containsPython = mainString.contains("Python");
		System.out.println("contains(CharSequence s) method: " + containsJava);
		System.out.println("contains(CharSequence s) method: " + containsPython);
		
		//startsWith(String prefix)
		
		boolean res = mainString.startsWith("Programming");
		 System.out.println("startsWith(String prefix) method: " + res);
		 boolean res1 = mainString.startsWith("Java");
		 System.out.println("startsWith(String prefix) method: " + res1);
		 
		 //endsWith(String suffix)
		 boolean re = mainString.endsWith("fun");
		 System.out.println("endsWith(String suffix) method: " + re);
		 
		 //. indexOf(String str)
		  String searchString1 = "Java";
	        String searchString2 = "Python";

	        int index1 = mainString.indexOf(searchString1);
	        int index2 = mainString.indexOf(searchString2);

	        System.out.println("Index of '" + searchString1 + "': " + index1); 
	        System.out.println("Index of '" + searchString2 + "': " + index2); 
	        
	        //lastIndexOf(String str)
	        int index = mainString.lastIndexOf("Java");
	        System.out.println("Last occurrence of 'Java' is at index: " + index);
		
		// trim()
	        String sample = "       Welcome to Java       ";
	        String trimmedString = sample.trim();
	        System.out.println("Trimmed String: '" + trimmedString + "'");
	        
	        //replace(char oldChar, char newChar)
	        String originalString = "hello world";
	        char oldChar = 'o';
	        char newChar = 'x';

	        // Replace all occurrences of 'o' with 'x'
	        String newString = originalString.replace(oldChar, newChar);

	        System.out.println("Original String: " + originalString);
	        System.out.println("New String: " + newString); 
		
	        
	        //replaceAll(String regex, String replacement)
	        String origString = "The quick brown fox jumps over the lazy dog. The fox is cunning.";
	        String newestString = origString.replaceAll("fox", "cat"); 
	      System.out.println("replaceAll(String regex, String replacement) Method: " + newestString); 

	      
	      //replaceFirst(String regex, String replacement)
	      String String_old = "apple banana apple orange";

	        
	        String newString1 = String_old.replaceFirst("apple", "grape");
	        System.out.println("After first replacement: " + newString1);
	  
	        //toLowerCase()
	        //toUpperCase()
	        String name = "MUSAIB";
	        String name_new = name.toLowerCase();
	        System.out.println("LowerCase name: " + name_new);
	        String fname = "syed";
	        String name_newest = fname.toUpperCase();
	        System.out.println("UpperCase fname: " + name_newest);
	        
	        
	        // toCharArray()
	        String givenString = "Java Programming";

	        char[] charArray = givenString.toCharArray();

	        // Print the elements of the character array
	        System.out.println("Characters in the array:");
	        for (char c : charArray) {
	            System.out.println(c + " ");
	        }
	        
	        
	        String x = ""; 
	        String y = "Hello"; 
	        String z = " "; 

	        System.out.println("Is x empty? " + x.isEmpty()); 
	        System.out.println("Is y empty? " + y.isEmpty()); 
	        System.out.println("Is z empty? " + z.isEmpty());
	        
		
	        //valueOf(anyType)
	        int primitiveInt = 100;
            Integer wrappedInt = Integer.valueOf(primitiveInt); 
            System.out.println("Wrapped Integer: " + wrappedInt);
		
		

	}

}
