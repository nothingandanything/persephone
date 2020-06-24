package com.web.biz.impl;

import java.util.ArrayList;
import java.util.List;

import com.web.biz.CartBiz;
import com.web.biz.OrderBiz;
import com.web.biz.OrderItemBiz;
import com.web.dao.OrderDao;
import com.web.dao.impl.OrderDaoImpl;
import com.web.entity.DrinkOrder;
import com.web.entity.OrderItem;
import com.web.entity.User;

public class OrderBizImpl implements OrderBiz {
	// ʵ�������������ݷ��ʲ�
	OrderDao orderDao = new OrderDaoImpl();

	// ʵ����������Ŀ��ҵ���߼���
	OrderItemBiz orderItemBiz = new OrderItemBizImpl();
	
	// ʵ�������ﳵ��ҵ���߼���
	CartBiz cartBiz = new CartBizImpl();
	
	/**
	 * ��Ӷ���
	 */
	@Override
	public int addOrder(DrinkOrder drinkOrder) {
		
		int OrderID = 0;
		
		try {
			// ��Ӷ���
			orderDao.addOrder(drinkOrder);
			OrderID = orderDao.getOrderId();
			
			// ��չ��ﳵ
			cartBiz.clearCart(drinkOrder.getUserID());
			 
			// ��ȡ��������Ŀ��Ϣ
			List<OrderItem> list = drinkOrder.getOrderItems();
			
			// ѭ��
			for (OrderItem orderItem : list) {
				 // ��Ӷ�����Ŀ
				orderItem.setOrderID(OrderID);
				orderItemBiz.addOrderItem(orderItem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return OrderID;
	}

	/**
	 * ����id��ѯ������Ϣ
	 */
	@Override
	public DrinkOrder findOrderById(int OrderID) {
		// ��ѯ��������Ϣ
		DrinkOrder drinkOrder = orderDao.findOrderById(OrderID);
				
		// ��ѯ���������Ϣ
		List<OrderItem> orderItemList = orderItemBiz.findOrderItemByOrder(drinkOrder);
		
		// ���ö����Ķ�����
		drinkOrder.setOrderItems(orderItemList);
		return drinkOrder;
	}

	/**
	 * �����û���Ϣ��ѯ������Ϣ
	 */
	@Override
	public List<DrinkOrder> findOrderByUser(User user) {
		// ��ѯ��������Ϣ
		List<DrinkOrder> list = orderDao.findOrderByUser(user);
		
		// ѭ����ѯÿһ�������Ķ��������Ϣ
		for(DrinkOrder drinkOrder : list) {
			List<OrderItem> orderItemList = orderItemBiz.findOrderItemByOrder(drinkOrder);
			drinkOrder.setOrderItems(orderItemList);
		}
		return list;
	}

	/**
	 * ȡ������
	 */
	@Override
	public boolean cancelOrder(int OrderID) {
		return orderDao.cancelOrder(OrderID);
	}

}
