package com.ssafy.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.UserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api")
@Api(tags = "User 게시판 컨트롤러")
public class UserRestController {
	
	//UserService라고 하는 친구를 주입
	@Autowired
	private UserService userService;
	
	// 전체 유저 가져와
	@GetMapping("users")
	public List<User> userList() {
		return userService.getUserList();
	}
	
	// 회원가입을 해보자. form태그 형식으로 넘어왔다. / JSON 타입으로 넘어왔다면 requestBody
	@PostMapping("signup")
	public ResponseEntity<Integer> signup(User user) {
		int result = userService.signUp(user);
		
		// result가 0이면 등록 X
		// result가 1이면 등록 O
		
		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}
	
	@PostMapping("login")
	public ResponseEntity<?> login(User user, HttpSession session) {
		User tmp = userService.login(user);
		
		//로그인 실패
		if(tmp==null) return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		session.setAttribute("loginUser", tmp.getName());
		return new ResponseEntity<String>(tmp.getName(),HttpStatus.OK);
	}
	
	@GetMapping("logout")
	public ResponseEntity<Void> logout(HttpSession session) {
		session.invalidate();
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
