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
	 * 管理员登陆
	 */
	@Override
	public Admin login(String AdminName, String AdminPwd) {
		List<Admin> list = new ArrayList<Admin>();
		
		try {
			// 获取数据库的连接
			Connection conn = JDBCUtil.getConnectinon();
						
			// 编写sql
			String sql ="SELECT * FROM admin "
					+ "WHERE AdminName = ? AND AdminPwd = ?";
						
			// 编译sql
			PreparedStatement ps = conn.prepareStatement(sql);
						
			// 设置参数
			ps.setString(1, AdminName);
			ps.setString(2, AdminPwd);
						
			// 执行查询
			ResultSet rs = ps.executeQuery();
			
			// 循环结果集
			while(rs.next()){
				// 实例化对象
				Admin admin = new Admin();
				
				admin.setAdminID(rs.getInt("AdminID"));
				admin.setAdminName(rs.getString("AdminName"));
				admin.setAdminPwd(rs.getString("AdminPwd"));
				
				// 把对象添加到集合中去
				list.add(admin);
			}
			
			// 关闭
			JDBCUtil.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list.size()>0 ? list.get(0) : null;
	}

}
