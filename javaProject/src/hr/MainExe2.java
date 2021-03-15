package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		
		//급여 기준으로 정렬
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps(); //전체리스트 Set 저장
		
		TreeSet<Employee> tset = new TreeSet<Employee> (); //salary 정렬
		
		Iterator<Employee> iter = set.iterator(); 
		while(iter.hasNext()) {
			tset.add(iter.next()); //salary 정렬되면서 저장
		}
		
		iter = tset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); //salary 출력
		}
		
	}
}
