package collections;

import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디: ");
			String id = scn.nextLine();

			System.out.println("비밀번호: ");
			String pw = scn.nextLine();
			System.out.println();

			if (map.containsKey(id)) { //id 존재여부 확인
				if (map.get(id).equals(pw)) { //id(key)값과 pw(value)값 할당이 일치하는지 확인
					System.out.println("로그인 되었습니다."); //일치하면
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다."); //할당이 일치하지 않으면
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다."); //id가 없으면
			}
		}
	}
}
