package api;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return Integer.compare(a.sno, b.sno);
	}
	

}
