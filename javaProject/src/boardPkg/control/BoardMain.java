package boardPkg.control;

import java.util.Scanner;
import boardPkg.model.Board;
import boardPkg.model.Service;
import boardPkg.model.impl.ServiceImpl;

public class BoardMain { // 실제 실행되는 main class
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Service service = new ServiceImpl(); // 서비스 인터페이스 구현객체 호출
//		Service service = new ServiceImpl2(); //서비스 구현객체를 2로 변경
//		service.getBoard(15);

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.리스트 9.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) { // 글 입력
				System.out.print("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("게시글 제목 입력> ");
				String title = scn.nextLine();
				System.out.print("게시글 내용 입력> ");
				String content = scn.nextLine();
				System.out.print("작성자 입력> ");
				String writer = scn.nextLine();
				Board board = new Board(boardNo, title, content, writer, null); // 날짜는 애매해서 null로
				service.createBoard(board);

			} else if (menu == 2) { // 글 수정
				System.out.print("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("게시글 내용 입력> ");
				String content = scn.nextLine();
				Board board = new Board(boardNo, null, content, null, null); // 수정이 필요없는 부분은 null로
				service.modifyBoard(board);

			} else if (menu == 3) { // 글 삭제
				System.out.print("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board board = new Board(boardNo, null, null, null, null);
				service.removeBoard(board);

			} else if (menu == 4) { // 글 조회
				System.out.print("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board board = service.getBoard(boardNo);
				System.out.println(board.toString());

			} else if (menu == 5) { // 글 전체리스트
				Board[] list = service.getBoardList();
				for (Board bo : list) {
					if (bo != null) {
						System.out.println(bo.toString());
					}
				}

			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료합니다.");
	}
}

//		Board[] list = service.getBoardList(); //리스트 조회
//		for (Board bo : list) {
//			if (bo != null) {
//				System.out.println(bo.toString());
//			}
//		}
//		
//		Board brd = service.getBoard(1); //개별 조회
//		if (brd != null) {
//			System.out.println(brd.toString());
//		}
