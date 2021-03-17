package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class ToListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hong","park","hwang");
		//stream 중간처리 -> 최종 집계한 결과를 다시 List에 담을 것. h로 시작하는 애만요.
		
		Collector<Object, ?, List<Object>> col = Collectors.toList();
		
		List<String> newList = list.stream()
		.filter(s -> s.startsWith("h"))
		.collect(Collectors.toList());  //h로 시작하는 글자만 뽑아낸 것을 list에 다시 저장
		
		for (String str : newList) {
			System.out.println(str); //그럼 여기 hong, hwang만 있어야 하는데...
		}
		
		System.out.println("----------------------------------------------");
		
		EmpDAO dao = new EmpDAO();
//		dao.getEmpList(); //List<Employee>
		Set<Employee> emps = dao.getEmps(); //Set<Employee>
		List<Employee> empList = emps.stream()
			.filter(e -> e.getJobId().equals("IT_PROG"))
			.collect(Collectors.toList());
		
		empList.stream().forEach(s -> System.out.println(s));
	}

}
