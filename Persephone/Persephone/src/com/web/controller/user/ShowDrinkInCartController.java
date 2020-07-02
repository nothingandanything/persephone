package com.web.controller.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.web.biz.CartBiz;
import com.web.biz.impl.CartBizImpl;
import com.web.entity.CartItem;
import com.web.entity.User;

@WebServlet(urlPatterns="/showCart")
public class ShowDrinkInCartController extends HttpServlet {
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
		if(user == null){
			// δ��½
			resp.getWriter().print("<script>alert('δ��½��');window.location.href='"
				+ req.getContextPath() + "/client/login.jsp';</script>");
			return;
		}
		int UserID = user.getUserID();
		
		// ����ҵ���߼���Ĳ�ѯ����
		List<CartItem> list = cartBiz.showCart(UserID);
		
		// �ж��Ƿ����첽����
		String flag = req.getParameter("flag");
		if(flag == null){
			// �����ݴ��ݸ�jspҳ��
			req.setAttribute("CartItem", list);
			
			// ת����תҳ��
			req.getRequestDispatcher("/client/cart.jsp").forward(req, resp);
		}
		else {
			// �����ݴ��ݵ�ǰ̨ҳ��
			Gson gson = new Gson();
			String json = gson.toJson(list);
			resp.getWriter().append(json);
			resp.getWriter().flush();
			resp.getWriter().close();
		}
	}
}
