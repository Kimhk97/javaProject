package boardPkg.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import boardPkg.common.DBCon;
import boardPkg.model.Board;

public class BoardDAO { // 구현할 것 : 전체리스트, 한 건 조회, 입력, 수정, 삭제
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try { // try-catch 예외처리
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

	public Board[] selectBoards() { // 전체리스트 가져오기
		sql = "select * from board order by board_no desc";
		conn = DBCon.getConnection();
		Board[] boards = new Board[100];
		int i = 0;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Board brd = new Board();
				brd.setBoardNo(rs.getInt("board_no")); // 컬럼명을 매개변수로
				brd.setTitle(rs.getString("title"));
				brd.setContent(rs.getString("content"));
				brd.setWriter(rs.getString("writer"));
				brd.setCreationDate(rs.getString("creation_date"));

				boards[i++] = brd; // 1씩 증가하는 i값에 brd를 넣겠다
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("조회 처리중에 에러가 발생했습니다.");
		} finally {
			// 정상실행 or 예외발생 어떤 사아황에서든 항상 실행해야 할 내용을 구현!
			close(); // 한 번 하고 무조건 끊어줘야 함
		}
		return boards;
	}

	public Board selectBoard(int boardNo) {
		sql = "select * from board where board_no = " + boardNo; // sql의 String 타입 변수에 내용이 들어가서 불러옴
		conn = DBCon.getConnection();
		Board brd = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				brd = new Board(rs.getInt("board_no"), rs.getString("title"), rs.getString("content"),
						rs.getString("writer"), rs.getString("creation_date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return brd;
	}

	public void insertBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "insert into board values(" //
				+ board.getBoardNo() //
				+ ", '" + board.getTitle() + "'" //
				+ ", '" + board.getContent() + "'" //
				+ ", '" + board.getWriter() + "'" //
				+ ", sysdate" //
				+ ")";

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

	public void updateBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "update board set content = '" + board.getContent() + "' where board_no = " + board.getBoardNo();

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

	public void deleteBoard(Board board) {
		conn = DBCon.getConnection();
		sql = "delete from board where board_no = " + board.getBoardNo();

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
