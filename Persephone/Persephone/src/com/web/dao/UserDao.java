package com.web.dao;

import com.web.entity.User;

/**
 * �û������ݷ��ʲ�ӿ�
 * @author ������
 *
 */
public interface UserDao {
	/**
	 * ע��
	 * @param user
	 * @return
	 */
	public boolean add (User user);
	
	/**
	 * ��½
	 * @param UserName
	 * @param UserPwd
	 * @return
	 */
	public User login (String UserName, String UserPwd);
}
