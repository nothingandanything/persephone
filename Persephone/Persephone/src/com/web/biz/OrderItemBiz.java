package com.web.biz;

import java.util.List;

import com.web.entity.DrinkOrder;
import com.web.entity.OrderItem;

public interface OrderItemBiz {
	/**
	 * ���Ӷ�����Ŀ
	 * @param orderItem
	 * @return
	 */
	public boolean addOrderItem(OrderItem orderItem);
	
	/**
	 * ����id��ѯ������
	 * @param drinkOrder
	 * @return
	 */
	public List<OrderItem> findOrderItemByOrder(DrinkOrder drinkOrder);
	
	/**
	 * ȡ�������еĶ�����
	 * @param OrderID
	 * @return
	 */
	public boolean cancelOrderItem(int OrderID);
}