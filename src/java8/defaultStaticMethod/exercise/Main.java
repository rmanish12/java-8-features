package java8.defaultStaticMethod.exercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivilegedCustomer pc = new PrivilegedCustomer();
		
		System.out.println("PRIVILEGED CUSTOMER");
		System.out.println(pc.calculatePurchaseAmount());
		
		RegularCustomer rc = new RegularCustomer();
		
		System.out.println("REGULAR CUSTOMER");
		System.out.println(rc.calculatePurchaseAmount());
	}

}
