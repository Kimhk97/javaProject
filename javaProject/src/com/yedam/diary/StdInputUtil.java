package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class StdInputUtil {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 사용자가 입력한 거 읽어옴
	static SimpleDateFormat df = new SimpleDateFormat("yyMMdd");

	static int readInt() {
		int result = 0;

		do {
			try {
				String temp = br.readLine();
				result = Integer.parseInt(temp); // 문자열 타입을 숫자 타입으로 변경
				break;
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("숫자 형식이 아닙니다."); // 숫자 형식을 넣을 수 있도록 계속 반복 출력
			}
		} while (true);
		return result;
	}

	// 날짜입력
	public static String readDate() { // 문장 읽어옴
		String result = "";
		do {
			try {
				result = br.readLine(); // 외부 리소스
				df.parse(result.trim()); // 내부...? 리소스
				break;
			} catch (Exception e) { // 그러니까 전체 예외처리해서 뭐든 다 예외처리 되도록ㅇㅇ
//			e.printStackTrace();
				System.out.println("날짜 형식이 아닙니다.");
			}
		} while (true);
		return result;

	}

//여러줄 입력
	public static String readMultiLine() {
		StringBuffer result = new StringBuffer();
		try {
			while (true) {
				String temp = br.readLine();
				if(temp.equals("end")) {
					break;
				}
				result.append(temp + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();

	}
}
