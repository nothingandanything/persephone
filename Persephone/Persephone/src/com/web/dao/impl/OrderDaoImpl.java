package com.web.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.OrderDao;
import com.web.entity.DrinkOrder;
import com.web.entity.User;
import com.web.util.JDBCUtil;

public class OrderDaoImpl implements OrderDao {

	/**
	 * ���Ӷ���
	 */
	@Override
	public boolean addOrder(DrinkOrder drinkOrder) {
		// ����Ӱ�������
		int count = 0;
		
		try {
			// ��ȡ���ݿ�����
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "INSERT INTO drinkorder(UserID,TotalPrice,"
					+ "OrderTime) VALUES (?,?,?)";
			
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ���ò���
			ps.setInt(1, drinkOrder.getUserID());
			ps.setFloat(2, drinkOrder.getTotalPrice());
			ps.setDate(3, new Date(new java.util.Date().getTime()));
			
			// ִ������
			count = ps.executeUpdate();

			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count > 0 ? true : false;
	}

	@Override
	public int getOrderId() {
		int OrderID = 0;
		
		try {
			// ��ȡ���ݿ�����
			Connection conn = JDBCUtil.getConnectinon();
						
			// ��дsql
			String sql = "SELECT MAX(OrderID) FROM drinkorder";
			
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			// ѭ�������
			while(rs.next()){
				OrderID = rs.getInt("MAX(OrderID)");
			}
			
			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return OrderID;
	}

	/**
	 * ����id��ѯ������Ϣ
	 */
	@Override
	public DrinkOrder findOrderById(int OrderID) {
		// ʵ�������϶���
		List<DrinkOrder> list = new ArrayList<DrinkOrder>();
		
		try {
			// ��ȡ���ݿ�����
			Connection conn = JDBCUtil.getConnectinon();
						
			// ��дsql
			String sql = "SELECT * FROM drinkorder WHERE OrderID = '" + OrderID + "'";
			
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			// ѭ�������
			while(rs.next()){
				DrinkOrder drinkOrder = new DrinkOrder();
				drinkOrder.setOrderID(rs.getInt("OrderID"));
				drinkOrder.setUserID(rs.getInt("UserID"));
				drinkOrder.setAddrID(rs.getInt("AddrID"));
				drinkOrder.setTotalPrice(rs.getFloat("TotalPrice"));
				drinkOrder.setOrderTime(rs.getDate("OrderTime"));
				drinkOrder.setPayState(rs.getInt("payState"));
				
				// �Ѷ���һ��һ�������ӵ�������
				list.add(drinkOrder);
			}
			
			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list.size()> 0 ? list.get(0) : null;
	}

	/**
	 * �����û���Ϣ��ѯ������Ϣ
	 */
	@Override
	public List<DrinkOrder> findOrderByUser(User user) {
		// ʵ�������϶���
		List<DrinkOrder> list = new ArrayList<DrinkOrder>();
		
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "SELECT * FROM drinkorder WHERE UserID = " + user.getUserID();

			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);

			// ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				// ʵ������������
				DrinkOrder drinkOrder = new DrinkOrder();
				drinkOrder.setOrderID(rs.getInt("OrderID"));
				drinkOrder.setUserID(rs.getInt("UserID"));
				drinkOrder.setUser(user);
				drinkOrder.setAddrID(rs.getInt("AddrID"));
				drinkOrder.setTotalPrice(rs.getFloat("TotalPrice"));
				drinkOrder.setOrderTime(rs.getDate("OrderTime"));
				drinkOrder.setPayState(rs.getInt("PayState"));
				
				// �Ѷ������ӵ�������
				list.add(0, drinkOrder);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean cancelOrder(int OrderID) {
		// ����Ӱ�������
		int count = 0;
				
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
						
			// ��дsql
			String sql = "DELETE FROM drinkorder WHERE OrderID = " + OrderID;

			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
					
			// ִ���޸�
			count = ps.executeUpdate();

			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count > 0 ? true : false;
	}

}