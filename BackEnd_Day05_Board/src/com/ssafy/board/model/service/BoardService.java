package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

//추후 개발을 위해서 규격을 미리 설정해 놓고, 기능이 바뀔 때마다 쉽게 갈아낄 수 있도록.
public interface BoardService {
	
	//게시글 전체 조회
	List<Board> getList();
	
	//게시글 등록
	void writeBoard(Board board);
	
	//게시글 상세 조회
	Board getBoard(int id);
	
	//게시글 수정
	void modifyBoard(Board board);
	
	//게시글 삭제
	void removeBoard(int id);

}
