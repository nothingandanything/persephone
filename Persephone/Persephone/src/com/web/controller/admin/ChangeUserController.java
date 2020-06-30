package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.UserBiz;
import com.web.biz.impl.UserBizImpl;
import com.web.entity.User;

@WebServlet(urlPatterns="/changeUser")
public class ChangeUserController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		UserBiz userBiz = new UserBizImpl();
		
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String UserID_str = req.getParameter("update-id");
		int UserID = Integer.valueOf(UserID_str).intValue();
		String UserName = req.getParameter("update-name");
		String UserPwd = req.getParameter("update-pwd");
		String UserPhone = req.getParameter("update-pho");
		
		// �Ѳ�����ֵ���û�����
		User user = new User();
		user.setUserID(UserID);
		user.setUserName(UserName);
		user.setUserPwd(UserPwd);
		user.setUserPhone(UserPhone);
		
		// ����ҵ���߼���ĸ��ķ���
		boolean flag = userBiz.changeUser(user);
		
		if (flag) {
			resp.getWriter().print("<script>alert('�޸ĳɹ�!');window.location.href='"
					+ req.getContextPath() + "/showUser';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('�޸�ʧ��!');window.location.href='"
					+ req.getContextPath() + "/showUser';</script>");
		}

		// ת��
//		resp.sendRedirect(req.getContextPath()+"/showUser");
	}
}