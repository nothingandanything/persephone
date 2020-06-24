package com.web.dao;

import java.util.List;

import com.web.entity.DrinkOrder;
import com.web.entity.OrderItem;

public interface OrderItemDao {
	/**
	 * 添加订单条目
	 * @param orderItem
	 * @return
	 */
	public boolean addOrderItem(OrderItem orderItem);
	
	/**
	 * 根据订单查询订单项
	 * @param drinkOrder
	 * @return
	 */
	public List<OrderItem> findOrderItemByOrder(DrinkOrder drinkOrder);
	
	/**
	 * 取消订单中的订单项
	 * @param OrderID
	 * @return
	 */
	public boolean cancelOrderItem(int OrderID);
}
