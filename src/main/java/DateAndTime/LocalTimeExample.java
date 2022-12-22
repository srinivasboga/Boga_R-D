package DateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class LocalTimeExample {

	public static void main(String[] args) {
		
			LocalTime localTime = LocalTime.now();
			System.out.println("LocalTime: "+localTime);
		
			LocalTime localTime1 = LocalTime.of(10, 22);
			System.out.println("LocalTime1: "+localTime1);
			
			LocalTime localTime2 = LocalTime.of(10, 22, 22);
			System.out.println("LocalTime1: "+localTime2);
			
			LocalTime localTime3 = LocalTime.of(10, 22, 22, 22222222);
			System.out.println("LocalTime1: "+localTime3);
			
			/*
			 * getting values from local time itself
			 * */
			
			System.out.println("getHour: "+localTime.getHour());
			System.out.println("getMinute: "+localTime.getMinute());
			
			System.out.println("ChronoField: "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
			System.out.println("toSecondOfDay: "+localTime.get(ChronoField.SECOND_OF_DAY));
			
			/*
			 * Modify Values of LocalTime
			 * */
			
			System.out.println("minusHour: "+localTime.minusHours(2));
			System.out.println("ChronoUnit: "+localTime.minus(2, ChronoUnit.HOURS));
			
			System.out.println("MIDNIGHT: "+localTime.with(localTime.MIDNIGHT));
			System.out.println("HOURS OF THE DAY: "+localTime.with(ChronoField.HOUR_OF_DAY, 20));
			
			System.out.println("plusMinutes: " +localTime.plusMinutes(20));
			System.out.println("withHour: "+localTime.withHour(10));
			
			
	}

}
