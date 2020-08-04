package java8.lambdaExpression;

@FunctionalInterface
public interface FilterPerson {
	boolean test(Person person);
}
