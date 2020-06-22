package com.web.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.ProductBiz;
import com.web.biz.impl.ProductBizImpl;
import com.web.util.PageBean;

/**
 * ��Ʒչʾ�Ŀ��Ʋ�
 * @author ������
 *
 */
@WebServlet(urlPatterns="/showProductByPage")
public class ShowDrinkByPageController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// ʵ������Ʒ��ҵ���߼���
		ProductBiz DrinkBiz = new ProductBizImpl();
		
		// ���嵱ǰҳ�룬Ĭ��Ϊ1
		Integer currentPage = 1;
		String _currentPage = req.getParameter("currentPage");
		
		// �жϴ�������ҳ�����Ƿ�Ϊ��
		if(_currentPage != null){
			// ���ַ���ת��Ϊ����
			currentPage = Integer.parseInt(_currentPage);
		}
		
		// ����ÿҳ��ʾ������Ĭ��Ϊ8
		Integer currentCount = 8;
		String _currentCount = req.getParameter("currentCount");
		
		// �жϴ�������ÿҳ��ʾ�������Ƿ�Ϊ��
		if(_currentCount != null){
			// ���ַ���ת��Ϊ����
			currentCount = Integer.parseInt(_currentCount);
		}
		
		// ������ҵķ���Ĭ��Ϊȫ����Ʒ
		String DrinkType = "All";
		String _DrinkType = req.getParameter("DrinkType");
		
		// �ж��Ƿ���ݷ����ѯ����
		if(_DrinkType != null){
			DrinkType = _DrinkType;
		}
		
		// ����ҵ���߼���ķ����ѯ����
		PageBean bean = DrinkBiz.findDrinkByPage(currentPage, currentCount, DrinkType);
	
	    // �����ݴ��ݸ�jspҳ��
		req.setAttribute("bean", bean);
		
		// ת����תҳ��
		req.getRequestDispatcher("/client/shop.jsp").forward(req, resp);
		
	}
	
	
	
	
	
	
	
	
	
	

}