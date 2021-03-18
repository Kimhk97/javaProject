package com.yedam.diary;

import java.util.List;

public interface DAO { // 작성.수정.삭제
	public int insert(DiaryVO vo);

	public void update(DiaryVO vo);

	public int delete(String date);

	public DiaryVO selectDate(String date);

	public List<DiaryVO> selectContent(String content); // 문구가 포함된 내용을 검색해서 list

	public List<DiaryVO> selectAll(); // 전체 조회

}
