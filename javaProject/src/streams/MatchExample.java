package streams;

import java.util.Arrays;

public class MatchExample {
	public static void main(String[] args) {
		int[] intAry = { 2, 4, 6 };
		
		boolean result = Arrays.stream(intAry)
				.allMatch(a -> a%2==0);
		System.out.println("모두 2의 배수인가?: " + result);
		
		result = Arrays.stream(intAry)
				.anyMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 있는가?: " + result);
		
		result = Arrays.stream(intAry)
				.noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 없는가?: " + result);
	}

}
