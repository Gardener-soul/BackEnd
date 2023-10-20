package com.ssafy.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest3")
public class TestController3 {
	
	// http://localhost:8080/mvc/rest1/test1 : 404 뷰 리졸버가 반환된 문자열을 가지고 View를 찾으려고 해서
	@GetMapping("/test1")
	public String test1() {
		return"hi GET";
	}
	
	// http://localhost:8080/mvc/rest1/test2 : @ResponseBody를 붙여서 JSP 화면으로 반환하는게 아니라 data 그 자체를 반환
	@PostMapping("/test2")
	public String test2() {
		return"hi POST";
	}
	
	// http://localhost:8080/mvc/rest1/test1 : 404 뷰 리졸버가 반환된 문자열을 가지고 View를 찾으려고 해서
	@PutMapping("/test3")
	public String test3() {
		return"hi PUT";
	}
	
	// http://localhost:8080/mvc/rest1/test2 : @ResponseBody를 붙여서 JSP 화면으로 반환하는게 아니라 data 그 자체를 반환
	@DeleteMapping("/test4")
	public String test4() {
		return"hi DELETE";
	}
}
