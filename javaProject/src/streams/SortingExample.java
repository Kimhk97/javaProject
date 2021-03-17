package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingExample {
	public static void main(String[] args) {
		IntStream is = Arrays.stream(new int[] { 5, 4, 3, 2, 1 });
		is.sorted().forEach(n -> System.out.println(n + ", "));
		System.out.println();

		Student[] stdAry = { new Student("h", 10), new Student("p", 30), new Student("k", 50) };

		Stream<Student> st = Arrays.stream(stdAry);
		st.sorted().forEach(s -> System.out.println(s.getScore() + ", "));

	}
}
