package com.web.biz;

import com.web.util.PageBean;

public interface ProductBiz {
	/**
	 * ��������ģ����ѯ
	 * @param currentPage
	 * @param currentCount
	 * @param searchfield
	 * @return
	 */
	public PageBean findDrinkByName(int currentPage,int currentCount,String searchfield);
}
