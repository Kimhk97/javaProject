package hr;

public class MainExe {
	public static void main(String[] args) {
//		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
//		System.out.println("Salary가 5000 이상인 사원정보");
//		for (Employee emp : empList) {
//			if (emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}
		
		EmpDAO dao = new EmpDAO();
		Department[] deptList = dao.deptList();
		for (Department dept : deptList) {
			if (dept != null && dept.getManagerId() > 100) {
				System.out.println(dept.toString());
			}
		}
		
	}
}
