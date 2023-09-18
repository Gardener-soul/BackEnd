package com.ssafy.board.model.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ssafy.board.model.dto.Board;

public class BoardDaoImpl implements BoardDao{
	
	private List<Board> list = new ArrayList<>();
	
	private static BoardDao dao = new BoardDaoImpl();
	
	private BoardDaoImpl() {
		//더미데이터들
		list.add(new Board("오늘 너무 어렵다.", "박은수","따라치기 포기야"));
		list.add(new Board("보드서비스임플에 왜 보드다오를 의존성 주입하는거지?", "박은수","다오가 DB같은 느낌인데, 서비스랑 연관이 있나?"));
		list.add(new Board("싱글턴에 대한 이해도가 필요하다.", "박은수","dao가 쉽게 말해서 데이터베이스 같은건가?"));
	}
	
	
	
	public static BoardDao getInstance() {
		return dao;
	}
	
	@Override
	public List<Board> selectAll() {
		return list;
	}

	@Override
	public void insertBoard(Board board) {
		list.add(board);
	}

	@Override
	public Board selectOne(int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return list.get(i);
			}
		}
		return null; //만약 없음 null을 반환하며 그 아이디는 없는거야
	}

	@Override
	public void updateBoard(Board board) {
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			if(b.getId()==board.getId()) {
				b.setTitle(board.getTitle());
				b.setContent(board.getContent());
				b.setRegDate(new Date().toString());
				return;
			}
		}
	}

	@Override
	public void deleteBoard(int id) {
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			if(b.getId()==id) {
				list.remove(i);
				return;
			}
		}
		
	}

	@Override
	public void updateViewCnt(int id) {
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			if(b.getId()==id) {
				int viewCnt = b.getViewCnt();
				b.setViewCnt(viewCnt+1);
				break;
			}
		}
		
	}

}
