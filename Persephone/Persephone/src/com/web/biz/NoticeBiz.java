package com.web.biz;

import java.util.List;

import com.web.entity.Notice;

/**
 * �����ҵ���߼���ӿ�
 * @author ASUS
 *
 */
public interface NoticeBiz {

	/**
	 * ǰ̨ϵͳ����ѯ������ӻ��޸ĵ�һ��������Ϣ
	 * @return
	 */
	public List<Notice> getRecentNotice();
}
