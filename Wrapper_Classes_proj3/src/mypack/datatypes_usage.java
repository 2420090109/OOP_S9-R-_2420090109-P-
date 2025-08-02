package mypack;

public class datatypes_usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


        // Integer types
        byte age = 20;                // small age value
        short year = 2025;            // year of joining
        int studentId = 123456;       // ID
        long phoneNumber = 9876543210L; // long phone number

        // Floating-point types
        float height = 5.9f;          
        double cgpa = 9.27;           

        // Character type
        char grade = 'A';            

        // Boolean type
        boolean isPassed = true;

        // String type (non-primitive)
        String name = "Musaib";
        String branch = "Computer Science and Information Technology";

        // Displaying student info
        System.out.println("----- Student Information -----");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Year of Joining: " + year);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Height: " + height + " feet");
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
    }
}

