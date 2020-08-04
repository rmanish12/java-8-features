package java8.defaultStaticMethod;

public class PartTimeEmployee implements Employee {
	
	private double empSalary = 60000.0;
	
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
		return empSalary - pensionDeduction - deductFoodFee();
	}
	
	// no need to override the default method of interface
	// will implement the functionality defined in the default method of interface
	
}
