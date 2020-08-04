package java8.defaultStaticMethod;

public class Main {

	public static void main(String[] args) {
		
		// USE CASE
		// 1. Two types of employees -> Full Time and Part Time
		// 2. Food fee deduction for all the employees depending on the individual employee
		// 3. Health Premium deduction -> only for Full Time Employee
		// 4. Pension deduction @10.0% for all the employees
		
		FullTimeEmployee ftm = new FullTimeEmployee();
		PartTimeEmployee ptm = new PartTimeEmployee();
		
		System.out.println("FULL TIME EMPLPOYEE");
		System.out.println(ftm.calculateSalary());
		System.out.println(ftm.deductHealthInsurancePremiun());
		
		System.out.println("PART TIME EMPLOYEE");
		System.out.println(ptm.calculateSalary());
		System.out.println(ptm.deductHealthInsurancePremiun());
		
	}
}
