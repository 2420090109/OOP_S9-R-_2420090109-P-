package mypack;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeek{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a date (dd/MM/yyyy): ");
        String input = sc.nextLine();

        // Define formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse input to LocalDate
        LocalDate date = LocalDate.parse(input, formatter);

        // Get day of week
        java.time.DayOfWeek day = date.getDayOfWeek();

        // Print result
        System.out.println("The day of the week is: " + day);

        sc.close();
    }
}
