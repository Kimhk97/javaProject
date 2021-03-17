package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)		
				);
		
		studentList.stream()
			.mapToInt(Student :: getScore) //or s -> s.getScore (Student 형태의 s 변수를 어쩌구) IntStream != Stream<Integer>
			.forEach(score -> System.out.println(score)); //or System.out::prinln
	}
	
	int[] intAry = {};
	Integer[] integerAry = {};
	
	IntStream is = Arrays.stream(intAry); //IntStream 타입
	Stream<Integer> iss = Arrays.stream(integerAry); //Stream 클래스의 Integer 타입
}
	


//원문(을 줄여서 람다식으로 표현하면 위처럼 됨)
//	.mapToInt(new ToIntFunction<Student>() {
//		@Override
//		public int applyAsInt(Student s) {
//			sysout s.getScore()
//			return s.getScore(); s를 받아 getScore 메소드를 실행하겠다
//		}
//	})
//	
//	.forEach(new IntConsumer) {
//		@Override
//		public void accept (int value) {
//			sysout value;
//		}
//	}


