package com.web.biz.impl;

import com.web.biz.AdminBiz;
import com.web.dao.AdminDao;
import com.web.dao.impl.AdminDaoImpl;
import com.web.entity.Admin;

public class AdminBizImpl implements AdminBiz {
	
	// ʵ�������ݷ��ʲ�
	AdminDao adminDao = new AdminDaoImpl();

	/**
	 * ����Ա��½
	 */
	@Override
	public Admin login(String AdminName, String AdminPwd) {
		return adminDao.login(AdminName, AdminPwd);
	}

}
