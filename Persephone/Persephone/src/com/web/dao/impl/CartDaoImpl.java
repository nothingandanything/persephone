package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.web.dao.CartDao;
import com.web.entity.CartItem;
import com.web.util.JDBCUtil;

public class CartDaoImpl implements CartDao {
	/**
	 * ��ӹ��ﳵ
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

}
