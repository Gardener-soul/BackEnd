package com.ssafy.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.util.JwtUtil;


@RestController
@RequestMapping("/api")
public class UserRestController {
	// 응답을 편하게 하기 위해 상수로 지정
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	//UserService 생성해서 촥촥 해야하지만 ... 시간 관계상 생략
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
	@PostMapping("/login")
	
	
	
	
	
	
	

}
