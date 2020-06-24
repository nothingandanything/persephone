package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.OrderBiz;
import com.web.biz.impl.OrderBizImpl;
import com.web.entity.DrinkOrder;

@WebServlet(urlPatterns="/checkout")
public class ShowCheckoutController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��ȡOrderID
		String OrderID_str = req.getParameter("OrderID");
		int OrderID = Integer.valueOf(OrderID_str).intValue();
		
		// ����ҵ���߼���Ĳ�ѯ����
		OrderBiz orderBiz = new OrderBizImpl();
		DrinkOrder drinkOrder = orderBiz.findOrderById(OrderID);
		
		// �����ݴ���������
		req.setAttribute("order", drinkOrder);
		
		// ת��
		req.getRequestDispatcher("/client/checkout.jsp").forward(req, resp);
	}
}