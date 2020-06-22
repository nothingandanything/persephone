package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.web.dao.CartDao;
import com.web.entity.CartItem;
import com.web.util.JDBCUtil;

public class CartDaoImpl implements CartDao {
	/**
	 * 添加购物车
	 */
	@Override
	public boolean addCart(CartItem cartItem) {
		
		// 影响行数的变量
		int count = 0;
		
		try {
			// 获取数据库连接对象
			Connection conn = JDBCUtil.getConnectinon();
			
			// 编写sql
			String sql = "INSERT INTO cartitem(UserID,DrinkID,DrinkSweet,DrinkTemp,DrinkSpec,Number)"
					+ "VALUES (?,?,?,?,?,?);";

			// 编译sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 设置参数
			ps.setInt(1, cartItem.getUserID());
			ps.setInt(2, cartItem.getDrinkID());
			ps.setString(3, cartItem.getDrinkSweet());
			ps.setString(4, cartItem.getDrinkTemp());
			ps.setString(5, cartItem.getDrinkSpec());
			ps.setInt(6, cartItem.getNumber());
			
			// 执行修改
			count = ps.executeUpdate();

			// 关闭
			JDBCUtil.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count > 0 ? true : false;
	}

}
