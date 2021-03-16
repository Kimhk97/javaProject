package streams;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
				);
		double ageAvg = list.stream() //흐름에 따라 걸러내
				.filter(m -> m.getSex() == Member.MALE) //sex에 male인 사람
				.mapToInt(Member :: getAge) //그럼 그 때 age를 뽑아와서
				.average() //평균을 내
				.getAsDouble(); //double 타입으로
		
		System.out.println("남자 평균 나이: " + ageAvg);
	
		double avg = list.stream()				 
				.mapToInt(Member :: getAge)
				.filter(a -> a >= 30)
				.average()
				.getAsDouble();
		
		System.out.println("30세 이상 평균 나이: " + avg);	
	}

}
