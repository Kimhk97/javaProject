package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class FunctionalExample1 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static void printString(Function<Student, String> function) { // printString : 클래스를 매개값으로 받아 value 추출
		for (Student student : list) { // list에 저장된 항목 수만큼 루핑
			System.out.println(function.apply(student) + " "); // 람다식 실행
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.println(function.applyAsInt(student) + " "); // 람다식 실행
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t -> t.getName());

		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());

		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
		printInt((value) -> value.getMathScore()); // 람다표현식

		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		Stream<Employee> stream = list.stream();
		stream.mapToInt((value -> value.getSalary())
				.filter(new IntPredictae() {
					@Override
					public boolean test(int value) {
						return value > 5000;
					}
				}).forEach((t) -> {
			System.out.println(t.getFirstName() + ", " + t.getSalary());
		});
	

	}
}
