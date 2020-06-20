package com.web.biz.impl;

import com.web.biz.CartBiz;
import com.web.dao.CartDao;
import com.web.dao.impl.CartDaoImpl;
import com.web.entity.CartItem;

/**
 * ���ﳵ��ҵ���߼���
 */
public class CartBizImpl implements CartBiz {
	// ʵ�������ݷ��ʲ�
	CartDao cd = new CartDaoImpl();
	
	/**
	 * ��ӹ��ﳵ
	 */
	@Override
	public boolean addCart(CartItem cartItem) {
		// �������ݷ��ʲ����ӹ��ﳵ����
		return cd.addCart(cartItem);
	}

}
