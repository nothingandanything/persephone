/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2020-07-02 07:14:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction changeImage(){\r\n");
      out.write("\t\t// 改变验证码图片中的文字\r\n");
      out.write("\t\tdocument.getElementById(\"imgCode\").src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imageCode?time=\"+new Date().getTime();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" != \"\")\r\n");
      out.write("\t\t\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/showMe\";\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>Register</title>  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page-wrapper\">\r\n");
      out.write("<!-- Preloader -->\r\n");
      out.write("\t<div class=\"preloader\"></div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t    <!--==================================================================== \r\n");
      out.write("            Start Banner Section\r\n");
      out.write("        =====================================================================-->\r\n");
      out.write("        <section class=\"banner-section\" style=\"background-image:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/img/banner.png);\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"banner-inner text-center\">\r\n");
      out.write("                    <h2 class=\"page-title\">Sign Up</h2>\r\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ShowIndex\">Home</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item active\" aria-current=\"page\">Sign Up</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!--==================================================================== \r\n");
      out.write("            End Banner Section\r\n");
      out.write("        =====================================================================-->\r\n");
      out.write("        \r\n");
      out.write("           <section class=\"login-area my-120 rmy-80\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-5 pr-0 rpr-15 rmb-80\">\r\n");
      out.write("                        <div class=\"login-information bg-white br-5 py-125\">\r\n");
      out.write("                            <div class=\"login-info-inner\">\r\n");
      out.write("                                <h2>Sign Up</h2>\r\n");
      out.write("                                <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/register\" class=\"login-form\" method=\"post\" onsubmit=\"return checkForm();\">\r\n");
      out.write("                                    <div class=\"text-field\">\r\n");
      out.write("                                        <label for=\"name\">用户名*</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"UserName\" name=\"UserName\" placeholder=\"请设置4~8位\" onkeyup=\"checkUserName()\" onblur=\"checkSameName()\">\r\n");
      out.write("                                        <span id=\"UserNameMsg\">&nbsp;</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"text-field\">\r\n");
      out.write("                                        <label for=\"pwd1\">密码*</label>\r\n");
      out.write("                                        <input type=\"password\" id=\"UserPwd\" name=\"UserPwd\" placeholder=\"请设置4~8位\" onkeyup=\"checkUserPwd()\">\r\n");
      out.write("                                        <span id=\"UserPwdMsg\">&nbsp;</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"text-field\">\r\n");
      out.write("                                        <label for=\"pwd2\">重复密码*</label>\r\n");
      out.write("                                        <input type=\"password\" id=\"ReUserPwd\" name=\"ReUserPwd\" placeholder=\"请再输入一次密码\" onkeyup=\"checkReUserPwd()\">\r\n");
      out.write("                                        <span id=\"ReUserPwdMsg\">&nbsp;</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"text-field\">\r\n");
      out.write("                                        <label for=\"phone\">联系电话*</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"UserPhone\" name=\"UserPhone\" placeholder=\"请输入电话号码\" onkeyup=\"checkUserPhone()\">\r\n");
      out.write("                                        <span id=\"UserPhoneMsg\">&nbsp;</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"text-field\">\r\n");
      out.write("                                        <label for=\"phone\">验证码*</label>\r\n");
      out.write("                                        <input type=\"text\" id=\"UserCheck\" name=\"UserCheck\" placeholder=\"请输入验证码\">\r\n");
      out.write("                                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/imageCode\" width=\"180\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theight=\"30\" class=\"textinput\" style=\"height: 30px;\" id=\"imgCode\"/>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"changeImage()\">看不清换一张</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"alternative-login\">\r\n");
      out.write("                                        Do You Have Account ?<a class=\"signup-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/login.jsp\">Login</a>\r\n");
      out.write("                                    </div> \r\n");
      out.write("                                    <div class=\"signin-button-wrap\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn-bg2\">Sign Up</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-7 px-0 rpl-15 login-image-wrap\">\r\n");
      out.write("                        <div class=\"login_img\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/img/login.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "foot.jsp", out, false);
      out.write("\r\n");
      out.write("    <!-- Scroll Top Button -->\r\n");
      out.write("    <button class=\"scroll-top scroll-to-target\" data-target=\"html\"><span class=\"fa fa-angle-up\"></span></button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- jequery plugins -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/bootstrap-v4.1.3.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/jquery.simpleLoadMore.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/slick.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/appear.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom script -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client//js/script.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
