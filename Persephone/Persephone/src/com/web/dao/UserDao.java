package com.web.dao;

import com.web.entity.User;

/**
 * 用户的数据访问层接口
 * @author 王佳祺
 *
 */
public interface UserDao {
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public boolean add (User user);
	
	/**
	 * 登陆
	 * @param UserName
	 * @param UserPwd
	 * @return
	 */
	public User login (String UserName, String UserPwd);
}
