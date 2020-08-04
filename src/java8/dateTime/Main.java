package java8.dateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		getDateOnly();
		
		// LOCAL DATE
		Localdate localDate = new Localdate();
		localDate.playWithLocalDate();
		
		System.out.println("****************");
		
		Localtime localTime = new Localtime();
		localTime.playWithLocalTime();
		
		System.out.println("****************");
		
		Localdatetime localDateTime = new Localdatetime();
		localDateTime.playwithLocalDateTime();
		
		System.out.println("****************");
		
		Zoneddatetime zonedDateTime = new Zoneddatetime();
		zonedDateTime.playWithZonedDateTime();
		
		System.out.println("****************");
		
		PeriodDateTime period = new PeriodDateTime();
		period.playWithPeriod();
		
	}
	
	// OLD WAY
//	public static void getDateOnly() {
//		Date date = new Date();
//		
//		date.setDate(9);
//		date.setMonth(8);
//		date.setYear(2020);
//		System.out.println(date);
//	}

}
