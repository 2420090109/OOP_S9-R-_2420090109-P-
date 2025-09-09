package mypack;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EventCountDown{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the event date (dd/MM/yyyy): ");
        String input = sc.nextLine();

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       
        LocalDate eventDate = LocalDate.parse(input, formatter);
        LocalDate today = LocalDate.now();

      
        int days = 0;
        LocalDate temp = today;

        if (eventDate.isAfter(today)) {
            while (!temp.isEqual(eventDate)) {
                temp = temp.plusDays(1);
                days++;
            }
            System.out.println("The event is in " + days + " days.");
        } else if (eventDate.isBefore(today)) {
            while (!temp.isEqual(eventDate)) {
                temp = temp.minusDays(1);
                days++;
            }
            System.out.println("The event was " + days + " days ago.");
        } else {
            System.out.println("The event is today!");
        }

        sc.close();
    }
}

