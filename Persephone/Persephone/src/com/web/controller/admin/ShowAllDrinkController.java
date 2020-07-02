package com.web.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.ProductBiz;
import com.web.biz.impl.ProductBizImpl;
import com.web.entity.Drink;

@WebServlet(urlPatterns="/showAllDrink")
public class ShowAllDrinkController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ����ҵ���߼���ķ���
		ProductBiz productBiz = new ProductBizImpl();
		List<Drink> list = productBiz.showAllDrink();
		
		// �����ݴ���������
		req.setAttribute("drinkList", list);

		// ת��
		req.getRequestDispatcher("/admin/drinktable.jsp").forward(req, resp);
	}
}
