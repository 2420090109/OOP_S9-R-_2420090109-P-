package mypack;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class LocalTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		LocalDate d1 = LocalDate.of(1999,8,1);
		System.out.println("LocalDate: " +d);
		System.out.println("FormattedDate: "+d1);
		LocalTime now = LocalTime.now();
		System.out.println("LocalTime: "+now);
		LocalTime lt = LocalTime.of(9, 8);
		System.out.println("FormattedTime: "+lt);
		LocalTime lt1 = LocalTime.of(20, 7);
		System.out.println("FormattedTime: "+lt1);
		Duration diff = Duration.between(lt, lt1);
		System.out.println("Duration: "+diff);
		System.out.println("Total hours: " + diff.toHours());
		System.out.println("Total Minutes: " + diff.toMinutes());
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(2025, 8,8,23,59);
		System.out.println("LocalDateTime: "+ldt1);
		System.out.println("LocalDateTimeFormatted: "+ldt2);
		Period p = Period.between(d, d1);
		System.out.println("Period: "+p);
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String formatted = dateTime.format(formatter);
		System.out.println("Formatted Date: " + formatted);
	}

}
