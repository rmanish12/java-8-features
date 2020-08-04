package java8.dateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zoneddatetime {

	public void playWithZonedDateTime() {
		
		// current date time of your zone
		ZonedDateTime currentTimeInIndia = ZonedDateTime.now();
		System.out.println("Current date time in my zone: " + currentTimeInIndia);
		
		ZonedDateTime currentTimeInEurope = ZonedDateTime.now(ZoneId.of("Europe/Athens"));
		System.out.println("Current date time in Europe: " + currentTimeInEurope);
		
	}
	
}
