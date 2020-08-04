package java8.defaultStaticMethod;

public class FullTimeEmployee implements Employee {

	private double empSalary = 60000.0;
	
	private final double HEALTH_INSURANCE_PREMIUM = 5.0;
	
	// calling static method of interface
	private double pensionDeduction = Employee.deductionForPension(empSalary);
	@Override
	public double deductFoodFee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return empSalary - pensionDeduction - deductFoodFee() - deductHealthInsurancePremiun();
	}
	
	// overriding default method of interface
	@Override
	public double deductHealthInsurancePremiun () {
		return (empSalary * HEALTH_INSURANCE_PREMIUM)/100;
	}

}
