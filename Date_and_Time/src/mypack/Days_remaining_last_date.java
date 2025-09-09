package mypack;

import java.time.*;

public class Days_remaining_last_date {
    public static void main(String[] args) {
       
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        
        LocalDate lastDate = LocalDate.of(today.getYear(), 12, 31);
        System.out.println("Last Date of Current Year: " + lastDate);

        
        int totalDays = 0;
        LocalDate temp = today;
        while (!temp.isEqual(lastDate)) {
            temp = temp.plusDays(1);  
            totalDays++;
        }

        System.out.println("Total Days Remaining : " + totalDays);
    }
}


