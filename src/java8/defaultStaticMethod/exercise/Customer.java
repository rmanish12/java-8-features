package java8.defaultStaticMethod.exercise;

public interface Customer {

	double calculatePurchaseAmount();
	
	double chargeOnDelivery();
	
	default double discount() {
		return 0.0;
	}
	
	static double issueGiftAmount(double purchaseAmount) {
		if(purchaseAmount > 20000) {
			return 2000;
		} else if(purchaseAmount > 10000 && purchaseAmount <= 20000) {
			return 1000;
		} else {
			return 500;
		}
	}
}
