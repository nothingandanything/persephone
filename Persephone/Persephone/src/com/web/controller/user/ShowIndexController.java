package com.web.controller.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.biz.NoticeBiz;
import com.web.biz.impl.NoticeBizImpl;
import com.web.entity.Notice;

/**
 * ��ʾ��ҳ�Ŀ��Ʋ�
 * @author ASUS
 *
 */
@WebServlet(urlPatterns="/ShowIndex")
public class ShowIndexController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//��ѯ��������Ϣ
		//ʵ����������ҵ���߼���
		NoticeBiz noticeBiz = new NoticeBizImpl();
		
		//���ò�ѯ���¹�����Ϣ�ķ���
		List<Notice> noticeList = noticeBiz.getRecentNotice();
		
		//�ѹ�����Ϣ���ݵ�ǰ̨ҳ��
		req.setAttribute("noticeList", noticeList);
		
		//��ѯ������������Ʒ��Ϣ
	//	ProductBiz ProductBiz = new ProductBizImpl();
		
		//��ѯ���ܵ�������Ʒ
//		List<Object[]> ProductList = ProductBiz.getWeekHotProduct();
		
		//�ѱ�����������Ʒ��Ϣ���ݵ�ǰ̨
//		req.setAttribute("ProductList", ProductList);
		
		//ת����תҳ��
		req.getRequestDispatcher("/client/hot_sale.jsp").include(req, resp);
		
	}	
}