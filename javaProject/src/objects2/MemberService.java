package objects2;

public class MemberService {

	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		if ("hong".equals(id)) {
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
