package com.web.biz.impl;

import java.util.List;

import com.web.biz.OrderItemBiz;
import com.web.dao.OrderItemDao;
import com.web.dao.impl.OrderItemDaoImpl;
import com.web.entity.DrinkOrder;
import com.web.entity.OrderItem;

public class OrderItemBizImpl implements OrderItemBiz {
	// ʵ�������ݷ��ʲ�
	OrderItemDao orderItemDao = new OrderItemDaoImpl();
		
	/**
	 * ��Ӷ�����Ŀ
	 */
	@Override
	public boolean addOrderItem(OrderItem orderItem) {
		return orderItemDao.addOrderItem(orderItem);
	}

	/**
	 * ���ݶ�����ѯ������
	 */
	@Override
	public List<OrderItem> findOrderItemByOrder(DrinkOrder drinkOrder) {
		return orderItemDao.findOrderItemByOrder(drinkOrder);
	}

	/**
	 * ȡ�������еĶ�����
	 */
	@Override
	public boolean cancelOrderItem(int OrderID) {
		return orderItemDao.cancelOrderItem(OrderID);
	}

}
