package com.web.dao;

import java.util.List;

import com.web.entity.Drink;

public interface ProductDao {
	/**
	 * 查询商品的总条数
	 * @param DrinkType
	 * @return
	 */
	public Integer findAllCount(String DrinkType);
	
	/**
	 * 根据类别分页查询数据
	 * @param currentPage  当前页码
 	 * @param currentCount   每页显示的条数
	 * @param DrinkType  类别
	 * @return
	 */
	public List<Drink> findByPage(Integer currentPage,int currentCount,String DrinkType);
	
	/**
	 * 根据字段搜索总条数
	 * @param searchfield
	 * @return
	 */
	public Integer findDrinkByNameAllCount(String searchfield,String DrinkType);
	
	/**
	 * 根据字段搜索数据
	 * @param currentPage  当前页
	 * @param currentCount  每页的条数
	 * @param searchfield  搜索的字段
	 * @return
	 */
	public List<Drink> findDrinkByName(int currentPage,int currentCount,String searchfield,String DrinkType);
	
	/**
	 * 根据id查询商品的详情信息
	 * @param id
	 * @return
	 */
	public Drink findDrinkById(int id);
}
