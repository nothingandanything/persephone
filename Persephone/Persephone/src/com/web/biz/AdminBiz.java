package com.web.biz;

import com.web.entity.Admin;

public interface AdminBiz {
	/**
	 * ����Ա��½
	 * @param AdminName
	 * @param AdminPwd
	 * @return
	 */
	public Admin login(String AdminName, String AdminPwd);
}