package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		
		/* 예외발생
		 * double avg = list.stream()
		 * .mapToInt(Integer :: intValue)
		 * .average()
		 * .getAsDouble();
		 */
		 
		
		//방법1
		OptionalDouble optional = list.stream() //Optional ~ : 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있음
				.mapToInt(Integer :: intValue)
				.average();
		
		if(optional.isPresent()) { //isPresent : 값이 저장되어 있는지 (T/F)
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}
		
		//방법2
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0); //값이 저장되어 있지 않을 경우 디폴트 값 지정
		System.out.println("방법2_평균: " + avg);
		
		//방법3
		list.stream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(a->System.out.println("방법3_평균: " + a)); //ifPresent : 값이 저장되어 있을 경우 Consumer에서 처리
	}

}
