package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = Arrays.asList(
					new Person("Sachin", "Tendulkar", 45),
					new Person("Virat", "Kohli", 35),
					new Person("MS", "Dhoni", 40),
					new Person("Rohit", "Sharma", 37),
					new Person("Virendra", "Sehwag", 42)
				);
		
		// using stream to print each person detail	
		System.out.println("Printing all persons");
		persons
			.stream()
			.forEach(p -> System.out.println(p));
		
		// using stream to filter records and then print using chaining
		System.out.println("Printing filtered persons");
		persons
			.stream()
			.filter(p -> p.getAge() > 35)
			.forEach(System.out::println);
		
		// using stream to filter and sort (reverse order on last name) and then print
		System.out.println("Printing filtered persons in sorted order");
		persons
			.stream()
			.filter(p -> p.getLastName().startsWith("S"))
			.sorted((p1, p2) -> p2.getAge() - p1.getAge())
			.forEach(System.out::println);
		
		int[] numbers = {10, 25, 33, 42, 56};
		
		// converting array to stream
		System.out.println("Converting array into stream and performing operations");
		Arrays.stream(numbers)
			.filter(n -> n%5 == 0)
			.forEach(System.out::println);
			
		// using .map() method to perform operation
		// and collect the result stream as list
		System.out.println("Using map method on list of Persons");
		List<Person> personMap =  persons
									.stream()
									.map(p -> {
										p.setAge((p.getAge()/2));
										return p;
									})
									.collect(Collectors.toList());
		
		personMap.forEach(System.out::println);
		
		// creating stream of strings
		Stream<String> msg = Stream.of("Java 8", " in", " action");
		msg.forEach(System.out::print);
		
		// STREAMS CAN BE OPERATED ON ONLY ONCE!!!
		// using the stream after it has been operated will throw an error
//		msg.forEach(System.out::print);
		
		// using parallelStream()
		// which helps in multi-threading
		System.out.println("Using parallel Stream");
		persons
			.parallelStream()
			.filter(p -> p.getLastName().startsWith("S"))
			.sorted((p1, p2) -> p2.getAge() - p1.getAge())
			.forEach(System.out::println);
	}

}
