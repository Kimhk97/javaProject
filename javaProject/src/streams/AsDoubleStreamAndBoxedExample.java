package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };

		IntStream is = Arrays.stream(intAry);
		is
		.asDoubleStream() //(new IntConsumer) -> (new DoubleConsumer)
		.forEach(d -> System.out.println(d)); 

		System.out.println();

		is = Arrays.stream(intAry);
		is
		.boxed() //Stream<Integer> 생성
		.forEach(obj -> System.out.println(obj.intValue())); 
	}
}
