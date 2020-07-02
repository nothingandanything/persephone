package com.web.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.AdminBiz;
import com.web.biz.impl.AdminBizImpl;
import com.web.entity.Admin;

@WebServlet(urlPatterns="/showAdmin")
public class ShowAdminController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ����ҵ���߼���ķ���
		AdminBiz adminBiz = new AdminBizImpl();
		List<Admin> list = adminBiz.showAdmin();
		
		// �����ݴ���������
		req.setAttribute("adminList", list);

		// ת��
		req.getRequestDispatcher("/admin/admintable.jsp").forward(req, resp);
	}
}
