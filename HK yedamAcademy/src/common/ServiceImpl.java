package common;

import common.DAO;

public class ServiceImpl implements Service {
	
	DAO dao = new DAO();
	
	@Override
	public Info[] getInfoList() { //전체리스트
		return dao.selectInfo();
	}

	@Override
	public Info getInfo(int studentNum) { //성적조회
		return dao.selectInfo(studentNum);
	}
	
	
	@Override
	public void modifyInfo(Info info) { //연락처 수정하기
		dao.updateInfo(info);
		
	}

	@Override
	public void createScore(Info info) { //성적입력
		dao.insertScore(info);
		
	}

	@Override
	public void modifyScore(Info info) { //성적수정
		dao.updateScore(info);
		
	}

	@Override
	public void createInfo(Info info) { //학생등록
		dao.insertInfo(info);
		
	}


}
