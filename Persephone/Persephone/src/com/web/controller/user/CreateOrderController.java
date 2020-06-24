package com.web.controller.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.CartBiz;
import com.web.biz.OrderBiz;
import com.web.biz.impl.CartBizImpl;
import com.web.biz.impl.OrderBizImpl;
import com.web.entity.CartItem;
import com.web.entity.DrinkOrder;
import com.web.entity.OrderItem;
import com.web.entity.User;

@WebServlet(urlPatterns="/createOrder")
public class CreateOrderController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��ȡsession�е��û���Ϣ
		User user = (User)req.getSession().getAttribute("user");
		int UserID = user.getUserID();
		
		// ��ȡ���ﳵ��Ϣ
		CartBiz cartBiz = new CartBizImpl();
		List<CartItem> cart = cartBiz.showCart(UserID);
		
		// ���ö�������Ϣ
		DrinkOrder drinkOrder = new DrinkOrder();
		drinkOrder.setUserID(UserID);
		drinkOrder.setUser(user);
		float TotalPrice = 0;
		
		// ���ö�����Ŀ��Ϣ
		for(CartItem cartItem : cart){
			// ʵ����������Ŀ
			OrderItem orderItem = new OrderItem();
			
			// ��������
			orderItem.setDrinkID(cartItem.getDrinkID());
			orderItem.setDrink(cartItem.getDrink());
			orderItem.setDrinkSweet(cartItem.getDrinkSweet());
			orderItem.setDrinkTemp(cartItem.getDrinkTemp());
			orderItem.setDrinkSpec(cartItem.getDrinkSpec());
			orderItem.setNumber(cartItem.getNumber());
			
			// �����ܼ�
			if(orderItem.getDrinkSpec().equals("������")){
				TotalPrice = TotalPrice + orderItem.getDrink().getDrinkPrice_Super() * orderItem.getNumber();
			}
			else if(orderItem.getDrinkSpec().equals("��")){
				TotalPrice = TotalPrice + orderItem.getDrink().getDrinkPrice_Big() * orderItem.getNumber();
			}
			else if(orderItem.getDrinkSpec().equals("�б�")){
				TotalPrice = TotalPrice + orderItem.getDrink().getDrinkPrice_Medium() * orderItem.getNumber();
			}
			
			// �򶩵������Ӷ�����Ŀ��Ϣ
			drinkOrder.getOrderItems().add(orderItem);	
		}
		drinkOrder.setTotalPrice(TotalPrice);
		
		// ʵ����������ҵ���߼���
		OrderBiz orderBiz = new OrderBizImpl();
		int OrderID = orderBiz.addOrder(drinkOrder);
		
		resp.sendRedirect(req.getContextPath()+"/checkout?OrderID=" + OrderID);
	}
}