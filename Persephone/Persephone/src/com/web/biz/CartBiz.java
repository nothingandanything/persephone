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
	
	/**
	 * ɾ�����ﳵ�е���Ʒ
	 * @param UserID
	 * @param DrinkID
	 * @return
	 */
	public List<CartItem> deleteCart(CartItem cartItem);
	
	/**
	 * �ı乺�ﳵ����
	 * @param UserID
	 * @param DrinkID
	 * @param Number
	 * @return
	 */
	public List<CartItem> changeCart(CartItem cartItem);
	
	 /**
	  * ��չ��ﳵ
	  * @param UserID
	  * @return
	  */
	 public boolean clearCart(int UserID);
}
