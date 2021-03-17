package hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;
//	ResultSet rs = null;
//	PreparedStatement psmt = null;
//	String sql = "select * from dept_java";
//
	public EmpDAO() {
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "hr";
//		String passwd = "hr";
//		conn = DBUtil.getConnection(url, user, passwd);

		String path = "config/database.properties";
		FileReader fr = null;
		Properties prop = new Properties();

		try {
			fr = new FileReader(path);
			prop.load(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");
		conn = DBUtil.getConnection(url, user, passwd);
	}

//	public Department[] deptList() {
//
//		Department[] departments = new Department[100];
//
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			int i = 0;
//			while (rs.next()) { // next() : 요소가 있으면 계속 true. 마지막 요소가 끝나면 false. 그러니까 요소가 있는 동안 계속 반복하겠다는 뜻.
//				Department dept = new Department();
//				dept.setDepartmentId(rs.getInt("department_id"));
//				dept.setDepartmentName(rs.getString("department_name"));
//				dept.setLocationId(rs.getInt("location_id"));
//				dept.setManagerId(rs.getInt("manager_id"));
////				System.out.println(dept.toString());
//				departments[i++] = dept;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.close(rs, psmt, conn);
//		}
//		System.out.println("메소드 호출 완료.");
//		return departments;
//	}

	// 컬렉션 Set
	public Set<Employee> getEmps() {
		String sql = "select * from emp_java";
		Set<Employee> set = new HashSet<>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));
				set.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return set;
	}

	// 컬렉션 List
	public List<Employee> getEmpList() {
		String sql = "select * from emp_java";
		List<Employee> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return list;
	}

	// 다른 방식
	public Employee[] empList() {

		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) { // next() : 요소가 있으면 계속 true. 마지막 요소가 끝나면 false. 그러니까 요소가 있는 동안 계속 반복하겠다는 뜻.
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
//				System.out.println(emp.toString());
				employees[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return employees;
	}

	public Map<String, String> getJobList() {
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<String, String>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return map;
	}

}
