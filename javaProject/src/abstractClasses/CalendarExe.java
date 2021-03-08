package abstractClasses;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println("-------------------------------");
		cal.set(2021, 5, 1); // cal 변수 값
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

//		System.out.printf("%3d", 9); // print f -> 여백 생김 3만큼 (글자수포함 / 1글자 + 2여백. d - 숫자타입이라서 숫자만)
//		System.out.printf("%5s", "Sun"); // 5만큼의 여백 (글자수포함 / 3글자 + 2여백. s - 문자타입이라서 문자만)
//		System.out.printf("%5s", "Monday"); // 5만큼의 여백 (여백 수보다 글자 수가 많아 여백 무시)
//		System.out.println();

		System.out.println("==============================");
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i <= firstDay; i++) {
			System.out.printf("%3s", " ");
		}

		int lastDay = cal.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%3d", i);

			if ((i+firstDay) % 7 == 0) { //일주일마다 줄 바뀌게 하는 
				System.out.println();
			}
		}

	}

}
