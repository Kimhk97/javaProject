package objects2;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

//		for (int i = 0; i < accountArray.length; i++) {
//			accountArray[i] = new Account(); //초기화해서 이렇게 나온건데... 모르겠네요 ^_^
//		}

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			int SelectNo = scanner.nextInt();

			if (SelectNo == 1) {
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");

				System.out.println("계좌번호: ");
				String ano = scanner.next();
				System.out.println("계좌주: ");
				String owner = scanner.next();
				System.out.println("초기입금액: ");
				int balance = scanner.nextInt();

				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i].getAno() == null) { //아니고... 뭐더라
//						accountArray[i].setAno(ano);
//						accountArray[i].setOwner(owner);
//						accountArray[i].setBalance(balance);
					}
				}

				System.out.println("결과: 계좌가 생성되었습니다.");
			}
		}
	}
//
//	private static void deposit() {
//		private static Account findAccount(String ano) {			
//		}
//	}
//
}
