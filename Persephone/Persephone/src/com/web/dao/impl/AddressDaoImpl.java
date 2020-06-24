package com.web.dao.impl;

/**
 * ��ַ�����ݷ��ʲ�ʵ��
 */

import com.web.dao.AddressDao;
import com.web.entity.UserAddr;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.entity.UserAddr;
import com.web.entity.User;
import com.web.util.JDBCUtil;

public class AddressDaoImpl implements AddressDao {

	/**
	 * ���Ӷ����ķ���
	 */
	
	@Override
	public boolean addAddress(UserAddr userAddr) {
		
		//����Ӱ�������ı���
				int count = 0;
				
		try {
					
			//��ȡ���ݿ�����
			Connection conn = JDBCUtil.getConnectinon();
			
			//��дsql���
			String sql = "insert into useraddr (UserId,City,County,Street,HouseNum)"
					+ "values (?,?,?,?,?)";
			
			//����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//���ò���
			ps.setInt(1, userAddr.getUserID());
			ps.setString(2, userAddr.getCity());
			ps.setString(3, userAddr.getCounty());
			ps.setString(4, userAddr.getStreet());
			ps.setString(5, userAddr.getHouseNum());
			
			//ִ���޸�
			count = ps.executeUpdate();
			
			//�ر�
			JDBCUtil.close();
			
		}catch(Exception e) {
			e.printStackTrace();//����д������ڿ���̨�׳�������Ϣ
		}
		
		//���count>0,�򷵻�true�����򷵻�false
				return count > 0 ? true : false;
		
	}

	
	
	@Override
	public List<UserAddr> showAddress(int UserID) {
		List<UserAddr> list = new ArrayList<UserAddr>();
		try {
			//��ȡ���ݿ�����
			Connection conn = JDBCUtil.getConnectinon();
			
			//��дsql���
			String sql = "SELECT * FROM useraddr WHERE UserID = " + UserID;

			//����sql
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				UserAddr c = new UserAddr();
				c.setUserID(rs.getInt("UserID"));
				c.setCity(rs.getString("City"));
				c.setCounty(rs.getString("County"));
				c.setStreet(rs.getString("Street"));
				c.setHouseNum(rs.getString("HouseNum"));
				
				list.add(c);
			}	
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
}