package com.web.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.OrderBiz;
import com.web.biz.impl.OrderBizImpl;
import com.web.entity.DrinkOrder;

@WebServlet(urlPatterns="/showOrder")
public class ShowOrderController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ����ҵ���߼���ķ���
		OrderBiz orderBiz = new OrderBizImpl();
		List<DrinkOrder> list = orderBiz.showOrder();
		
		// �����ݴ���������
		req.setAttribute("orderList", list);

		// ת��
		req.getRequestDispatcher("/admin/ordertable.jsp").forward(req, resp);
	}
}
