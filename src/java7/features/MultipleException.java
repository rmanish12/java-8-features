package java7.features;

public class MultipleException {
	
	// Before Java 7	
	public void getString() {
		try {
			
		} catch(NullPointerException npe) {
			npe.printStackTrace();
		} catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	// After Java 7
	public void returnString() {
		try {
			
		} catch(NullPointerException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
}
