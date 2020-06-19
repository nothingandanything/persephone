package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.ProductDao;
import com.web.entity.Drink;
import com.web.entity.User;
import com.web.util.JDBCUtil;

public class ProductDaoImpl implements ProductDao {
	/**
	 * �����ֶ�����������
	 */
	@Override
	public Integer findDrinkByNameAllCount(String searchfield) {
		// ����������
		Integer totalCount = 0;
		
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "SELECT COUNT(*) FROM drink WHERE DrinkName LIKE '%"
					+ searchfield + "%'";
			
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			// ѭ�������
			while (rs.next()) {
				totalCount = rs.getInt(1);
			}
			
			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalCount;
	}
	
	/**
	 * �����ֶ���������
	 */
	@Override
	public List<Drink> findDrinkByName(int currentPage, int currentCount, String searchfield) {
		List<Drink> list = new  ArrayList<Drink>();
		try {
			// ��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
			
			// ��дsql
			String sql = "SELECT * FROM drink WHERE DrinkName LIKE '%"
					+ searchfield + "%' LIMIT ?,?";
			
			// ����sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// ���ò���
//			ps.setString(1, "'%" + searchfield + "%'");
			ps.setInt(1, (currentPage - 1) * currentCount);
			ps.setInt(2, currentCount);
			
			// ִ�в�ѯ
			ResultSet rs = ps.executeQuery();

			// ѭ�������
			while (rs.next()) {
				Drink d = new Drink();
				d.setDrinkID(rs.getInt("DrinkID"));
				d.setDrinkName(rs.getString("DrinkName"));
				d.setDrinkPrice(rs.getFloat("DrinkPrice"));
				d.setDrinkType(rs.getString("DrinkType"));
				d.setDrinkSweet(rs.getString("DrinkSweet"));
				d.setDrinkTemp(rs.getString("DrinkTemp"));
				d.setDrinkSpec(rs.getString("DrinkSpec"));
				d.setDrinkDesc(rs.getString("DrinkDesc"));
				d.setPicAddres(rs.getString("PicAddres"));
				
				//�Ѷ������ӵ�������ȡ
				list.add(d);
			}
						
			// �ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}