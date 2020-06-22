package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.web.biz.ProductBiz;
import com.web.biz.impl.ProductBizImpl;
import com.web.entity.Drink;

/**
 * ����id��ѯ��Ʒ������Ʋ�
 * @author ������
 *
 */
@WebServlet(urlPatterns="/findProductById")
public class FindProductByIdController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		ProductBiz productBiz = new ProductBizImpl();
		
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String id_str = req.getParameter("id");
		int id = Integer.valueOf(id_str).intValue();
		
		// ����ҵ���߼������id��ѯ��Ʒ������Ϣ
		Drink drink = productBiz.findDrinkById(id);
		
		// �����ݴ��ݵ�ǰ̨ҳ��
//		req.setAttribute("drinkByID", drink);
		Gson gson = new Gson();
		String json = gson.toJson(drink);
		resp.getWriter().append(json);
		
//		req.getRequestDispatcher("/client/info.jsp").forward(req, resp);
	}
}