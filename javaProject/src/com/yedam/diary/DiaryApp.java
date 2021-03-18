package com.yedam.diary;

public class DiaryApp {
	DAO dao;

	public void start() {
		dao = new DiaryListDAO();
//		dao = new DiaryOracleDAO();

		int menuNum = 0;

		do {
			menuPrint();
			menuNum = menuChoose();
			
			process(menuNum);

		} while (menuNum != 0);
		System.out.println("end");
	}

	public void menuPrint() {
		Menu[] arr = Menu.values();
		int i = 0;
		for (Menu menu : arr) {
			System.out.print(String.format("%d:%s ", i, menu.name()));
			i++;
		}
		System.out.println();
	}

	// 메뉴 선택
	public int menuChoose() {
		int menuSize = Menu.values().length - 1; // 메뉴가 더 많아질 수도 있으니까
		int menuNum;
		do {
			menuNum = StdInputUtil.readInt();
			if (menuNum <= menuSize)
				break;
				System.out.println(menuSize + "까지만 입력이 가능합니다.");
		} while (true);
		return menuNum;
	}

	// 메뉴 실행
	public void process(int menuNum) {
		Menu menu = Menu.getMenu(menuNum);
		switch (menu) {
		case 종료:
			exit();
			break;
		case 추가:
			insert();
			break;
		case 수정:
			update();
			break;
		case 삭제:
			delete();
			break;
		case 전체조회:
			selectAll();
			break;
		}
	}

	// 종료
	public void exit() {
		System.out.println("종료합니다.");
	}

	// 입력
	public void insert() {
		System.out.println("추가 선택>> ");
		System.out.println("날짜: [yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용: ");
		String contents = StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		dao.insert(vo);
		int cnt = dao.insert(vo);
		System.out.println(cnt + "건 입력완료");
	}

	// 수정
	public void update() {
		System.out.println("수정 선택>> ");
		System.out.println("날짜: [yyMMdd]");
		String wdate = StdInputUtil.readDate();
		
		System.out.println("수정내용 입력: ");
		String contents = StdInputUtil.readMultiLine();
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		dao.update(vo);	
		
	}

	// 삭제
	public void delete() {
		System.out.println("삭제 선택>> ");
		System.out.println("날짜: [yyMMdd]");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r + "건 삭제되었음다요욜료료료룔.");
		
	}

	// 전체 조회
	public void selectAll() {
		System.out.println("전체조회 선택>> ");
		for(DiaryVO vo : dao.selectAll()) {
			System.out.println(vo.getWdate());
			System.out.println(vo.getContents());
		}
	}
} // end of class
