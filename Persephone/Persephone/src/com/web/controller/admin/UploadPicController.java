package com.web.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(urlPatterns="/uploadPic")
public class UploadPicController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// �����ϴ�����
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		// ������ʱ�洢Ŀ¼
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        // ���Ĵ���
        upload.setHeaderEncoding("UTF-8");
        
        // ����·�����洢�ϴ����ļ������·����Ե�ǰӦ�õ�Ŀ¼
        String uploadPath = req.getServletContext().getRealPath("/") + "client\\img\\drink";
        
        // ���Ŀ¼�������򴴽�
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
        
        // �������ݿ��е�·��
        String PicAddres = "";
        
        try {
        	// ���������������ȡ�ļ�����
        	@SuppressWarnings("unchecked")
        	List<FileItem> formItems = upload.parseRequest(req);
        	if (formItems != null && formItems.size() > 0) {
                // ������������
                for (FileItem item : formItems) {
                    // ʹ��item.isFormField()�����ж�FileItem������װ�������Ƿ�Ϊ��ͨ�ı������ֶΣ������ļ������ֶ�
                    if (!item.isFormField()) {
                        String fileName = item.getName();
                        // �µ�ͼƬ����
                        String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));
                        PicAddres = "drink/" + newFileName;
                       
                        String filePath = uploadPath + File.separator + newFileName;
                        
                        File storeFile = new File(filePath);
                        // �����ļ���Ӳ��
                        item.write(storeFile);
                    }
                }
            }
        } catch (Exception e) {
        	e.printStackTrace();
        	String json = "{\"state\": \"fail\"}";
        	resp.getWriter().write(json);
        	return;
        }
        String json = "{\"state\": \"success\", \"PicAddres\": \"" + PicAddres + "\"}";
    	resp.getWriter().write(json);
	}
}