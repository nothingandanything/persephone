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

@WebServlet(urlPatterns="/changeAdmin")
public class ChangeAdminController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		AdminBiz adminBiz = new AdminBizImpl();
		
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String AdminID_str = req.getParameter("update-adid");
		int AdminID = Integer.valueOf(AdminID_str).intValue();
		String AdminName = req.getParameter("update-adname");
		String AdminPwd = req.getParameter("update-adpwd");
		
		// �Ѳ�����ֵ���û�����
		Admin admin = new Admin();
		admin.setAdminID(AdminID);
		admin.setAdminName(AdminName);
		admin.setAdminPwd(AdminPwd);
		
		// ����ҵ���߼���ĸ��ķ���
		boolean flag = adminBiz.changeAdmin(admin);
		
		if (flag) {
			resp.getWriter().print("<script>alert('�޸ĳɹ�');window.location.href='"
					+ req.getContextPath() + "/showAdmin';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('�޸�ʧ��');window.location.href='"
					+ req.getContextPath() + "/showAdmin';</script>");
		}
	}
}

