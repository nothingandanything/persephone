package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.ProductBiz;
import com.web.biz.impl.ProductBizImpl;

@WebServlet(urlPatterns="/deleteDrink")
public class DeleteDrinkController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		ProductBiz productBiz = new ProductBizImpl();
				
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String DrinkID_str = req.getParameter("DrinkID");
		int DrinkID = Integer.valueOf(DrinkID_str).intValue();
		
		// ����ҵ���߼���ķ���
		boolean flag = productBiz.deleteDrink(DrinkID);
				
		if (flag) {
			resp.getWriter().print("<script>alert('ɾ���ɹ�!');window.location.href='"
					+ req.getContextPath() + "/showAllDrink';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('ɾ��ʧ��!');window.location.href='"
					+ req.getContextPath() + "/showAllDrink';</script>");
		}
	}
}
