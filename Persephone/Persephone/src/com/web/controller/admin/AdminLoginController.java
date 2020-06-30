package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.biz.AdminBiz;
import com.web.biz.impl.AdminBizImpl;
import com.web.entity.Admin;

@WebServlet(urlPatterns="/adminLogin")
public class AdminLoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��ȡ��¼ҳ������Ĳ���ֵ
		String AdminName = req.getParameter("AdminName");
		String AdminPwd = req.getParameter("AdminPwd");
		
		// ����ҵ���߼���ĵ�¼����
		AdminBiz adminBiz = new AdminBizImpl();
		Admin admin = adminBiz.login(AdminName, AdminPwd);
		
		if (admin != null) {
			// �������Ա�ĻỰ��Ϣ��session��
			HttpSession session = req.getSession();
			session.setAttribute("admin", admin);
			
			// ��½�ɹ�
			resp.getWriter().print("<script>alert('��½�ɹ�!');");
			
			// ת��
			resp.sendRedirect(req.getContextPath()+"/showUser");
		}
		else {
			resp.getWriter().print("<script>alert('�û������������!');window.location.href='"
					+ req.getContextPath() + "/admin/login.jsp';</script>");
		}
	}
}