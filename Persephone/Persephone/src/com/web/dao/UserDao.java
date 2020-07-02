package com.web.dao;

import java.util.List;

import com.web.entity.User;

/**
 * �û������ݷ��ʲ�ӿ�
 * @author ������
 *
 */
public interface UserDao {
	/**
	 * ע�ᣬ���̨������û�
	 * @param user
	 * @return
	 */
	public boolean add(User user);
	
	/**
	 * ��½
	 * @param UserName
	 * @param UserPwd
	 * @return
	 */
	public User login(String UserName, String UserPwd);
	
	/**
	 * �޸�����
	 * @param UserID
	 * @param user
	 * @return
	 */
	public boolean changeName(int UserID, User user);
	
	/**
	 * �޸�����
	 * @param UserID
	 * @param user
	 * @return
	 */
	public boolean changePwd(int UserID, User user);
	
	/**
	 * �޸ĵ绰
	 * @param UserID
	 * @param user
	 * @return
	 */
	public boolean changePhone(int UserID, User user);
	
	/**
	 * ��������Ƿ��ظ�
	 * @param UserName
	 * @return
	 */
	public boolean checkName(String UserName);
	
	/**
	 * ��̨��ʾ�û���Ϣ
	 * @return
	 */
	public List<User> showUser();
	
	/**
	 * ��̨�����û���Ϣ
	 * @param user
	 * @return
	 */
	public boolean changeUser(User user);
	
	/**
	 * ��̨ɾ���û�
	 * @param UserID
	 * @return
	 */
	public boolean deleteUser(int UserID);
	
	/**
	 * ��̨��ʾ�û�����
	 * @return
	 */
	public int showUserCount();
}
