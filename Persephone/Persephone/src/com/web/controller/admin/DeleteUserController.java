package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.UserBiz;
import com.web.biz.impl.UserBizImpl;

@WebServlet(urlPatterns="/deleteUser")
public class DeleteUserController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		UserBiz userBiz = new UserBizImpl();
				
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String UserID_str = req.getParameter("UserID");
		int UserID = Integer.valueOf(UserID_str).intValue();
		
		// ����ҵ���߼���ĸ��ķ���
		boolean flag = userBiz.deleteUser(UserID);
				
		if (flag) {
			resp.getWriter().print("<script>alert('ɾ���ɹ�!');window.location.href='"
					+ req.getContextPath() + "/showUser';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('ɾ��ʧ��!');window.location.href='"
					+ req.getContextPath() + "/showUser';</script>");
		}
		
		// ת��
//		resp.sendRedirect(req.getContextPath()+"/showUser");
	}
}