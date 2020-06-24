package com.web.biz;

import java.util.List;

import com.web.entity.UserAddr;

/**
 * 地址的业务逻辑层接口
 * @author ASUS-PC
 *
 */

public interface AddressBiz {
	
	/**
	 * 添加地址
	 * @param useaddr
	 * @return
	 */
	public boolean addAddress(UserAddr useraddr);
	
	/**
	 * 显示地址
	 * @param UserID
	 * @return
	 */
	public List<UserAddr> showAddress(int UserID);

}
