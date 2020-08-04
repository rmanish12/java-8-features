package java7.features;

public class Main {
	
	private static String item = "Mobile";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwitchLiteral switchLiteral = new SwitchLiteral();
		DiamondOperator diamond = new DiamondOperator();
		TryWithResource resource = new TryWithResource();
		
		switchLiteral.getItem(item);
		switchLiteral.returnItem(item);
		
		diamond.getList();
		diamond.returnList();
		
		resource.getString();
		resource.returnString();
	}
}
