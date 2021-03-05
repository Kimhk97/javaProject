package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement psmt = null;
	String sql = "select * from dept_java";

	EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Department[] deptList() {

		Department[] departments = new Department[100];

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) { // next() : 요소가 있으면 계속 true. 마지막 요소가 끝나면 false. 그러니까 요소가 있는 동안 계속 반복하겠다는 뜻.
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLocationId(rs.getInt("location_id"));
				dept.setManagerId(rs.getInt("manager_id"));
//				System.out.println(dept.toString());
				departments[i++] = dept;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return departments;
	}

//	public Employee[] empList() {
//
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		String sql = "select * from emp_java";
//		Employee[] employees = new Employee[100];
//
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			int i = 0;
//			while (rs.next()) { // next() : 요소가 있으면 계속 true. 마지막 요소가 끝나면 false. 그러니까 요소가 있는 동안 계속 반복하겠다는 뜻.
//				Employee emp = new Employee();
//				emp.setEmail(rs.getString("email"));
//				emp.setEmployeeId(rs.getInt("employee_id"));
//				emp.setFirstName(rs.getString("first_name"));
//				emp.setHireDate(rs.getString("hire_date"));
//				emp.setJobId(rs.getString("job_id"));
//				emp.setLastName(rs.getString("last_name"));
//				emp.setPhoneNumber(rs.getString("phone_number"));
//				emp.setSalary(rs.getDouble("salary"));
////				System.out.println(emp.toString());
//				employees[i++] = emp;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.close(rs, psmt, conn);
//		}
//		System.out.println("메소드 호출 완료.");
//		return employees;
//	}

}
