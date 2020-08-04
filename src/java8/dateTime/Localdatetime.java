package java8.dateTime;

import java.time.LocalDateTime;

public class Localdatetime {

	public void playwithLocalDateTime() {
		
		// LocalDateTime() method gives us date and time without timezone
		
		// current date time
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current date time: " + current);
		
		// adding days
		LocalDateTime addedDateValue = current.plusDays(5);
		System.out.println("Added date value: " + addedDateValue);
	}
	
}
