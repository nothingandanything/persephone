package com.web.biz.impl;

import java.util.List;

import com.web.biz.UserBiz;
import com.web.dao.UserDao;
import com.web.dao.impl.UserDaoImpl;
import com.web.entity.User;

/**
 * 用户的业务逻辑层
 */
public class UserBizImpl implements UserBiz {
	
	// 实例化数据访问层
	UserDao userDao = new UserDaoImpl();

	/**
	 * 注册，或后台添加新用户
	 */
	@Override
	public boolean register(User user) {
		// 调用数据访问层的注册方法
		return userDao.add(user);
	}

	/**
	 * 登陆
	 */
	@Override
	public User login(String UserName, String UserPwd) {
		// 调用数据访问层的登录方法
		return userDao.login(UserName, UserPwd);
	}

	/**
	 * 后台显示用户信息
	 */
	@Override
	public List<User> showUser() {
		return userDao.showUser();
	}

	/**
	 * 后台更改用户信息
	 */
	@Override
	public boolean changeUser(User user) {
		return userDao.changeUser(user);
	}

	/**
	 * 后台删除用户
	 */
	@Override
	public boolean deleteUser(int UserID) {
		return userDao.deleteUser(UserID);
	}

}
