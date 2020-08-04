package java8.dateTime;

import java.time.LocalTime;

public class Localtime {

	public void playWithLocalTime() {
		
		// current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time: " + currentTime);
		
		// creating a particular time
		LocalTime particularTime = LocalTime.of(10, 5, 35);
		System.out.println("Particular time: " + particularTime);
		
		// get a copy of LocalTime after adding values
		LocalTime addedTime = currentTime.plusHours(5);
		System.out.println("Added time: " + addedTime);
		
		// parsing a sequence of character to time
		LocalTime parsedTime = LocalTime.parse("11:43:56");
		System.out.println("Parsed time: " + parsedTime);
		
		// comparing time
		System.out.println("Compare time: " + currentTime.compareTo(addedTime));
	}
	
}
