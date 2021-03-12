package common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Info[] selectInfo() { // 전체리스트 조회
		sql = "select * from student_info";
		conn = Connect.getConnection();
		Info[] info = new Info[100];
		int i = 0;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Info in = new Info();
				in.setStudentNum(rs.getInt("std_id")); // 컬럼명을 매개변수로
				in.setName(rs.getString("std_name"));
				in.setAge(rs.getInt("std_age"));
				in.setPhoneNum(rs.getString("std_phone"));
				in.setScore(rs.getInt("std_score"));

				info[i++] = in; // 1씩 증가하는 i값에 in을 넣겠다
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("조회 처리중에 에러가 발생했습니다.");
		} finally {
			// 정상실행 or 예외발생 어떤 사아황에서든 항상 실행해야 할 내용을 구현!
			close(); // 한 번 하고 무조건 끊어줘야 함
		}
		return info;
	}

	public Info selectInfo(int studentNum) { // 학생 한 건 조회
		sql = "select * from student_info where std_id = " + studentNum;
		conn = Connect.getConnection();
		Info in = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				in = new Info(rs.getInt("std_id"), rs.getString("std_name"), rs.getInt("std_age"),
						rs.getString("std_phone"), rs.getInt("std_score"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return in;
	}

	public void insertInfo(Info info) { // 학생등록
		conn = Connect.getConnection();
		sql = "insert into student_info values(" //
				+ info.getStudentNum() //
				+ ", '" + info.getName() + "'" //
				+ ", " + info.getAge()  //
				+ ", '" + info.getPhoneNum() + "'" //
				+ ", 0) "; //

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public void updateInfo(Info info) { // 학생수정
		conn = Connect.getConnection();
		sql = "update student_info set std_phone = '" + info.getPhoneNum() + "' where std_id = " + info.getStudentNum();

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 업데이트되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	
	public void insertScore(Info info) { // 성적입력
		conn = Connect.getConnection();
		sql = "update student_info set std_score = " //
				+ info.getScore() + "where std_id = " + info.getStudentNum();

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public void updateScore(Info info) { // 성적수정
		conn = Connect.getConnection();
		sql = "update student_info set std_score = " + info.getScore() + " where std_id = " + info.getStudentNum();

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 업데이트되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
