package com.web.dao;

import java.util.List;

import com.web.entity.Notice;

/**
 * ��������ݷ��ʲ�ӿ�
 * @author ASUS
 *
 */
public interface NoticeDao {
	
	/**
	 * ǰ̨ϵͳ����ѯ������ӻ��޸ĵ�һ��������Ϣ
	 * @return
	 */
	public List<Notice> getRecentNotice();
	
}
