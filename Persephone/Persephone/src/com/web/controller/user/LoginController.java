package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.biz.UserBiz;
import com.web.biz.impl.UserBizImpl;
import com.web.entity.User;

/**
 * ��½���Ʋ�
 * @author ������
 *
 */
@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// ��ȡ��¼ҳ����Ĳ���ֵ
		String UserName = req.getParameter("UserName");
		String UserPwd = req.getParameter("UserPwd");
		
		// ����ҵ���߼���ĵ�¼����
		UserBiz userBiz = new UserBizImpl();
		User user = userBiz.login(UserName, UserPwd);
		
		if (user != null) {
			// �����û��ĻỰ��Ϣ��session��
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			
			// ��¼�ɹ�
//			resp.getWriter().print("<script>alert('��½�ɹ�!');window.location.href='"
//					+ req.getContextPath() + "/ShowIndex';</script>");
			resp.sendRedirect(req.getContextPath()+"/client/login_success.jsp");
		}
		else {
			// ��¼ʧ��
			resp.getWriter().print("<script>alert('�û������������!');window.location.href='"
					+ req.getContextPath() + "/client/login.jsp';</script>");
//			resp.sendRedirect(req.getContextPath()+"/client/login.jsp");
		}
	}
}
