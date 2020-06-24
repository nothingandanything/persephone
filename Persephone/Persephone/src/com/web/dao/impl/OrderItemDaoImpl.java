package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.OrderItemDao;
import com.web.dao.ProductDao;
import com.web.entity.Drink;
import com.web.entity.DrinkOrder;
import com.web.entity.OrderItem;
import com.web.util.JDBCUtil;

public class OrderItemDaoImpl implements OrderItemDao {
	// ʵ������Ʒ�����ݷ��ʲ�
	ProductDao productDao = new ProductDaoImpl();
		
	@Override
	public boolean addOrderItem(OrderItem orderItem) {
		// ����Ӱ�������
		int count = 0;
		
		try {
			// ��ȡ���ݿ�����
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "INSERT INTO orderitem(OrderID,DrinkID,DrinkSweet,"
					+ "DrinkTemp,DrinkSpec,Number) VALUES (?,?,?,?,?,?)";

			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ���ò���
			ps.setInt(1, orderItem.getOrderID());
			ps.setInt(2, orderItem.getDrinkID());
			ps.setString(3, orderItem.getDrinkSweet());
			ps.setString(4, orderItem.getDrinkTemp());
			ps.setString(5, orderItem.getDrinkSpec());
			ps.setInt(6, orderItem.getNumber());
			
			// ִ������
			count = ps.executeUpdate();

			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count > 0 ? true : false;
	}

	/**
	 * ���ݶ�����ѯ������
	 */
	@Override
	public List<OrderItem> findOrderItemByOrder(DrinkOrder drinkOrder) {
		// ʵ�������϶���
		List<OrderItem> list = new ArrayList<OrderItem>();
		try {
			// ��ȡ���ݿ�����
			Connection conn = JDBCUtil.getConnectinon();
						
			// ��дsql
			String sql = "SELECT * FROM orderitem WHERE OrderID = '"
					+ drinkOrder.getOrderID() + "'";

			//����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//ִ�в�ѯ
			ResultSet rs = ps.executeQuery();

			// ѭ��
			while(rs.next()){
				// ʵ�������������
				OrderItem orderItem = new OrderItem();
				
				orderItem.setOrderID(rs.getInt("OrderID"));
				orderItem.setDrinkID(rs.getInt("DrinkID"));
				orderItem.setDrinkSweet(rs.getString("DrinkSweet"));
				orderItem.setDrinkTemp(rs.getString("DrinkTemp"));
				orderItem.setDrinkSpec(rs.getString("DrinkSpec"));
				orderItem.setNumber(rs.getInt("Number"));
				
				// ������Ʒ��id��ѯ��Ʒ��Ϣ
				int DrinkID = orderItem.getDrinkID();
				Drink drink = productDao.findDrinkById(DrinkID);
				
				orderItem.setDrink(drink);
				
				// �Ѷ������ӵ�������
				list.add(orderItem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * ȡ�������еĶ�����
	 */
	@Override
	public boolean cancelOrderItem(int OrderID) {
		// ����Ӱ�������
		int count = 0;
						
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
							
			// ��дsql
			String sql = "DELETE FROM orderitem WHERE OrderID = " + OrderID;

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