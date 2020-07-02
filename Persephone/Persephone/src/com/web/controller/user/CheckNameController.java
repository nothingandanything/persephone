package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.UserBiz;
import com.web.biz.impl.UserBizImpl;

@WebServlet(urlPatterns="/checkName")
public class CheckNameController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String UserName = req.getParameter("UserName");
		
		// ����ҵ���߼���ķ���
		UserBiz userBiz = new UserBizImpl();
		boolean flag = userBiz.checkName(UserName);
		
		if (flag)
			resp.getWriter().append("same");
		else
			resp.getWriter().append("notSame");
	}
}