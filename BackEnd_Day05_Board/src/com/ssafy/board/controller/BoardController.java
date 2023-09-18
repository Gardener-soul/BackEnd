package com.ssafy.board.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.service.BoardService;
import com.ssafy.board.model.service.BoardServiceImpl;

@WebServlet("/board") //url에 board 요청이 들어오면 이 Servlet이 동작을 한다.
public class BoardController extends HttpServlet{

	//의존성 주입 (Autowired 한 느낌)
	private BoardService service = BoardServiceImpl.getInstance();
	
	@Override //doProcess의 역할
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//GET요청에서는 안했지만 POST 요청에서는 인코딩 방식을 바꿔
		if(req.getMethod().equals("POST")) {
			req.setCharacterEncoding("UTF-8");
		}
		
		String act = req.getParameter("act");
		
		switch (act) {
		case "list":
			doList(req, resp);
			break;
		case "writeform":
			doWriteForm(req, resp);
			break;
		case "write":
			doWrite(req, resp);
			break;
		case "detail":
			doDetail(req, resp);
			break;
		case "updateform":
			doUpdateForm(req, resp);
			break;
		case "update":
			doUpdate(req, resp);
			break;
		case "delete":
			doRemove(req, resp);
			break;
		default:
			break;
		}
	}

	private void doRemove(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		service.removeBoard(id);
		resp.sendRedirect("board?act=list");
		
	}

	private void doUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String title = req.getParameter("title");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		String regDate = req.getParameter("regDate");
		
		Board board = new Board();
		board.setId(id);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(writer);
		board.setRegDate(regDate);
		
		service.modifyBoard(board);
		resp.sendRedirect("board?act=list");
	}

	private void doUpdateForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Board board = service.getBoard(id);
		req.setAttribute("board", board);
		req.getRequestDispatcher("/board/updateform.jsp").forward(req, resp);
	}

	private void doDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		req.setAttribute("board", service.getBoard(id));
		req.getRequestDispatcher("/board/detail.jsp").forward(req, resp);
	}

	private void doWrite(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String title = req.getParameter("title");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		
		Board board = new Board(title, writer, content);
		
		service.writeBoard(board);
		
		//게시글 등록시, 게시글 상세보기로 이동 Or 목록으로 이동 -> 게시글 목록이로 이동.
		resp.sendRedirect("board?act=list");
	}

	private void doWriteForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/board/writeform.jsp").forward(req, resp);
		
	}

	private void doList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 서비스 호출 -> Dao 호출 -> 돌려줘, 돌려줘 -> list.jsp로 포워딩하겠다.
		
		req.setAttribute("list", service.getList());
		req.getRequestDispatcher("/board/list.jsp").forward(req, resp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
