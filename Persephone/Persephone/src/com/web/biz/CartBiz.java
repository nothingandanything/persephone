package com.web.biz;

import java.util.List;

import com.web.entity.CartItem;

/**
 * ���ﳵ��ҵ���߼���ʵ����
 * @author ������
 *
 */
public interface CartBiz {
	/**
	 * ��ӹ��ﳵ
	 * @param id
	 * @param sweet
	 * @param temp
	 * @param spec
	 * @param num
	 * @return
	 */
	public boolean addCart(CartItem cartItem);
	
	/**
	 * ��ѯ���ﳵ�е���Ʒ
	 * @param UserID
	 * @return
	 */
	public List<CartItem> showCart(int UserID);
}
