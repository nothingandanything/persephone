package com.web.controller.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.biz.AddressBiz;
import com.web.biz.OrderBiz;
import com.web.biz.impl.AddressBizImpl;
import com.web.biz.impl.OrderBizImpl;
import com.web.entity.DrinkOrder;
import com.web.entity.User;
import com.web.entity.UserAddr;

@WebServlet(urlPatterns="/showMe")
public class ShowMeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��ȡ�û�����Ϣ
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		// �����û�����Ϣ��ѯ������Ϣ
		OrderBiz orderBiz = new OrderBizImpl();
		List<DrinkOrder> orderList = orderBiz.findOrderByUser(user);
		
		// �����û�����Ϣ��ѯ��ַ��Ϣ
		AddressBiz addressBiz = new AddressBizImpl();
		List<UserAddr> addrList = addressBiz.showAddress(user.getUserID());
		
		// ��������Ϣ���ݵ�ǰ̨
		req.setAttribute("orderList", orderList);
		req.setAttribute("addrList", addrList);
		
		// ת����תҳ��
		req.getRequestDispatcher("/client/me.jsp").forward(req, resp);
	}
}