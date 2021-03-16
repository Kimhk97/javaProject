package streams;

import collections.Student;

public class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;

	private String name;
	private int sex;
	private int age;

	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public int hashCode() { // 동일한 문자열은 동일한 hashCode 값을 리턴한다
		return this.name.hashCode() + this.sex + this.age; //.hashCode()는 String 타입에만
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			return this.name.equals(m.name) && this.sex == m.sex && this.age == m.age;
		}
		return false;
	}

}
