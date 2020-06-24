package com.web.dao;

import java.util.List;

import com.web.entity.DrinkOrder;
import com.web.entity.User;

public interface OrderDao {
	/**
	 * ���Ӷ���
	 * @param drinkOrder
	 * @return
	 */
	public boolean addOrder(DrinkOrder drinkOrder);
	
	/**
	 * ��ȡ����id
	 * @return
	 */
	public int getOrderId();
	
	/**
	 * ����id��ѯ������Ϣ
	 * @param OrderID
	 * @return
	 */
	public DrinkOrder findOrderById(int OrderID);
	
	/**
	 * �����û���Ϣ��ѯ������Ϣ
	 * @param user
	 * @return
	 */
	public List<DrinkOrder> findOrderByUser(User user);
	
	/**
	 * ȡ������
	 * @param OrderId
	 * @return
	 */
	public boolean cancelOrder(int OrderID);
}