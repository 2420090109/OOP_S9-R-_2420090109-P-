package mypack;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter your birth date (dd/MM/yyyy): ");
        String input = sc.nextLine();

      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        
        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate today = LocalDate.now();

     
        Period age = Period.between(birthDate, today);

        
        System.out.println("Your Birth Date: " + birthDate);
        System.out.println("Today's Date   : " + today);
        System.out.println("Exact Age      : " + age.getYears() + " years, " +
                           age.getMonths() + " months, " +
                           age.getDays() + " days");
        
        sc.close();
    }
}
