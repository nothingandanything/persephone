package com.web.biz.impl;

import com.web.biz.UserBiz;
import com.web.dao.UserDao;
import com.web.dao.impl.UserDaoImpl;
import com.web.entity.User;

/**
 * 用户的业务逻辑层
 */
public class UserBizImpl implements UserBiz {
	
	// 实例化数据访问层
	UserDao ud = new UserDaoImpl();

	@Override
	public boolean register(User user) {
		// 调用数据访问层的注册方法
		return ud.add(user);
	}

	@Override
	public User login(String UserName, String UserPwd) {
		// 调用数据访问层的登录方法
		return ud.login(UserName, UserPwd);
	}

}
