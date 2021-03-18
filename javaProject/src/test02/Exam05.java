package test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;

public class Exam05 {
	private static Collection<Employee> emps;
	
	public static void main(String[] args) {
		List<Employee> empList = emps.stream();
				
		double avg = empList.stream()				 
				.mapToInt(Employee :: getSalary)
				.average()
				.getAsDouble();
		
		System.out.println("전체 사원의 평균 급여: " + avg);	

	}
}

