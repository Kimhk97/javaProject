package streams;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");

		
		names.stream()
				.distinct() // 중복제거
				.forEach(n -> System.out.println(n));
		System.out.println(); //중복인 신용권만 x
		
		
		names.stream()
				.filter(n -> n.startsWith("신")) //신으로 시작하는 사람 필터링
				.forEach(n -> System.out.println(n));
		System.out.println(); //신씨인 사람들은 전부 (중복포함)
		
		
		names.stream()
				.distinct()
				.filter(n -> n.startsWith("신"))
				.forEach(n -> System.out.println(n)); //중복x 신씨 전부
	}

}
