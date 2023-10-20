package com.ssafy.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.rest.model.dto.User;

@RestController
@RequestMapping("/rest2")
public class TestController2 {
	
	// http://localhost:8080/mvc/rest3/test1 : 404 뷰 리졸버가 반환된 문자열을 가지고 View를 찾으려고 해서
	@GetMapping("/test1")
	public String test1() {
		return"hi rest";
	}
	
	// http://localhost:8080/mvc/rest3/test2 : @ResponseBody를 붙여서 JSP 화면으로 반환하는게 아니라 data 그 자체를 반환
	@GetMapping("/test2")
	public String test2() {
		return"hi rest";
	}
	
	// http://localhost:8080/mvc/rest1/test3
	@GetMapping("/test3")
	public Map<String,String> test3() {
		Map<String, String> data = new HashMap<String,String>();
		
		data.put("id", "ssafy");
		data.put("password", "1234");
		data.put("name", "박은수");
		
		return data; // jackson-databind를 추가했더니 map을 알아서 json으로 바꿔줌. 
	}
	
	// http://localhost:8080/mvc/rest1/test4 : 잭슨이 dto도 알아서 json으로 바꿔준다.
	@GetMapping("/test4")
	public User test4() {
		User user = new User("ssafy","1234","박은수");
		
		return user;
	}
	
	// http://localhost:8080/mvc/rest1/test5
	@GetMapping("/test5")
	public List<User> test5() {
		List<User> list = new ArrayList<>();
		list.add(new User("ssafy","1234","박은수"));
		list.add(new User("asdfad","123124","김지환"));
		list.add(new User("qweqwrqwr","115564","이수지"));
		list.add(new User("zxcvzxcvzc","1615","최승준"));
		list.add(new User("qiqwe","112515154","ㅇㅁㄹ"));
		
		return list;
	}
	
}
