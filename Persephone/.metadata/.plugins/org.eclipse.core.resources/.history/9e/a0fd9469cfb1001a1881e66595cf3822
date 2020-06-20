package com.web.biz.impl;

import java.util.List;

import com.web.biz.ProductBiz;
import com.web.dao.ProductDao;
import com.web.dao.impl.ProductDaoImpl;
import com.web.entity.Drink;
import com.web.util.PageBean;

public class ProductBizImpl implements ProductBiz {
	// 实例化数据访问层
	ProductDao productDao = new ProductDaoImpl();
	
	/**
	 * 根据名称模糊查询
	 */
	@Override
	public PageBean findDrinkByName(int currentPage, int currentCount, String searchfield) {
		PageBean bean = new PageBean();

		// 设置每页显示的条数
		bean.setCurrentCount(currentCount);
				
		// 设置当前页码
		bean.setCurrentPage(currentPage);
				
		// 设置数据信息
		List<Drink> list = productDao.findDrinkByName(currentPage, currentCount, searchfield);
		bean.setProductList(list);
				
		// 设置搜索的字段
		bean.setSearchfield(searchfield);
				
		// 设置总条数
		Integer totalCount = productDao.findDrinkByNameAllCount(searchfield);
		bean.setTotalCount(totalCount);
				
		return bean;
	}

}
