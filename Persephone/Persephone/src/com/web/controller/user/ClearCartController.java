package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.CartBiz;
import com.web.biz.impl.CartBizImpl;
import com.web.entity.User;

@WebServlet(urlPatterns="/clearCart")
public class ClearCartController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		CartBiz cartBiz = new CartBizImpl();
				
		// ��ȡsession�е��û���Ϣ
		User user = (User)req.getSession().getAttribute("user");
		int UserID = user.getUserID();
		
		// ����ҵ���߼������շ���
		cartBiz.clearCart(UserID);
		
		// ��ת��ȫ����Ʒҳ
		resp.sendRedirect(req.getContextPath()+"/showProductByPage?DrinkType=All");
	}
}
