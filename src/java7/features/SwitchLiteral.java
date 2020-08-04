package java7.features;

public class SwitchLiteral {
	
	// Prior to Java 7
	public void getItem(String item) {
		if(item.equals("Mobile")) {
			System.out.println("Item is Mobile");
		} else if(item.equals("IPad")) {
			System.out.println("Item is IPad");
		} else {
			System.out.println("Something else..");
		}
	}
	
	// After Java 7
	public void returnItem(String item) {
		switch(item) {
		case "Mobile":
			System.out.println("Literal Item is Mobile");
			break;
			
		case "Ipad":
			System.out.println("Literal Item is IPad");
			break;
			
		default:
			System.out.println("Literal Something else..");
		}
	}
	
}
