package stream;

import java.util.Arrays;
import java.util.List;

public class StreamOddEvenSum {
	public static void main(String[] args) {
		List<Integer> evenNumber = Arrays.asList(100, 200, 300, 400, 600);
		int evenNumberSum = evenNumber.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(evenNumberSum);

		List<Integer> OddNumber = Arrays.asList(99, 201, 299, 401);
		int oddNumberSum = OddNumber.stream().filter(x -> x % 2 != 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(oddNumberSum);

		System.out.println(evenNumberSum + oddNumberSum);
	}

}
