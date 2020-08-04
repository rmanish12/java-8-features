package java8.defaultStaticMethod.exercise;

public class RegularCustomer implements Customer {

	private double grossPurchaseAmount = 15000;
	
	private final double DELIVERY_CHARGE = 100.0;
	
	@Override
	public double calculatePurchaseAmount() {
		// TODO Auto-generated method stub
		return grossPurchaseAmount + chargeOnDelivery() - Customer.issueGiftAmount(grossPurchaseAmount);
	}

	@Override
	public double chargeOnDelivery() {
		// TODO Auto-generated method stub
		return DELIVERY_CHARGE;
	}

}
