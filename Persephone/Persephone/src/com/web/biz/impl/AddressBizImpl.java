package com.web.biz.impl;

import java.util.List;

import com.web.biz.AddressBiz;
import com.web.dao.AddressDao;
import com.web.dao.impl.AddressDaoImpl;
import com.web.entity.UserAddr;

/**
 * ��ַ��ҵ���߼���ʵ����
 * @author ASUS
 *
 */
public class AddressBizImpl implements AddressBiz {
	
	//ʵ�������ݷ��ʲ�
	AddressDao ad = new AddressDaoImpl();

	@Override
	public boolean addAddress(UserAddr useraddr) {
		
		//�������ݷ��ʲ����ӵ�ַ����
		return ad.addAddress(useraddr);
		
	}
	
	@Override
	public List<UserAddr> showAddress(int UserID) {
		return ad.showAddress(UserID);
	}
	
}
	
	
