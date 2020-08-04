package java8.defaultStaticMethod.exercise;

public class PrivilegedCustomer implements Customer{
	
	private double grossPurchaseAmount = 25000.0;
	
	private final double DELIVERY_CHARGE = 100.0;
	
	private final double DISCOUNT_PERCENTAGE = 5.0;

	@Override
	public double calculatePurchaseAmount() {
		// TODO Auto-generated method stub
		return grossPurchaseAmount + chargeOnDelivery() -  discount() - Customer.issueGiftAmount(grossPurchaseAmount);
	}

	@Override
	public double chargeOnDelivery() {
		// TODO Auto-generated method stub
		return DELIVERY_CHARGE;
	}
	
	@Override
	public double discount() {
		return (grossPurchaseAmount*DISCOUNT_PERCENTAGE)/100;
	}

}
