package com.web.biz.impl;

import java.util.List;

import com.web.biz.NoticeBiz;
import com.web.dao.NoticeDao;
import com.web.dao.impl.NoticeDaoImpl;
import com.web.entity.Notice;

/**
 * �����ҵ���߼���ʵ����
 * @author ASUS
 *
 */
public class NoticeBizImpl implements NoticeBiz {
	
	//ʵ�������ݷ��ʲ�
	NoticeDao noticeDao = new NoticeDaoImpl();

	/**
	 * ǰ̨ϵͳ����ѯ������ӻ��޸ĵ�һ��������Ϣ
	 * @return
	 */
	@Override
	public List<Notice> getRecentNotice() {
		
		return noticeDao.getRecentNotice();
	}

}
