package objects2;

public class Member { // 회원정보
	private String memberId;
	private String memberName;
	private Book[] rentBooks = new Book[3]; // 대여한 책을 담아두는 배열(3권까지)

	public Member() {} //LibraryApplication의 기본 생성자
	
	
	
	// getter, setter
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// using field (생성자. Book[]은 이미 값을 지정해서 굳이 x)
	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public void rent(Book book) { // Book 타입의 book 변수
		for (int i = 0; i < rentBooks.length; i++) { // [0]~[2]까지(rentBooks의 크기) 삽입
			if (rentBooks[i] == null) { // 만약 비어 있다면
				rentBooks[i] = book; // [i]에 book 삽입
				break; // 삽입했으면 빠져나옴
			}
		}
	}

	public void overdue(Book book) { // 반납
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookTitle().equals(book.getBookTitle())) { // equals는 문자열이 똑같으면(==)의 뜻. getBookTitle의
																			// return값(=bookTitle)이 book 변수의 값과 똑같으면
				rentBooks[i] = null; // rentBooks[i]의 값을 null로 만든다. (반납한 것으로 처리한다)
				break;
			}
		}
	}

	public void getBookInfo() {
		for (int i = 0; i < rentBooks.length; i++) { // rentBooks의 크기만큼 반복
			if (rentBooks[i] != null) { // null값이 아니면(빌린 책이 없지 않으면. 있으면)
				System.out.println("멤버이름 - " + memberName + ", 책 이름 - " + rentBooks[i].getBookTitle());
				// 책 이름은 rent.Books[i]의 bookTitle인데 private라 가져올 수 없으므로 getBookTitle()을 가져온다.
			}
		}
	}

// 	위랑 아래랑 똑같음

//	public String getBookInfo() {
//		String result = "";
//		result = memberName;
//		for (int i = 0; i < rentBooks.length; i++) {
//			if(rentBooks[i] != null) {
//			result = result + "/" + rentBooks[i].getBookTitle();
//			} return result;
//		}
//	}
}
