package controls;

import java.util.Scanner; //자바에서 쓸 수 있도록 import 해줘야 함 (sysout은 기본이라 상관없음)

public class DoWhileExample {
	public static void main(String[] args) {
		// System.in.read();
		// Scanner.readLine();
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력.");
		String str = scn.nextLine(); // 사용자가 입력한 문자열 그대로를 출력해냄 (echo). scn nextInt()
		System.out.println("입력한 값은: " + str);
		boolean run = true;
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>> " + str);
//			if(str.contentEquals("q")) {
//				run = false; = break; -반복문을 빠져나오겠다 / continue 이용도 가능!!~
//			}
		} while (!str.equals("q"));
		System.out.println("프로그램 종료.");
	}

}
