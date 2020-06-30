package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.AdminDao;
import com.web.entity.Admin;
import com.web.entity.User;
import com.web.util.JDBCUtil;

public class AdminDaoImpl implements AdminDao {

	/**
	 * ����Ա��½
	 */
	@Override
	public Admin login(String AdminName, String AdminPwd) {
		List<Admin> list = new ArrayList<Admin>();
		
		try {
			// ��ȡ���ݿ������
			Connection conn = JDBCUtil.getConnectinon();
						
			// ��дsql
			String sql ="SELECT * FROM admin "
					+ "WHERE AdminName = ? AND AdminPwd = ?";
						
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
						
			// ���ò���
			ps.setString(1, AdminName);
			ps.setString(2, AdminPwd);
						
			// ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			// ѭ�������
			while(rs.next()){
				// ʵ��������
				Admin admin = new Admin();
				
				admin.setAdminID(rs.getInt("AdminID"));
				admin.setAdminName(rs.getString("AdminName"));
				admin.setAdminPwd(rs.getString("AdminPwd"));
				
				// �Ѷ�����ӵ�������ȥ
				list.add(admin);
			}
			
			// �ر�
			JDBCUtil.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list.size()>0 ? list.get(0) : null;
	}

}
