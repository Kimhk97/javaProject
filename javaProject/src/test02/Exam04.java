package test02;

import java.util.Arrays;
import java.util.List;


public class Exam04 {
	public static void main(String[] args) {
		List<String> student = Arrays.asList(
				new String("이름", Student.engScore, Student.mathScore), 
				new String("이름", Student.engScore, Student.mathScore), 
				new String("이름", Student.engScore, Student.mathScore)
				);

		
		student.stream()
				.filter(n -> n.(engScore + mathScore) < 100)
				.forEach(System.out::println);

	}
}


