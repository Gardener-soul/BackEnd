package com.ssafy.board.test;

import com.ssafy.board.config.MyAppSqlConfig;
import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dto.Board;

public class Test {
	public static void main(String[] args) {
		
		BoardDao dao = MyAppSqlConfig.getSession().getMapper(BoardDao.class);
		

//		System.out.println(dao.selectOne(2));
		
		Board board = new Board("자기주도형 학습", "박은수", "ez");
		
		dao.insertBoard(board);
		
//		dao.deleteBoard(5);
		
		dao.updateViewCnt(6);
		
		Board bo = dao.selectOne(4);
		bo.setTitle("아놔 다 바꿔 버림");
		bo.setContent("진짜롱");
		bo.setWriter("박은수 2호");
		
		dao.updateBoard(bo);
		
		for(Board ba : dao.selectAll()) {
			System.out.println(ba);
		}
		
	}
}
