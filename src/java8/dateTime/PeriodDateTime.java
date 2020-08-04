package java8.dateTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDateTime {

	public void playWithPeriod() {
		
		LocalDate now = LocalDate.now();
		LocalDate parsedDate = LocalDate.of(2019, 11, 23);
		
		Period period = Period.between(now, parsedDate);
		System.out.println("Period: " + period.getYears() + " " + period.getMonths() + " " + period.getDays());
		
	    Period period1 = Period.of(1, 5, 2001);
	    System.out.println(period1.getDays() + "\t" + period1.getMonths());
		
	}
	
}
