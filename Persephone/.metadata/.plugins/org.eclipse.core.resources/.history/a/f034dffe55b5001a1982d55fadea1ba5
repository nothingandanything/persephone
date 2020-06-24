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

@WebServlet(urlPatterns="/deleteCart")
public class DeleteCartController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 实例化业务逻辑层
		CartBiz cartBiz = new CartBizImpl();
		
		// 读取session中的用户信息
		User user = (User)req.getSession().getAttribute("user");
		int UserID = user.getUserID();

		// 获取从前台页面传过来的参数
		String DrinkID_str = req.getParameter("DrinkID");
		int DrinkID = Integer.valueOf(DrinkID_str).intValue();
		String DrinkSweet = req.getParameter("DrinkSweet");
		String DrinkTemp = req.getParameter("DrinkTemp");
		String DrinkSpec = req.getParameter("DrinkSpec");
		if (DrinkSweet.equals("全糖")) {
			DrinkSweet = "high";
		}
		else if (DrinkSweet.equals("半糖")) {
			DrinkSweet = "mid";
		}
		else if (DrinkSweet.equals("无糖")) {
			DrinkSweet = "low";
		}
		if (DrinkTemp.equals("热")) {
			DrinkTemp = "hot";
		}
		else if (DrinkTemp.equals("常温")) {
			DrinkTemp = "normal";
		}
		else if (DrinkTemp.equals("加冰")) {
			DrinkTemp = "cold";
		}
		if (DrinkSpec.equals("超级杯")) {
			DrinkSpec = "super";
		}
		else if (DrinkSpec.equals("大杯")) {
			DrinkSpec = "big";
		}
		else if (DrinkSpec.equals("中杯")) {
			DrinkSpec = "medium";
		}
		
		// 把参数赋值给购物车对象
		CartItem cartItem = new CartItem();
		cartItem.setUserID(UserID);
		cartItem.setDrinkID(DrinkID);
		cartItem.setDrinkSweet(DrinkSweet);
		cartItem.setDrinkTemp(DrinkTemp);
		cartItem.setDrinkSpec(DrinkSpec);
		cartItem.setNumber(0);
		
		// 调用业务逻辑层的删除方法
		List<CartItem> list = cartBiz.deleteCart(cartItem);

	    // 把数据传递给jsp页面
		Gson gson = new Gson();
		String json = gson.toJson(list);
		resp.getWriter().append(json);
		resp.getWriter().flush();
		resp.getWriter().close();
	}
}
