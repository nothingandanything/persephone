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

@WebServlet(urlPatterns="/changeCart")
public class ChangeCartController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		CartBiz cartBiz = new CartBizImpl();
		
		// ��ȡ���ĺ������
		String Number_str = req.getParameter("Number");
		int Number = Integer.valueOf(Number_str).intValue();
		String flag = req.getParameter("flag");
		if (flag.equals("plus")) {
			if (Number == 99) {  // �Ѵﵽ��������
				return;
			}
			Number++;
		}
		else if (flag.equals("minus")) {
			if (Number == 1) {  // �Ѵﵽ��������
				return;
			}
			Number--;
		}
		
		// ��ȡsession�е��û���Ϣ
		User user = (User)req.getSession().getAttribute("user");
		int UserID = user.getUserID();

		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String DrinkID_str = req.getParameter("DrinkID");
		int DrinkID = Integer.valueOf(DrinkID_str).intValue();
		String DrinkSweet = req.getParameter("DrinkSweet");
		String DrinkTemp = req.getParameter("DrinkTemp");
		String DrinkSpec = req.getParameter("DrinkSpec");
		if (DrinkSweet.equals("ȫ��")) {
			DrinkSweet = "high";
		}
		else if (DrinkSweet.equals("����")) {
			DrinkSweet = "mid";
		}
		else if (DrinkSweet.equals("����")) {
			DrinkSweet = "low";
		}
		if (DrinkTemp.equals("��")) {
			DrinkTemp = "hot";
		}
		else if (DrinkTemp.equals("����")) {
			DrinkTemp = "normal";
		}
		else if (DrinkTemp.equals("�ӱ�")) {
			DrinkTemp = "cold";
		}
		if (DrinkSpec.equals("������")) {
			DrinkSpec = "super";
		}
		else if (DrinkSpec.equals("��")) {
			DrinkSpec = "big";
		}
		else if (DrinkSpec.equals("�б�")) {
			DrinkSpec = "medium";
		}

		// �Ѳ�����ֵ�����ﳵ����
		CartItem cartItem = new CartItem();
		cartItem.setUserID(UserID);
		cartItem.setDrinkID(DrinkID);
		cartItem.setDrinkSweet(DrinkSweet);
		cartItem.setDrinkTemp(DrinkTemp);
		cartItem.setDrinkSpec(DrinkSpec);
		cartItem.setNumber(Number);
		
		// ����ҵ���߼���ĸ��ķ���
		List<CartItem> list = cartBiz.changeCart(cartItem);
		
		// �����ݴ��ݵ�ǰ̨ҳ��
		Gson gson = new Gson();
		String json = gson.toJson(list);
		resp.getWriter().append(json);
		resp.getWriter().flush();
		resp.getWriter().close();
	}
}