package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.AdminBiz;
import com.web.biz.impl.AdminBizImpl;
import com.web.entity.Admin;

@WebServlet(urlPatterns="/addAdmin")
public class AddAdminController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ����ҵ���߼���ķ���
		AdminBiz adminBiz = new AdminBizImpl();
				
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String AdminName = req.getParameter("add-adname");
		String AdminPwd = req.getParameter("add-adpwd");
		
		// �Ѳ�����ֵ���û�����
		Admin admin = new Admin();
		admin.setAdminName(AdminName);
		admin.setAdminPwd(AdminPwd);
				
		// ����ҵ���߼���ķ���
		boolean flag = adminBiz.addAdmin(admin);
				
		if (flag) {
			resp.getWriter().print("<script>alert('��ӳɹ�');window.location.href='"
					+ req.getContextPath() + "/showAdmin';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('���ʧ��');window.location.href='"
					+ req.getContextPath() + "/showAdmin';</script>");
		}
	}
}
