package streams;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public int compareTo(Student o) { //implements 해야 함 
		return this.score - o.score; //-1 오름차순, 1 내림차순
	} //배열의 값을 o에 담고 그 o의 score를 비교(순서 임의)해서 중심이 되는 this.score와 비교
		//그렇게해서 1(양수)이 나오면 둘 중에 작은 애를 먼저 세우겠다. 만약 -1(음수)이 나오면 큰 애를 먼저 세우겠다.

}
