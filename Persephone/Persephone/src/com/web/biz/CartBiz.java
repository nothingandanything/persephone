package com.web.biz;

import com.web.entity.CartItem;

/**
 * 购物车的业务逻辑层实现类
 * @author 王佳祺
 *
 */
public interface CartBiz {
	/**
	 * 添加购物车
	 * @param id
	 * @param sweet
	 * @param temp
	 * @param spec
	 * @param num
	 * @return
	 */
	public boolean addCart(CartItem cartItem);
}
