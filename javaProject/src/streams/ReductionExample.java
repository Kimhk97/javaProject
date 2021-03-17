package streams;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("J", 90),
				new Student("K", 49),
				new Student("D", 100));
		
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore) //Student에서 getScore 가져와
				.sum(); //다 합쳐
		
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a, b) -> a+b) //만약 a랑 b가 있으면 그걸 a+b 해
				.get(); //그걸 뽑아내
		
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a+b); //초기값 0을 리턴해. 만약 a랑 b가 있으면 a+b해
				
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		studentList.stream()
		.mapToDouble(Student :: getScore)
		.average()
		.ifPresent(a -> System.out.println("평균: " + a));
	}

}
