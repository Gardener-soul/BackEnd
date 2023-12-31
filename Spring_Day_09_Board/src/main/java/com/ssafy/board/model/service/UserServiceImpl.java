package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.UserDao;
import com.ssafy.board.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUserList() {
		return userDao.selectAll();
	}

	@Override
	public void signUp(User user) {
		userDao.insertUser(user);
	}

	@Override
	public User login(User user) {
		// DB에 해당 ID만 넘겨서 데이터를 가지고 오고 가지고 온 User data와 내가 현재 가지고 있는 user의 비밀번호를 확인
		User tmp = userDao.selectOne(user.getId());
		// tmp가 실제 User 정보일 수도 있고 / null이 넘어왔다.
		if(tmp!=null && tmp.getPassword().equals(user.getPassword())) {
			return tmp;
		}
		return tmp;
	}

}
