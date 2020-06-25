package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.OrderBiz;
import com.web.biz.impl.OrderBizImpl;

@WebServlet(urlPatterns="/payOrder")
public class PayOrderController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��ȡ֧��ҳ���Ĳ���
		String OrderID_str = req.getParameter("OrderID");
		int OrderID = Integer.valueOf(OrderID_str).intValue();
		String AddrID_str = req.getParameter("AddrID");
		int AddrID = Integer.valueOf(AddrID_str).intValue();
		
		// ����ҵ���߼����֧����������
		OrderBiz orderBiz = new OrderBizImpl();
		orderBiz.payOrder(OrderID, AddrID);
		
		// ת��
		req.getRequestDispatcher("/showMe").forward(req, resp);
	}
}
