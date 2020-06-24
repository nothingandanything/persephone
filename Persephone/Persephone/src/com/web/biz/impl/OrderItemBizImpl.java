package com.web.biz.impl;

import java.util.List;

import com.web.biz.OrderItemBiz;
import com.web.dao.OrderItemDao;
import com.web.dao.impl.OrderItemDaoImpl;
import com.web.entity.DrinkOrder;
import com.web.entity.OrderItem;

public class OrderItemBizImpl implements OrderItemBiz {
	// 实例化数据访问层
	OrderItemDao orderItemDao = new OrderItemDaoImpl();
		
	/**
	 * 添加订单条目
	 */
	@Override
	public boolean addOrderItem(OrderItem orderItem) {
		return orderItemDao.addOrderItem(orderItem);
	}

	/**
	 * 根据订单查询订单项
	 */
	@Override
	public List<OrderItem> findOrderItemByOrder(DrinkOrder drinkOrder) {
		return orderItemDao.findOrderItemByOrder(drinkOrder);
	}

	/**
	 * 取消订单中的订单项
	 */
	@Override
	public boolean cancelOrderItem(int OrderID) {
		return orderItemDao.cancelOrderItem(OrderID);
	}

}
