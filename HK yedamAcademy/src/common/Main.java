package common;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Service service = new ServiceImpl(); // 서비스 인터페이스 구현객체 호출

		boolean pass = false;
		while (true) {

			if (!pass) {
				System.out.println("아이디 입력> ");
				String id = scn.next();
				System.out.println("비밀번호 입력> ");
				String pw = scn.next();
				if (id.equals("admin") && pw.equals("super")) {
					pass = true;
				} else {
					System.out.println("다시 입력하세요.");
					continue;
				}
			}

			System.out.println("-----------------------------------------------------------");
			System.out.println("1.학생등록 2.학생정보수정 3.성적입력 4.성적조회 5.성적수정 6.전체리스트 9.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("<학생등록>");
				System.out.print("학번> ");
				int studentNum = scn.nextInt();
				System.out.print("이름> ");
				String name = scn.next();
				System.out.print("나이> ");
				int age = scn.nextInt();
				System.out.print("연락처> ");
				String phoneNum = scn.next();
				Info info = new Info(studentNum, name, age, phoneNum, 0); // 수정이 필요없는 부분은 null과 0으로
				service.createInfo(info);

			} else if (menu == 2) {
				System.out.println("<학생정보수정>");
				System.out.print("학번입력> ");
				int studentNum = scn.nextInt();
				scn.nextLine();
				System.out.print("연락처 수정> ");
				String phoneNum = scn.nextLine();
				Info info = new Info(studentNum, null, 0, phoneNum, 0);
				service.modifyInfo(info);

			} else if (menu == 3) {
				System.out.println("<성적입력>");
				Info[] list = service.getInfoList();
				for (Info bo : list) {
						if (bo != null && bo.getScore() == 0) {
							System.out.println(bo.toString2());
							System.out.println("성적입력> ");
							int score = scn.nextInt();
							scn.nextLine();
							Info info = new Info(bo.getStudentNum(), null, 0, null, score);
							service.createScore(info);
						}
					}
				
			} else if (menu == 4) {
				System.out.println("<성적조회>");
				System.out.print("학번> ");
				int studentNum = scn.nextInt();
				System.out.print("현재점수> ");
				Info sc = service.getInfo(1);
				if (sc != null) {
					System.out.println(sc.toString1());
				}

			} else if (menu == 5) {
				System.out.println("<성적수정>");
				System.out.print("학번입력> ");
				int studentNum = scn.nextInt();
				scn.nextLine();
				System.out.println("현재 점수> ");
				Info sc = service.getInfo(studentNum);
				if (sc != null) {
					System.out.println(sc.getScore());
				}
				System.out.print("점수 수정> ");
				int score = scn.nextInt();
				Info info = new Info(studentNum, score);
				service.modifyScore(info);
				System.out.println("정상적으로 수정되었습니다.");

			} else if (menu == 6) { // 글 전체리스트
				System.out.println("<전체리스트>");
				Info[] list = service.getInfoList();
				for (Info bo : list) {
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
