package mypack;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAddSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a date (dd/MM/yyyy): ");
        String input = sc.nextLine();

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      
        LocalDate date = LocalDate.parse(input, formatter);

     
        LocalDate plus30 = date.plusDays(30);

       
        LocalDate minus60 = date.minusDays(60);

       
        System.out.println("Original Date : " + date.format(formatter));
        System.out.println("After +30 Days: " + plus30.format(formatter));
        System.out.println("After -60 Days: " + minus60.format(formatter));

        sc.close();
    }
}

