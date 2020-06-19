package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.web.biz.UserBiz;
import com.web.biz.impl.UserBizImpl;
import com.web.entity.User;

/**
 * ע��Ŀ��Ʋ�
 * @author ������
 *
 */
@WebServlet(urlPatterns="/register")
public class RegisterController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String UserCheck = req.getParameter("UserCheck");
		String check = req.getSession().getAttribute("checkcode_session").toString();
		
		if (!UserCheck.equals(check)) {
			// ��������򣬵��������ת��ע��ҳ��
			resp.getWriter().print("<script>alert('��֤�����!');window.location.href='"
					+ req.getContextPath() + "/client/register.jsp';</script>");
		}
		else {
			// ����ҵ���߼����ע�᷽��
			
			// ʵ����ҵ���߼���
			UserBiz userBiz = new UserBizImpl();
			
			// ʵ�����û�����
			User user = new User();
			
		    try {
		    	// �ѱ����еĲ�����ֵ���û�����
//		    	BeanUtils.populate(user, req.getParameterMap());
		    	String UserName = req.getParameter("UserName");
		    	String UserPwd = req.getParameter("UserPwd");
		    	String UserPhone = req.getParameter("UserPhone");
		    	user.setUserName(UserName);
		    	user.setUserPwd(UserPwd);
		    	user.setUserPhone(UserPhone);
				
				// ����ҵ���߼����ע�᷽��
				boolean flag = userBiz.register(user);
				
				if(flag) {  // ���ע��ɹ�
					resp.getWriter().print("<script>alert('ע��ɹ�!');window.location.href='"
							+ req.getContextPath() + "/client/login.jsp';</script>");
//					resp.sendRedirect(req.getContextPath()+"/client/registerSuccess.jsp");
				}
				else
					resp.sendRedirect(req.getContextPath()+"/client/register.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}