package java8.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// USING LAMBDA EXPRESSION FOR FUNCTIONAL INTERFACE
		StringFormatterInterface sf = (s1, s2) -> s1 + " - " + s2;
		System.out.println(sf.formatString("Hello", "World"));
		
		AddNumberInterface addNumber = (a, b) -> a+b;
		System.out.println(addNumber.add(5, 10));
		
		// earlier used way
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread initialized inside Runnable");
			}
		});
		
		t1.run();
		
		// with lambda expression
		Thread t = new Thread(() -> System.out.println("Thread initialized inside Lambda"));
		t.run();
		
		// another example of passing lambda expression as an argument
		List<Person> persons = Arrays.asList(
					new Person("Jack", "Daniel", 69),
					new Person("Charles", "Dickens", 72),
					new Person("Lewis", "Hamilton", 65),
					new Person("Sachin", "Tendulkar", 45)
				);
		
		System.out.println("Printing filtered person with lastName starting with D");
		filterPerson(persons, p -> p.getLastName().startsWith("D"));
		
		System.out.println("Printing filtered persons with age greater than 65");
		filterPerson(persons, p -> p.getAge() > 65);
		
		// traversing collections using forEach loop
		// an implementation of lambda expressions
		
		System.out.println("Traversing collection using for Each");
		persons.forEach(p -> System.out.println(p));
	
	}
	
	public static void filterPerson(List<Person> persons, FilterPerson filterCriteria) {
		for(Person p: persons) {
			if(filterCriteria.test(p)) {
				System.out.println(p);
			}
		}
	};

}
