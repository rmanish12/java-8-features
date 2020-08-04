package java8.defaultStaticMethod;

public interface Employee {
	
	final double PENSION_PERCENTAGE = 10.0;
	
	// these methods have to be overridden in the class implementing this interface
	double calculateSalary();
	
	double deductFoodFee();
	
	// this method need not be overridden in the class implementing this interface
	// we can provide the default implementation of the method here
	// the class implementing it may or may not override it
	default double deductHealthInsurancePremiun() {
		// default implementation of the method
		return 0.0;
	}
	
	// this is a static method and belongs to the interface only
	// cannot be overridden in the class implementing it
	// we can provide the implementation that is common to all the class implementing it
	static double deductionForPension(double empSalary) {
		return (empSalary * PENSION_PERCENTAGE)/100;
	}
}
