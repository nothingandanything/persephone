package com.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.AddressBiz;
import com.web.biz.impl.AddressBizImpl;

@WebServlet(urlPatterns="/deleteAddress")
public class DeleteAddressController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ʵ����ҵ���߼���
		AddressBiz addressBiz = new AddressBizImpl();
				
		// ��ȡ��ǰ̨ҳ�洫�����Ĳ���
		String AddrID_str = req.getParameter("AddrID");
		int AddrID = Integer.valueOf(AddrID_str).intValue();
		
		// ����ҵ���߼���ĸ��ķ���
		boolean flag = addressBiz.delAddress(AddrID);
				
		if (flag) {
			resp.getWriter().print("<script>alert('ɾ���ɹ�');window.location.href='"
					+ req.getContextPath() + "/showUserAddress';</script>");
		}
		else {
			resp.getWriter().print("<script>alert('ɾ��ʧ��');window.location.href='"
					+ req.getContextPath() + "/showUserAddress';</script>");
		}
	}
}
