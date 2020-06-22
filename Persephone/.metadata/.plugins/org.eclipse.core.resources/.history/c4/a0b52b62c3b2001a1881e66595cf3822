package com.web.biz;

import com.web.entity.Drink;
import com.web.util.PageBean;

public interface ProductBiz {
	/**
	 * 根据类别分页查询数据信息
	 * @param currentPage  当前页码
	 * @param currentCount  每页显示的条数
	 * @param category   类别
	 * @return
	 */
	public PageBean findDrinkByPage(int currentPage,int currentCount,String category);
	
	/**
	 * 根据名称模糊查询
	 * @param currentPage
	 * @param currentCount
	 * @param searchfield
	 * @return
	 */
	public PageBean findDrinkByName(int currentPage,int currentCount,String searchfield);
	
	/**
	 * 根据id查询商品详情
	 * @param id
	 * @return
	 */
	public Drink findDrinkById(int id);
}
