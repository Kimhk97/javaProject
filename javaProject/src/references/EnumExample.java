package references;

import java.util.Calendar;

//enum Kind {
//	MALE, FEMALE;
//}
//
//enum Choice {
//	YES, NO;
//}

public class EnumExample {
	public static void main(String[] args) {
		Week today = null;
		today = Week.SUNDAY; // today 변수는 열거형 타입이기 때문에 열거타입에서 선언했던 상수만 사용할 수 있음!

		Calendar cal = Calendar.getInstance(); // java에 없는 함수라서 import 해줘야 함
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH)); // 월은 0월부터 시작하기 때문에 2월은 1로 표기됨
		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); // get 메소드로 보고 싶은 정보를 매개변수 삼을 수 있음

		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
		}
		System.out.println("오늘 요일: " + today);
		if (today == Week.SUNDAY || today == Week.SATURDAY) { // 변수 week를 써도 되지만 의미를 명확하게 하기 위해 정확히 적어준다!
			System.out.println("주말에는 여행을 갑니다.");
		} else {
			System.out.println("주중에는 공부를 합니다.");
		}
//		Kind manOfWoman = Kind.FEMALE;
//		if (manOfWoman == Kind.MALE) {
//			System.out.println("남성입니다.");
//		} else if (manOfWoman == Kind.FEMALE) {
//			System.out.println("여성입니다.");
//		}
	}
}
