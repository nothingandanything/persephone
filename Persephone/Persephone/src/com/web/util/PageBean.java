package com.web.util;

import java.util.List;

import com.web.entity.Drink;

/**
 * ��ҳ������
 * @author ������
 *
 */
public class PageBean {
	private Integer currentPage;  // ��ǰҳ��
	private Integer totalCount;  // ������   ��Ҫ�����ݿ��в�ѯ
	private Integer currentCount;  // ÿҳ������
	private Integer totalPage;  // ��ҳ��  = ������ / ÿҳ��ʾ������ 
	private List<Drink> productList;  // ��ʾ����������
	
	private String category;  // ���
	private String searchfield;  // ģ���������ֶ�
	
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getCurrentCount() {
		return currentCount;
	}
	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}
	
	/**
	 * ��ȡ������
	 * @return
	 */
	public Integer getTotalPage() {
		
		totalPage = (int)Math.ceil((totalCount * 1.0) / currentCount);
		
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<Drink> getProductList() {
		return productList;
	}
	public void setProductList(List<Drink> productList) {
		this.productList = productList;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSearchfield() {
		return searchfield;
	}
	public void setSearchfield(String searchfield) {
		this.searchfield = searchfield;
	}
	
	
	public static void main(String[] args) {
		System.out.println((int)Math.ceil((9*1.0)/4));
	}
}
