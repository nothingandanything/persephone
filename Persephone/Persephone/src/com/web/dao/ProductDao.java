package com.web.dao;

import java.util.List;

import com.web.entity.Drink;

public interface ProductDao {
	/**
	 * �����ֶ�����������
	 * @param searchfield
	 * @return
	 */
	public Integer findDrinkByNameAllCount(String searchfield);
	
	/**
	 * �����ֶ���������
	 * @param currentPage  ��ǰҳ
	 * @param currentCount  ÿҳ������
	 * @param searchfield  �������ֶ�
	 * @return
	 */
	public List<Drink> findDrinkByName(int currentPage,int currentCount,String searchfield);
}