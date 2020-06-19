package com.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * JDBC������
 * @author ASUS
 *
 */
public class JDBCUtil {
	
	//static����̬     final������
	static final String url = "jdbc:mysql://localhost:3306/summer_proj";//�������ݿ��url
	static final String user = "root";//�������ݿ���û���
	static final String password = "123456";//�������ݿ������
	
	static Connection conn = null;//���ݿ����Ӷ���
	static PreparedStatement  ps = null;//Ԥ�������
	static ResultSet rs = null;//���������

	/**
	 * ��̬�����
	 */
	static{
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			e.printStackTrace();//����д����ڿ���̨���������Ϣ
		}
	}
	
	/**
	 * ��ȡ���ݿ����Ӷ���
	 * @return
	 */
	public static Connection getConnectinon(){
		try {
			
			//DriverManager:��������
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ر�
	 */
	public static void close(){
		try {
			//�жϽ���������Ƿ�Ϊ��
			if(rs != null){
				rs.close();//�رս��������
			}
			
			//�ж�Ԥ��������Ƿ�Ϊ��
			if(ps != null){
				ps.close();
			}
			
			//�ж����Ӷ����Ƿ�Ϊ��
			if(conn != null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
