package api;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-2230123"; //주민번호
		char sex = ssn.charAt(7); //인덱스가 7인(8번째) 문자열이 case와 같을 때 아래 내용 출력
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
