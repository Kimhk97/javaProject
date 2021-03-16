package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hong");
		list.add("Kim");
		list.add("Shin"); // 여기 담아도

		list = Arrays.asList("Hong", "Kim", "Park"); // 여기 새로 담겨서 덮어써짐

		for (String str : list) {
			System.out.println(str); // list의 내용이 str에 담겨서 출력
		}
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val); // val 값에 내용이 담겨
		}
		Stream<String> stream = list.stream();
		int sum = stream.mapToInt(s -> s.length()).sum();

		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee> eStream = empList.stream();

		// salary > 10000 이상인 사원을 가져와서 사원들의 급여의 합계구하기! 두둥
		eStream.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getSalary() > 10000;
			}
		}).mapToInt(new ToIntFunction<Employee>() {
			@Override
			public int applyAsInt(Employee t) {
				return t.getSalary(); //이것도 getSalary가 double 타입이라 충돌나는 거니까 신경쓰지말도록
			}
		}).sum();
		
		System.out.println("급여가 10000 이상인 사원의 급여의 합: " + sum);
	

	stream.forEach((

	String t)->
	{
				System.out.println(t); //t값에 담겨.... 다양한 방법이 있네요
		});

	List<Integer> intList = Arrays.asList(10, 20);

}

}
