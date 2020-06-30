package com.web.controller.user;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.AddressBiz;
import com.web.biz.impl.AddressBizImpl;
import com.web.entity.User;
import com.web.entity.UserAddr;



/**
 * ��ӵ�ַ�Ŀ��Ʋ�
 * @author ASUS-PC
 *
 */
@WebServlet(urlPatterns="/addAddress")
public class AddAddrController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//����ҵ���߼����ע�᷽��
		
		//ʵ����ҵ���߼���
		AddressBiz addressBiz = new AddressBizImpl();
		
		
		
		//ʵ�����û�����
		UserAddr userAddr = new UserAddr();
		User user = (User)req.getSession().getAttribute("user");
		int UserID = user.getUserID();

		String City = req.getParameter("City");
		String County = req.getParameter("County");
		String Street = req.getParameter("Street");
		String HouseNum = req.getParameter("HouseNum");
				
		
		userAddr.setUserID(UserID);
		userAddr.setCity(City);
		userAddr.setCounty(County);
		userAddr.setStreet(Street);
		userAddr.setHouseNum(HouseNum);
	

		
/*	    try {
	    	//�ѱ��еĲ�����ֵ���û�����
			BeanUtils.populate(userAddr, req.getParameterMap());
			
			//����ҵ���߼������ӵ�ַ�ķ���
			boolean flag = addressBiz.addAddress(userAddr);
			
			if(flag){//�����ӵ�ַ�ɹ�
				
				//req.getContextPath():��ȡ����·��
				resp.sendRedirect(req.getContextPath()+"/client/addAddrSuccess.jsp");
			}else{
				//req.getContextPath():��ȡ����·��
				resp.sendRedirect(req.getContextPath()+"/client/index.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	    
	    boolean flag = addressBiz.addAddress(userAddr);

		// ת����תҳ��
	    resp.sendRedirect(req.getContextPath()+"/showMe");
	
	
	}
}
