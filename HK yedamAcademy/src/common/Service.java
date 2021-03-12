package common;

public interface Service {
	public Info[] getInfoList(); //전체목록 가져오기
	public void createInfo(Info info); //학생등록
	public void modifyInfo(Info info); //학생수정 (학번입력하면 연락처 수정)
	public void createScore(Info info); //성적입력 (학번입력-이름 입력하면 성적 입력)
	public Info getInfo(int studentNum); //한 건 조회 (학번입력하면 학번/이름/성적 조회)
	public void modifyScore(Info info); //성적수정 (학번입력하면 성적 수정)


}