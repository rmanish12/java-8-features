package java8.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Localdate {

	public void playWithLocalDate() {
		
		// current date
		LocalDate date = LocalDate.now();
		System.out.println("System specific date: " + date);
		
		// specific date
		LocalDate specificDate = LocalDate.of(2020, 10, 1);
		System.out.println("Particular date: " + specificDate);
		
		// adding months to the existing date
		LocalDate addedDate = date.plusMonths(4);
		System.out.println("Adding date, month and year: " + addedDate);
		
		// parsing sequence of character into date
		LocalDate parsedDate = LocalDate.parse("1900-01-01");
		System.out.println("Parsed date: " + parsedDate);
		
		// compares primarily date only
		System.out.println("Compare date: " + date.compareTo(specificDate));
		
		LocalDate lastDate = LocalDate.now().plusDays(3);
		System.out.println(lastDate);
		// compare dates
		if(date.isBefore(lastDate)) {
			System.out.println("Please submit the form");
		}
		
		// formatted date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Formatted date: " + date.format(formatter));
		
		
	}
	
}
