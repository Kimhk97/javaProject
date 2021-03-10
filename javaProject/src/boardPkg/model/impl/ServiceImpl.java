package boardPkg.model.impl;

import boardPkg.control.BoardDAO;
import boardPkg.model.Board;
import boardPkg.model.Service;

public class ServiceImpl implements Service { // Service = 기능만 있는 인터페이스 / ServiceImpl = 인터페이스 구현 객체

	BoardDAO dao = new BoardDAO();

	@Override
	public Board[] getBoardList() {
		return dao.selectBoards();
	}

	@Override
	public Board getBoard(int boardNo) {
		return dao.selectBoard(boardNo);
	}

	@Override
	public void createBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void removeBoard(Board board) {
		dao.deleteBoard(board);
	}

}
