package objects2;

public class Member2 {
	String name;
	String id;
	String password;
	int age;

//	Member2(Member);
	Member user = new Member(id, password);
	Member user1 = new Member("홍길동", "hong");
	Member user2 = new Member("강자바", "java");
	

}
