import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//streams are wrappers around a data source, allowing us to operate with that data source
//and making bulk processing convenient and fast
public class StreamEx01 {

	public static void main(String[] args) {

		// converting array to stream
		Stream<Employee> arrayStream = Stream.of(arrayOfEmps);
			
		// Iterating stream using for each
		arrayStream.forEach(vicky-> System.out.println(vicky.getEmpName()));
		
		
		
		// converting array to list
		List<Employee> empList = Arrays.asList(arrayOfEmps);
		// Iterating list using for each
		empList.forEach(x -> System.out.println(x.getEmpId()));
		
		
		
		// converting list to stream
		Stream<Employee> listStream = empList.stream();
		listStream.forEach(z -> System.out.println(z.getSalary()));
		// create a list of integers
		
		
		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// The map method is used to returns a stream
		// consisting of the results of applying the given function
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Sollection", "Stream");

		// The filter method is used to select elements
		// as per the Predicate passed as argument.
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		// converting list to set using collect method
		Set<Integer> squareSet = numbers.stream().map(x -> x ).collect(Collectors.toSet());
		System.out.println(squareSet);
	}

	private static Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0),
			new Employee(2, "Bill Gates", 200000.0), new Employee(3, "Mark Zuckerberg", 300000.0) };
}
