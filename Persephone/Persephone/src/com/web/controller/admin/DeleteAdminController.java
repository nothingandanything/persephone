package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.AdminBiz;
import com.web.biz.impl.AdminBizImpl;

@WebServlet(urlPatterns="/deleteAdmin")
public class DeleteAdminController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		AdminBiz adminBiz = new AdminBizImpl();
				
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String AdminID_str = req.getParameter("AdminID");
		int AdminID = Integer.valueOf(AdminID_str).intValue();
		
		// ����ҵ���߼���ĸ��ķ���
		boolean flag = adminBiz.deleteAdmin(AdminID);
				
		if (flag) {
			resp.getWriter().print("<script>alert('ɾ���ɹ�');window.location.href='"
					+ req.getContextPath() + "/showAdmin';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('ɾ��ʧ��');window.location.href='"
					+ req.getContextPath() + "/showAdmin';</script>");
		}
	}
}
