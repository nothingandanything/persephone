package com.web.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * �ַ����������
 * @author ������
 *
 */
public class CharacterEncodingFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		// ���ÿͻ����������������Ĳ��������ʽ
		request.setCharacterEncoding("UTF-8");
				
		// ������ݵı����ʽ����ΪUTF-8
		response.setContentType("text/html;charset=utf-8");
				
		// �������������
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
				
		// ��ȡ�Զ�����������
		HttpServletRequest myRequest = new MyRequest(httpServletRequest);
				
		// ����
		filter.doFilter(myRequest, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}

// �Զ���request����
class MyRequest extends HttpServletRequestWrapper{
	
	private HttpServletRequest request;
	private boolean hasEncode;  // �Ƿ�ת��

	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	
	@Override
	public Map<String, String[]> getParameterMap() {
		// ��ȡ����ķ�ʽ
		String method = request.getMethod();
		
		// �ж�����ķ�ʽ�Ƿ�post
		if (method.equalsIgnoreCase("post")) {
			// post����  �����ύ��ʽΪpost�����
			try {
				request.setCharacterEncoding("UTF-8");
				return request.getParameterMap();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (method.equalsIgnoreCase("get")) {
			// get���󣺳����ӡ�ֱ�ӷ��ʡ������ύ��ʽΪget�����
			Map<String, String[]>  parameterMap = request.getParameterMap();
			
			if (!hasEncode) {  // ��������ֶ������߼�ֻ����һ��
				// ѭ������
				for (String parameterName : parameterMap.keySet()) {
					// ��ȡ����Ӧ��ֵ
					String[] values = parameterMap.get(parameterName);
					
					if(values != null){  // �ж�ֵ�Ƿ�Ϊ��
						// ѭ��
						for (int i=0;i < values.length;i++) {
							try {
								// ��ÿһ��ֵ���ñ����ʽΪUTF-8
								values[i] = new String(values[i].getBytes("ISO-8859-1"),"UTF-8");
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
				hasEncode = true;
			}
			
			return parameterMap;
		}
		
		return super.getParameterMap();
	}
	
	@Override
	public String getParameter(String name) {
		
		Map<String, String[]> parameterMap = getParameterMap();
		
		String[] values = parameterMap.get(name);
		
		if(values == null){
			return null;
		}
		
		return values[0];
	}
	
	@Override
	public String[] getParameterValues(String name) {

		Map<String, String[]> parameterMap = getParameterMap();
		
		String[] values = parameterMap.get(name);
		
		return values;
	}
}