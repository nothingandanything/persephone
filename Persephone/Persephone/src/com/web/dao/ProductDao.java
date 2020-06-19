package com.web.dao;

import java.util.List;

import com.web.entity.Drink;

public interface ProductDao {
	/**
	 * 根据字段搜索总条数
	 * @param searchfield
	 * @return
	 */
	public Integer findDrinkByNameAllCount(String searchfield);
	
	/**
	 * 根据字段搜索数据
	 * @param currentPage  当前页
	 * @param currentCount  每页的条数
	 * @param searchfield  搜索的字段
	 * @return
	 */
	public List<Drink> findDrinkByName(int currentPage,int currentCount,String searchfield);
}
