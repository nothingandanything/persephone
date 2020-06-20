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
	 * 获取商品的总条数
	 */
	@Override
	public Integer findAllCount(String DrinkType) {
		// 定义总条数
		Integer totalCount = 0;
				
		try {
			// 获取数据库的连接
			Connection conn = JDBCUtil.getConnectinon();
			
			// 编写sql
			String sql = "SELECT COUNT(*) FROM drink";
			
			if(!"All".equals(DrinkType)){
				sql+=" WHERE DrinkType='"+DrinkType+"'";
			}
			
			// 编译sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 执行查询
			ResultSet rs = ps.executeQuery();
			
			// 循环
			while(rs.next()){
				// 取结果集中的第一个值赋值给totalCount
				totalCount = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalCount;
	}
	
	/**
	 * 根据类别分页查询数据
	 */
	@Override
	public List<Drink> findByPage(Integer currentPage, int currentCount, String DrinkType) {
		// 实例化集合对象
		List<Drink> list = new ArrayList<Drink>();
		
		try {
			// 获取数据库的连接
			Connection conn = JDBCUtil.getConnectinon();
			
			// 编写sql
//			String sql = null;
//				
//			// 如果是根据类别查询商品的数据信息
//			if(!"全部商品".equals(DrinkType)){
//				sql = "select * from Drinks where DrinkType=? limit ?,?";
//			}else{
//				sql = "select * from Drinks limit ?,?";
//			}
			
			StringBuffer sb = new StringBuffer("SELECT * FROM drink");
			
			// 如果是根据类别查询商品的数据信息
			if(!"All".equals(DrinkType)){
				sb.append(" WHERE DrinkType='"+DrinkType+"'");
			}
			
			// 添加分页查询的参数
			sb.append(" limit ?,?");
			
			// 编译sql
			PreparedStatement ps = conn.prepareStatement(sb.toString());
			
			// 设置参数
			ps.setInt(1, (currentPage-1)*currentCount);  // 设置分页查询排除的笔数
			ps.setInt(2, currentCount);  // 设置分页查询每页显示的条数
			
			// 执行查询
			ResultSet rs = ps.executeQuery();
			
			// 循环结果集对象
			while(rs.next()){
				Drink d = new Drink();
				d.setDrinkID(rs.getInt("DrinkID"));
				d.setDrinkName(rs.getString("DrinkName"));
				d.setDrinkPrice(rs.getFloat("DrinkPrice"));
				d.setDrinkType(rs.getString("DrinkType"));
				d.setDrinkDesc(rs.getString("DrinkDesc"));
				d.setPicAddres(rs.getString("PicAddres"));
				
				// 把对象添加到集合中取
				list.add(d);
			}
			// 关闭
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 根据字段搜索总条数
	 */
	@Override
	public Integer findDrinkByNameAllCount(String searchfield) {
		// 定义总条数
		Integer totalCount = 0;
		
		try {
			// 获取数据库连接对象
			Connection conn = JDBCUtil.getConnectinon();
			
			// 编写sql
			String sql = "SELECT COUNT(*) FROM drink WHERE DrinkName LIKE '%"
					+ searchfield + "%'";
			
			// 编译sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 执行查询
			ResultSet rs = ps.executeQuery();
			
			// 循环结果集
			while (rs.next()) {
				totalCount = rs.getInt(1);
			}
			
			// 关闭
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalCount;
	}
	
	/**
	 * 根据字段搜索数据
	 */
	@Override
	public List<Drink> findDrinkByName(int currentPage, int currentCount, String searchfield) {
		List<Drink> list = new  ArrayList<Drink>();
		try {
			// 获取数据库连接对象
			Connection conn = JDBCUtil.getConnectinon();
			
			// 编写sql
			String sql = "SELECT * FROM drink WHERE DrinkName LIKE '%"
					+ searchfield + "%' LIMIT ?,?";
			
			// 编译sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 设置参数
//			ps.setString(1, "'%" + searchfield + "%'");
			ps.setInt(1, (currentPage - 1) * currentCount);
			ps.setInt(2, currentCount);
			
			// 执行查询
			ResultSet rs = ps.executeQuery();

			// 循环结果集
			while (rs.next()) {
				Drink d = new Drink();
				d.setDrinkID(rs.getInt("DrinkID"));
				d.setDrinkName(rs.getString("DrinkName"));
				d.setDrinkPrice(rs.getFloat("DrinkPrice"));
				d.setDrinkType(rs.getString("DrinkType"));
				d.setDrinkDesc(rs.getString("DrinkDesc"));
				d.setPicAddres(rs.getString("PicAddres"));
				
				//把对象添加到集合中取
				list.add(d);
			}
						
			// 关闭
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 根据id查询商品详情
	 */
	@Override
	public Drink findDrinkById(int id) {
		// 实例化集合
		List<Drink> list = new ArrayList<Drink>();
				
		try {
			// 获取数据库的连接对象
			Connection conn = JDBCUtil.getConnectinon();
			
			// 编写sql
			String sql = "SELECT * FROM drink WHERE DrinkID=?";
			
			// 编译sql
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 设置参数
			ps.setInt(1, id);
			
			//执行查询
			ResultSet rs = ps.executeQuery();
			
			//循环
			while(rs.next()){
				Drink d = new Drink();
				d.setDrinkID(rs.getInt("DrinkID"));
				d.setDrinkName(rs.getString("DrinkName"));
				d.setDrinkPrice(rs.getFloat("DrinkPrice"));
				d.setDrinkType(rs.getString("DrinkType"));
				d.setDrinkDesc(rs.getString("DrinkDesc"));
				d.setPicAddres(rs.getString("PicAddres"));
				
				//把商品对象添加到集合中
				list.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list.size()>0 ? list.get(0) : null;
	}
}
