package com.web.biz.impl;

import com.web.biz.UserBiz;
import com.web.dao.UserDao;
import com.web.dao.impl.UserDaoImpl;
import com.web.entity.User;

/**
 * �û���ҵ���߼���ʵ����
 * @author ������
 *
 */
public class UserBizImpl implements UserBiz {
	
	// ʵ�������ݷ��ʲ�
	UserDao ud = new UserDaoImpl();

	@Override
	public boolean register(User user) {
		// �������ݷ��ʲ��ע�᷽��
		return ud.add(user);
	}

	@Override
	public User login(String UserName, String UserPwd) {
		// �������ݷ��ʲ�ĵ�¼����
		return ud.login(UserName, UserPwd);
	}

}