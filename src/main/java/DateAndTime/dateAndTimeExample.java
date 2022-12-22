package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dateAndTimeExample {

	private final static Logger myLogger = Logger.getLogger(dateAndTimeExample.class.getName());
	
	
	public static void main(String[] args) {
	
		
		
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate: "+localDate);
		
		myLogger.log(Level.SEVERE, "localDateTime");
		
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime: "+localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTimeExample: "+localDateTime);
		
		
	}

}
