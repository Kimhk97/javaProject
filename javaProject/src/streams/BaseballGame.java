package streams;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {

		int com[] = new int[3];
		int user[] = new int[3];
		int index = 0;
		int count = 0;
		boolean loop = true;
		boolean check = false;
		Scanner scn = new Scanner(System.in);

		int strike = 0;
		int ball = 0;

		// 컴퓨터에서 뽑아낸 숫자와 나온 숫자를 대조
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[j] == com[i]) {
					i--;
					break;
				}
			} System.out.println(com[i]);
		}

		System.out.println("숫자를 입력하세요.>>");

		// com과 user의 배열을 비교 (strike/ball 판단)
		while (loop) {

			for (int i = 0; i < user.length; i++) {
				int num = scn.nextInt();		
				if (num < 1 || num > 9) {
					System.out.println("1~9 사이의 정수를 입력하세요.>>");
				} else {
					user[i] = num;
				}
				

//				if (user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
//					check = false;
//				} else {
//					check = true;
//				} if (check) {
//					System.out.println("중복되지 않은 값을 입력하세요.>>");
//				}
			}

			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) { // user와 com의 숫자와 인덱스(자리)가 똑같다면
						strike++;
						System.out.println("스트라이크");
					} else if (com[i] == user[j] && i != j) { // 숫자는 있는데 인덱스가 똑같지 않다면
						ball++;
						System.out.println("볼");
					}

				}
			}

			System.out.println(strike + " 스트라이크 / " + ball + " 볼");
			
			
			if (strike == 3) {
				System.out.println("Game Over");
				loop = false;				
			}
			
			strike = 0;
			ball = 0;
		}

		scn.close();

	}

}
