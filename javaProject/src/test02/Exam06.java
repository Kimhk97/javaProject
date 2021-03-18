package test02;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Exam06 {
	private static Collection<Employee> emps;

	public static void main(String[] args) {
		List<Employee> empList = emps.stream()
			.filter(e -> e.getJobId().equals("IT_PROG"))
			.collect(Collectors.toList());
			
		double avg = empList.stream()
			.mapToInt(Employee :: getSalary)
			.average()
			.getAsDouble()
			.orElse(0.0);
		
		System.out.println("IT_PROG 직무 직원들의 평균 급여: " + avg);

	}
	
}

