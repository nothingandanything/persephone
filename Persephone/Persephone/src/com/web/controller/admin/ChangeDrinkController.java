package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.ProductBiz;
import com.web.biz.impl.ProductBizImpl;
import com.web.entity.Drink;

@WebServlet(urlPatterns="/changeDrink")
public class ChangeDrinkController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		ProductBiz productBiz = new ProductBizImpl();
		
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String DrinkID_str = req.getParameter("update-DrinkID");
		int DrinkID = Integer.valueOf(DrinkID_str).intValue();
		String DrinkName = req.getParameter("update-DrinkName");
		String DrinkPrice_Super_str = req.getParameter("update-DrinkPrice_Super");
		float DrinkPrice_Super = Float.parseFloat(DrinkPrice_Super_str);
		String DrinkPrice_Big_str = req.getParameter("update-DrinkPrice_Big");
		float DrinkPrice_Big = Float.parseFloat(DrinkPrice_Big_str);
		String DrinkPrice_Medium_str = req.getParameter("update-DrinkPrice_Medium");
		float DrinkPrice_Medium = Float.parseFloat(DrinkPrice_Medium_str);
		String DrinkType = req.getParameter("update-DrinkType");
		String DrinkDesc = req.getParameter("update-DrinkDesc");
		String PicAddres = req.getParameter("update-PicAddres");
		
		// �Ѳ�����ֵ���û�����
		Drink drink = new Drink();
		drink.setDrinkID(DrinkID);
		drink.setDrinkName(DrinkName);
		drink.setDrinkPrice_Super(DrinkPrice_Super);
		drink.setDrinkPrice_Big(DrinkPrice_Big);
		drink.setDrinkPrice_Medium(DrinkPrice_Medium);
		drink.setDrinkType(DrinkType);
		drink.setDrinkDesc(DrinkDesc);
		drink.setPicAddres(PicAddres);
		
		// ����ҵ���߼���ķ���
		boolean flag = productBiz.changeDrink(drink);
				
		if (flag) {
			resp.getWriter().print("<script>alert('�޸ĳɹ�!');window.location.href='"
					+ req.getContextPath() + "/showAllDrink';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('�޸�ʧ��!');window.location.href='"
					+ req.getContextPath() + "/showAllDrink';</script>");
		}
	}
}
