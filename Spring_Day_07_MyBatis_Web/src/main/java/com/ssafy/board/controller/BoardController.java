package com.ssafy.board.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.service.BoardService;

@Controller
public class BoardController {
	
	// 의존성 주입
	@Autowired
	private BoardService boardService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String index() {
		// 서비스 -> Dao -> DB -> 쭉 뿌려준다.
		
		// 현재로서는 index.jsp 가 없어서 (대문 페이지) 바로 리스트로 요청을 다시 하게끔 돌려보냄
		return "redirect:list";
	}
	
	@GetMapping("list")
	public String list(Model model) {
		
		List<Board> list = boardService.getList();
		model.addAttribute("list",list);
		
		return "/board/list";
	}
	
	@GetMapping("detail")
	public String detail(Model model, int id) throws SQLException {
		
		Board board = boardService.getBoard(id);
		model.addAttribute("board", board);
		
		return "/board/detail";
	}
	
	@GetMapping("delete")
	public String delete(int id) {
		boardService.removeBoard(id);
		return "redirect:list";
	}
	
	@GetMapping("writeform")
	public String writeform() {
		
		return"/board/writeform";
	}
	
	@PostMapping("write")
	public String write(Board board) {
		boardService.writeBoard(board);
		return "redirect:list";
	}
	
	@GetMapping("updateform")
	public String updateform(Model model, int id) throws SQLException {
		// id 게시글 하나를 가져와서 모델에 실어놓고 폼으로 보내겠다.
		// 현재로써는 게시글을 하나 얻어오면 조회수가 증가해버리지만 이건 잘못된 것.
		model.addAttribute("board", boardService.getBoard(id));
		return "/board/updateform";
	}
	
	@PostMapping("update")
	public String update(Board board) {
		boardService.modifyBoard(board);
		return "redirect:detail?id="+board.getId();
	}
}
