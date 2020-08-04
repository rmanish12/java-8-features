package java7.features;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {

	
	private List<String> l1 = new ArrayList<String>();
	private List<String> l2 = new ArrayList<>();
	
	public void getList() {
		// Before Java 7
		
//		l1 = new ArrayList<String>();
		l1.add("abc");
		l1.add("cde");
		System.out.println("stringList: " + l1);
	}
	
	public void returnList() {
		// After Java 7
		
//		l2 = new ArrayList<>();
		l2.add("xyz");
		l2.add("pqr");
		System.out.println("Diamond operator list: " + l2);
	}
}
