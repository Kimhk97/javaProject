package boardPkg.model;

public interface Service {
	public Board[] getBoardList(); //전체목록 가져오기
	public Board getBoard(int boardNo); //한 건 조회
	public void createBoard(Board board); //게시글 작성
	public void modifyBoard(Board board); //게시글 수정
	public void removeBoard(Board board); //게시글 삭제

}
