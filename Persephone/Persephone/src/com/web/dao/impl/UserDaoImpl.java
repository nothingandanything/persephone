package com.web.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.UserDao;
import com.web.entity.User;
import com.web.util.JDBCUtil;

/**
 * �û������ݷ��ʲ�ʵ����
 * @author ������
 *
 */
public class UserDaoImpl implements UserDao {
	
	/**
	 * ע��
	 */
	@Override
	public boolean add(User user) {
		
		// Ӱ�������ı���
		int count = 0;
		
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "INSERT INTO `user`(UserName,UserPwd,UserPhone) "
					+ "VALUES (?,?,?);";
			
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ���ò���
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPwd());
			ps.setString(3, user.getUserPhone());
			
			// ִ���޸�
			count = ps.executeUpdate();
			
			// �ر�
			JDBCUtil.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count > 0 ? true : false;
	}

	/**
	 * ��½
	 */
	@Override
	public User login(String UserName, String UserPwd) {
		// ʵ�������϶���
		List<User> list = new ArrayList<User>();
		
		try {
			// ��ȡ���ݿ������
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql ="SELECT * FROM `user` "
					+ "WHERE UserName=? and UserPwd=?";
			
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ���ò���
			ps.setString(1, UserName);
			ps.setString(2, UserPwd);
			
			// ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			// ѭ�������
			while(rs.next()){
				// ʵ��������
				User user = new User();
				
				user.setUserID(rs.getInt("UserID"));
				user.setUserName(rs.getString("UserName"));
				user.setUserPwd(rs.getString("UserPwd"));
				user.setUserPhone(rs.getString("UserPhone"));
				
				// �Ѷ������ӵ�������ȥ
				list.add(user);
			}
			
			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list.size()>0 ? list.get(0) : null;
	}

}