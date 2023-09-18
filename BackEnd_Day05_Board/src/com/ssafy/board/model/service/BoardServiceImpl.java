package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

public class BoardServiceImpl implements BoardService {

	private static BoardService service = new BoardServiceImpl();
	
	//의존성 주입 - 그러니까 이 부분이 이제, DAO , DB에서 만든 메소드를, 인스턴스의 형태로 가져와서 이 서비스 임플에서 사용이 가능한건가?
	private BoardDao dao = BoardDaoImpl.getInstance();
	
	private BoardServiceImpl() {
	}
	
	public static BoardService getInstance() {
		return service;
	}
	
	@Override
	public List<Board> getList() {
		return dao.selectAll();
	}

	@Override
	public void writeBoard(Board board) {
		dao.insertBoard(board);
		
	}

	@Override
	public Board getBoard(int id) {
		dao.updateViewCnt(id);
		return dao.selectOne(id);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
		
	}

	@Override
	public void removeBoard(int id) {
		dao.deleteBoard(id);
	}

}
