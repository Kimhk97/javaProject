package collections.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Student {
	int studentNum = 0;
	String name = "";

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
	
	@Override
	public int hashCode() { // 동일한 문자열은 동일한 hashCode 값을 리턴한다
		return this.studentNum + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return this.studentNum == s.studentNum && this.name.equals(s.name);
		}
		return false;
	}

}
