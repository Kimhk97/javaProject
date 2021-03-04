package objects2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		String title, author, press;
		int price;

//		static getBookInfo() {
//			for(int i=0; i < bookList.length; i++) {
//				if (bookList != null) {
//					System.out.println("도서목록> " + new Book[10]);
//				}
//			}
//		}

		while (true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 도서정보등록 | 2. 회원정보등록 | 3. 도서대여 | 4. 도서반납 | 5. 도서목록");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("1. 도서정보등록");

				for (int i = 0; i < bookList.length; i++) {
					System.out.println("제목> ");
					title = scn.next();
					System.out.println("저자> ");
					author = scn.next();
					System.out.println("출판사> ");
					press = scn.next();
					System.out.println("가격> ");
					price = scn.nextInt();

					bookList = new Book[i];
				}
			} else if (menu == 2) {
				System.out.println("2. 회원정보등록");
				System.out.println("이름> ");
				String name = scn.next();
				System.out.println("아이디> ");
				String id = scn.next();

				user = new Member(name, id);
			} else if (menu == 3) {

			}

			else if (menu == 5) {
				System.out.println("도서목록> ");
//				getBookInfo();
			}
		}
		
//		public void rent(Book book) {
//			for (int i = 0; i <LibraryApplication.bookList.length; i++) {
//				if (bookList[i] == null) {
//					bookList[i] = book;
//				}
//			}
//		}
		
	}

}
