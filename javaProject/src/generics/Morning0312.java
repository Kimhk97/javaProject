package generics;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Morning0312 {
	public static void main(String[] args) {
		System.out.println(checkGender("970122-25987563"));
		System.out.println(checkGender("845313/35235412"));

		// 두 수의 합을 구하고 합의 결과를 3자리 단위로 (,)로 끊기
		sum("100000","234000");
	}

	public static void sum(String a, String b) {
		DecimalFormat d = new DecimalFormat("#,###");
		String w = (d) a+b;
		System.out.println(w);
	}

	public static String checkGender(String j) {
		String r = j.replace("/", "").replace("-", ""); // 주민번호의 /이나 -를 없는 문자열로 인식

		if (r.charAt(6) == '1' || r.charAt(6) == '3') { // 그 때, 인덱스가 6인 숫자를 인식해서 리턴
			return "남자";
		} else if (r.charAt(6) == '2' || r.charAt(6) == '4') {
			return "여자";
		}
		return "입력오류";
	}
}
