package streams;

import java.util.Arrays;
import java.util.List;

import collections.Student;

public class FilterExample {
	public static void main(String[] args) {
		List<Member> members = Arrays.asList(
				new Member("홍길동", Member.MALE, 30), 
				new Member("정재현", Member.FEMALE, 25), 
				new Member("홍길동", Member.MALE, 30)
				);

		
		members.stream()
				.distinct() // 중복제거...인데 new Member는 주소값이 다 달라서 중복 제거를 할 수 없음
				.forEach(System.out::println);
		
		
	} //그러니까 hashCode랑 equals를 이용해서 주소값이 달라도 논리적으로 같은 값이라는 걸 인증해줘야 함
	 
}
