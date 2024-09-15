package DateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date: "+localDate);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2022, 365);
			System.out.println("Accurate Date: "+localDate2);
		
			System.out.println(localDate.getMonth());
			System.out.println(localDate.getMonthValue());
			System.out.println(localDate.getDayOfMonth());
			System.out.println(localDate.getDayOfYear());
			System.out.println(localDate.getDayOfWeek());
			System.out.println(localDate.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
			System.out.println(localDate.getChronology());
			
			/* Modifying local Date*/
			
			System.out.println("plusDays: "+localDate.plusDays(2));
			System.out.println("plusMonths: "+localDate.plusMonths(1));
			System.out.println("minusDays: "+localDate.minusDays(2));
			System.out.println("WithYear :"+localDate.withYear(2032));
			System.out.println("withChronoField: "+localDate.with(ChronoField.YEAR, 2032));
			System.out.println("withTemporal Adjusters: "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
			
			System.out.println(localDate.toEpochDay());

			//write new date operations
		DateOperations dateOperations = new DateOperations();
		dateOperations.dateOperations(localDate);
		System.out.println(localDate);

		//write to find out if its a leap year
		
		LeapYear leapYear = new LeapYear();
		leapYear.leapYear(localDate);
			
	}

}
