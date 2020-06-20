package com.web.biz.impl;

import com.web.biz.CartBiz;
import com.web.dao.CartDao;
import com.web.dao.impl.CartDaoImpl;
import com.web.entity.CartItem;

/**
 * 购物车的业务逻辑层
 */
public class CartBizImpl implements CartBiz {
	// 实例化数据访问层
	CartDao cd = new CartDaoImpl();
	
	/**
	 * 添加购物车
	 */
	@Override
	public boolean addCart(CartItem cartItem) {
		// 调用数据访问层的添加购物车方法
		return cd.addCart(cartItem);
	}

}
