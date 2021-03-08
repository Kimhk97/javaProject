package inheritances;

import java.util.Scanner;

public class FriendList {
	static Friend[] friends = new Friend[10]; // static은 정적메소드로 메소드 영역에 메모리를 할당시킴

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		// 1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료

		String name;
		String phone;
		String major;
		String department;

		while (true) {

			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료");
			System.out.println("선택> ");

			int menu = scn.nextInt();

			if (menu == 1) {

				for (int i = 0; i < friends.length; i++) {

					System.out.println("1.친구");
					System.out.println("친구이름> ");
					name = scn.next();

					System.out.println("친구번호> ");
					phone = scn.next();

					friends[i] = new Friend(name, phone);
					saveFriend(friends);

					break;
				}
			} else if (menu == 2) {

				for (int i = 0; i < friends.length; i++) {
					saveFriend(new UnivFriend("", "", ""));

					System.out.println("2.학교친구");
					System.out.println("친구이름> ");
					name = scn.next();

					System.out.println("친구번호> ");
					phone = scn.next();

					System.out.println("전공> ");
					major = scn.next();

					saveFriend(friends);
					break;
				}

			} else if (menu == 3) {
				for (int i = 0; i < friends.length; i++) {
					saveFriend(new ComFriend("", "", ""));

					System.out.println("3.회사친구");
					System.out.println("친구이름> ");
					name = scn.next();

					System.out.println("친구번호> ");
					phone = scn.next();

					System.out.println("부서명> ");
					department = scn.next();

					saveFriend(friends);
					break;

				}

			} else if (menu == 4) {
				System.out.println(friends);

			} else if (menu == 5) {
				System.out.println("친구이름 입력> ");
				String findName = scn.next();
				for (Friend friend : friends) {
					if (friend != null && friend.name.equals(findName)) {
						System.out.println("친구정보: " + friend.toString());
					}
				}
			}
		}

//		friends[0] = new Friend("임성원", "01012345678");
//		friends[1] = new ComFriend("정준영", "01012123434", "총무부서");
//		friends[2] = new UnivFriend("도왕락", "01045456767", "역사학과");

//		for (Friend friend : friends) {
//			if (friend != null) {
//				System.out.println(friend.toString());
//			}
//		}
	}

	public static void saveFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
}
