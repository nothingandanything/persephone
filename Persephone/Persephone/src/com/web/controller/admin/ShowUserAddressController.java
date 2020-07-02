package com.web.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.AddressBiz;
import com.web.biz.impl.AddressBizImpl;
import com.web.entity.UserAddr;

@WebServlet(urlPatterns="/showUserAddress")
public class ShowUserAddressController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ����ҵ���߼���ķ���
		AddressBiz addressBiz = new AddressBizImpl();
		List<UserAddr> list = addressBiz.showAllAddress();
		
		// �����ݴ���������
		req.setAttribute("addressList", list);

		// ת��
		req.getRequestDispatcher("/admin/addresstable.jsp").forward(req, resp);
	}
}
