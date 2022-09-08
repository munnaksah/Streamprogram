package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamTest {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(100, 200, 300, 300, 500, 600, 401, 95, 97);
		List<Integer> distinctNumber = number.stream().map(i -> i).distinct().collect(Collectors.toList());
		// System.out.println(distinctNumber);

		List<Integer> squareNumber = number.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		// System.out.println(distinctNumber.stream().map(i -> i *
		// i).collect(Collectors.toList()));
		// System.out.println(squareNumber);
		// squareNumber.forEach(y -> System.out.println(y));

		// System.out.println(number.stream().sorted().collect(Collectors.toList()));

		int evenNumberSum = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		// System.out.println(evenNumberSum);

		List<String> nameList = Arrays.asList("shekhar", "uma", "ram", "sanjay");
		List<String> nameWiths = nameList.stream().filter(name -> name.startsWith("s")).collect(Collectors.toList());
		System.out.println(nameWiths);
	}

}
