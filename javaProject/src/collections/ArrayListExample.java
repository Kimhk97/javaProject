package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] strAry = new String[10];
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i] != null) {
				System.out.println(strAry[i]);
			}
		}
		List<String> strList = new ArrayList();
		strList.add("Hello"); //strAry의 인덱스 순서대로 추가
		strList.add("Nice");
		strList.add("Good");
//		strList.add(0, "Very"); //0번째 인덱스를 very로 업데이트
		
		System.out.println(strList.size()); //크기
		for (int i=0; i<strList.size(); i++) {
			strList.get(i);
		}
		strList.remove(0); //인덱스 0의 값을 삭제
		
//		strList.add(100); //문자열 타입이 아니라 x
//		for(int i=0; i<50; i++) {
//			strList.add(String.valueOf(i));
//		}
		for (Object obj : strList) {
			String str = (String) obj;
			System.out.println(str.equals("Hello"));
		}
	}

}
