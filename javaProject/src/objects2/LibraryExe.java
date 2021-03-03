package objects2;

public class LibraryExe { // Book과 Member의 API를 이용해 실행하는 크래스
	public static void main(String[] args) {
		Book book1 = new Book("자바", "저자1", "출판사1", 1000); // title, author, press, price
		System.out.println(book1.getBookTitle()); // book1 변수에서 getBookTitle의 리턴값인 bookTitle을 빼온다
		Book book2 = new Book("HTML", "저자2", "출판사2", 2000);
		Book book3 = new Book("CSS", "저자3", "출판사3", 3000);
		Book book4 = new Book("자바스크립트", "저자4", "출판사4", 4000);

		Member mem1 = new Member("s111", "박효정"); // id, name
		mem1.rent(book1); //rent메소드의 Book 매개값
		mem1.rent(book2);
		mem1.overdue(book2); //overdue메소드의 Book 매개값
		

		mem1.getBookInfo(); //mem1의 내용을 getBookInfo 함수에 담아냄
		
		
		Member mem2 = new Member("a222", "김한설");
		mem2.rent(book3);
		mem2.rent(book4);
		
		mem2.getBookInfo();
		
	}

}
