package cn.qdev.service;

import cn.qdev.dao.UserDao;
import cn.qdev.entity.User;
import cn.qdev.util.MD5util;

public class UserService {
	private UserDao userDao = new UserDao();
	private User user;
	public User login(User u){
		user = new User(u.getEmail(),MD5util.encodeMD5String(u.getPwd()));
		return userDao.login(user);
	}
}
