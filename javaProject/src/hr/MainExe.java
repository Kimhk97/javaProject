package hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
//		List<Employee> empList = dao.getEmpList(); //List
		Set<Employee> empList = dao.getEmps(); // Set
		System.out.println("Salary가 5000 이상인 사원정보");
		for (Employee emp : empList) {
			if (emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}

//		public static void sort(int[] iary) {
//			Arrays.sort(iary);
//
//		}

		// 배열
		int[] intAry = null;
		intAry = new int[] { 3, 8, 4 };
		Arrays.sort(intAry);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

		// 컬렉션 List
		List<Integer> numbers = List.of(3, 8, 4);
		int min = numbers.isEmpty() ? -1 : Collections.min(numbers);
		System.out.println("Min: " + min);

		List<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(8);
		num.add(4);
		int temp = -1;
		for (int j = 0; j < num.size() - 1; j++) {
			for (int i = 0; i < num.size() - 1; i++) {
				if (num.get(i) > num.get(i + 1)) {
					temp = num.get(i);
					num.set(i, num.get(i + 1));
					num.set(i + 1, temp);
				}
			}
		}
		for (Integer i : num) {
			System.out.println("Min Sort: " + i);
		}

//		EmpDAO dao = new EmpDAO();
//		Department[] deptList = dao.deptList();
//		for (Department dept : deptList) {
//			if (dept != null && dept.getManagerId() > 100) {
//				System.out.println(dept.toString());
//			}
//		}

	}
}
