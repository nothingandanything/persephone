package com.web.biz;

import java.util.List;

import com.web.entity.UserAddr;

/**
 * ��ַ��ҵ���߼���ӿ�
 * @author ASUS-PC
 *
 */

public interface AddressBiz {
	
	/**
	 * ���ӵ�ַ
	 * @param useaddr
	 * @return
	 */
	public boolean addAddress(UserAddr useraddr);
	
	/**
	 * ��ʾ��ַ
	 * @param UserID
	 * @return
	 */
	public List<UserAddr> showAddress(int UserID);

}