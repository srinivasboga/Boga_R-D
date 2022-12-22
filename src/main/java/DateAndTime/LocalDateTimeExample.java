package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {

			LocalDateTime localDateTime = LocalDateTime.now();
			System.out.println("LocalDateTimeExample: "+localDateTime);
			
			LocalDateTime localDateTimeExample1 = LocalDateTime.now();
			System.out.println("LocalDateTimeExample: "+localDateTimeExample1.of(LocalDate.now(), LocalTime.now()));
			
			/*
			 * Calling LocalDateTime instance
			 * */
			
			System.out.println("Hour: "+localDateTime.getHour());
			System.out.println("Minute: "+localDateTime.getMinute());
			System.out.println("getDayOfMonth: "+localDateTime.getDayOfYear());
			System.out.println("DAY_OF_MONTH :"+localDateTime.get(ChronoField.DAY_OF_YEAR));
			System.out.println("DAY_OF_MONTH :"+localDateTime.get(ChronoField.DAY_OF_WEEK));
			
			
	}

}
