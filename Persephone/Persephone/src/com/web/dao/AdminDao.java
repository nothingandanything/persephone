package com.web.dao;

import java.util.List;

import com.web.entity.Admin;

public interface AdminDao {
	/**
	 * ����Ա��½
	 * @param AdminName
	 * @param AdminPwd
	 * @return
	 */
	public Admin login(String AdminName, String AdminPwd);
}
