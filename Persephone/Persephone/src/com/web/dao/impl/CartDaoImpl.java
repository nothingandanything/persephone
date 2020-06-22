package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.CartDao;
import com.web.dao.ProductDao;
import com.web.entity.CartItem;
import com.web.entity.Drink;
import com.web.util.JDBCUtil;

public class CartDaoImpl implements CartDao {
	// ʵ������Ʒ�����ݷ��ʲ�
	ProductDao productDao = new ProductDaoImpl();
	
	/**
	 * ���ӹ��ﳵ
	 */
	@Override
	public boolean addCart(CartItem cartItem) {
		// Ӱ�������ı���
		int count = 0;
		
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "INSERT INTO cartitem(UserID,DrinkID,DrinkSweet,DrinkTemp,DrinkSpec,Number)"
					+ "VALUES (?,?,?,?,?,?);";

			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ���ò���
			ps.setInt(1, cartItem.getUserID());
			ps.setInt(2, cartItem.getDrinkID());
			ps.setString(3, cartItem.getDrinkSweet());
			ps.setString(4, cartItem.getDrinkTemp());
			ps.setString(5, cartItem.getDrinkSpec());
			ps.setInt(6, cartItem.getNumber());
			
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
	 * ��ѯ���ﳵ�е���Ʒ
	 */
	@Override
	public List<CartItem> showCart(int UserID) {
		List<CartItem> list = new ArrayList<CartItem>();
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "SELECT * FROM cartitem WHERE UserID = ?";

			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);

			// ���ò���
			ps.setInt(1, UserID);
			
			//ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			//ѭ��
			while(rs.next()){
				CartItem c = new CartItem();
				c.setUserID(rs.getInt("UserID"));
				c.setDrinkID(rs.getInt("DrinkID"));
				c.setNumber(rs.getInt("Number"));
				
				// ������Ʒid��ѯ��Ʒ��Ϣ
				int DrinkID = c.getDrinkID();
				Drink drink = productDao.findDrinkById(DrinkID);
				c.setDrink(drink);
				
				// ����Ʒ�����Ϣת��Ϊ����
				if (rs.getString("DrinkSweet").equals("high")) {
					c.setDrinkSweet("ȫ��");
				}
				else if (rs.getString("DrinkSweet").equals("mid")) {
					c.setDrinkSweet("����");
				}
				else if (rs.getString("DrinkSweet").equals("low")) {
					c.setDrinkSweet("����");
				}
				if (rs.getString("DrinkTemp").equals("hot")) {
					c.setDrinkTemp("��");
				}
				else if (rs.getString("DrinkTemp").equals("normal")) {
					c.setDrinkTemp("����");
				}
				else if (rs.getString("DrinkTemp").equals("cold")) {
					c.setDrinkTemp("�ӱ�");
				}
				if (rs.getString("DrinkSpec").equals("super")) {
					c.setDrinkSpec("������");
				}
				else if (rs.getString("DrinkSpec").equals("big")) {
					c.setDrinkSpec("��");
				}
				else if (rs.getString("DrinkSpec").equals("medium")) {
					c.setDrinkSpec("�б�");
				}
				
				// �ѹ��ﳵ�������ӵ�������
				list.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}