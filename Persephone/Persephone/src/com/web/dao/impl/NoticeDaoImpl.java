package com.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.dao.NoticeDao;
import com.web.entity.Notice;
import com.web.util.JDBCUtil;

/**
 * ��������ݷ��ʲ�ʵ����
 * @author ASUS
 *
 */
public class NoticeDaoImpl implements NoticeDao {
	/**
	 * ǰ̨ϵͳ����ѯ������ӻ��޸ĵ�һ��������Ϣ
	 * @return
	 */
	@Override
	public List<Notice> getRecentNotice() {
		
		//ʵ�������϶���
		List<Notice> list = new ArrayList<Notice>();
		
		try {
			//��ȡ���ݿ����Ӷ���
			Connection conn = JDBCUtil.getConnectinon();
			
			//��дsql
			String sql = "select * from notice order by n_time desc limit 0,5";
			
			//ִ�б���
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//ִ�в�ѯ
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				//ʵ�������϶���
				Notice n = new Notice();
				
				//Ϊ���������Ե�ֵ
				n.setDetails(rs.getString("details"));
				n.setN_id(rs.getInt("n_id"));
				n.setTitle(rs.getString("title"));
				n.setN_time(rs.getString("n_time"));
				
				//�Ѷ�����ӵ�������
				list.add(n);
			}
			
			//�ر�
			JDBCUtil.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
