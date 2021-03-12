package test;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;
		int[] students = null;

		while (true) {

			System.out.println("----------------------------------");
			System.out.println("1.학생등록 2.학생수정 3.학생삭제 4.전체리스트");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("<학생등록>");
				System.out.print("학번> ");
				int stuNum = scn.nextInt();
				System.out.print("이름> ");
				String name = scn.next();
				System.out.print("나이> ");
				int age = scn.nextInt();
				Student info = new Student(stuNum, name, age);
				System.out.println(info);
				System.out.println("등록되었습니다.");
				students = new int[info.getStuNum()];

			} else if (menu == 2) {
				System.out.println("<학생수정>");
				System.out.print("학번입력> ");
				int stuNum = scn.nextInt();
				scn.nextLine();
				System.out.println("이름수정> ");
				String name = scn.next();
				scn.nextLine();
				System.out.print("나이수정> ");
				int age = scn.nextInt();
				Student info = new Student(stuNum, name, age);
				System.out.println(info);
				System.out.println("수정되었습니다.");
				students = new int[info.getStuNum()];

			} else if (menu == 3) {
				System.out.println("<학생삭제>");
				System.out.print("학번입력> ");
				int stuNum = scn.nextInt();
				scn.nextLine();

			} else if (menu == 4) {
				System.out.println("<전체리스트>");
				System.out.println(students.toString());

			}

		}

	}
}