package collections;

public class Student {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student sno = " + sno + ", name = " + name;
	}

	@Override
	public int hashCode() { // 동일한 문자열은 동일한 hashCode 값을 리턴한다
		return this.sno + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return this.sno == s.sno && this.name.equals(s.name); // sno 필드끼리 내용을 비교
		}
		return false;
	}

}
