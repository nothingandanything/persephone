/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2020-06-23 13:37:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quick_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/client/js/cartChange.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction submitForm () {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\turl: $(\"#addCartForm\").attr(\"action\"),\r\n");
      out.write("\t\t\tdata: $('#addCartForm').serialize(),\r\n");
      out.write("\t\t\tsuccess: function (result) {\r\n");
      out.write("\t\t\t\t$('#quick-view').modal('hide');\r\n");
      out.write("\t\t\t\tif (result == \"success\") {\r\n");
      out.write("\t\t\t\t\talert(\"添加成功！\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse if (result == \"fail\") {\r\n");
      out.write("\t\t\t\t\talert(\"已添加过该饮品！\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype: 'GET',\r\n");
      out.write("\t\t\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/showCart\",\r\n");
      out.write("\t\t\t\t\tdata: {\"flag\": \"ajax\"},\r\n");
      out.write("\t\t\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\t\t\tstatusCode: {\r\n");
      out.write("\t\t\t\t\t\t404: function() {  \r\n");
      out.write("\t\t\t\t\t\t\talert('提交地址url未发现'); \r\n");
      out.write("\t\t\t\t\t\t}  \r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess: function (data) {\r\n");
      out.write("\t\t\t\t\t\tchangeCartInnerList(data);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction selectSepc () {\r\n");
      out.write("\t\tvar spec = $(\"input[name='DrinkSpec']:checked\").val();\r\n");
      out.write("\t\tif (spec == \"super\") {\r\n");
      out.write("\t\t\t$(\"#Super\").show();\r\n");
      out.write("\t\t\t$(\"#Big\").hide();\r\n");
      out.write("\t\t\t$(\"#Medium\").hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if (spec == \"big\") {\r\n");
      out.write("\t\t\t$(\"#Super\").hide();\r\n");
      out.write("\t\t\t$(\"#Big\").show();\r\n");
      out.write("\t\t\t$(\"#Medium\").hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if (spec == \"medium\") {\r\n");
      out.write("\t\t\t$(\"#Super\").hide();\r\n");
      out.write("\t\t\t$(\"#Big\").hide();\r\n");
      out.write("\t\t\t$(\"#Medium\").show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!--==================================== Start product-quick-view //product-modal  ================-->\r\n");
      out.write("\t<div class=\"modal product-modal fade\" id=\"quick-view\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body p-35 pt-0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"product-quick-view\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t \t\t\t\t\t\t\t\t<div class=\"product-preview-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tab-content bg-white p-50 b1 br-5\">\r\n");
      out.write("\t                                                                        \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"\" alt=\"Product Preview Image\" id=\"PicAddres\">\r\n");
      out.write("\t                                                                        \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-details text-left bg-white ml-25 px-50 py-45 b1 br-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"mb-25 rmt-25\" id=\"DrinkName\"></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"rating mb-25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"star mr-15\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"text\">(13 Review)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p id=\"DrinkDesc\"></p>\r\n");
      out.write("\t                                                                    \r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <h6>Availability: <span>In Stock</span></h6> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"Super\" style=\"display:block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"price\" id=\"DrinkPrice_Super\"></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"Big\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"price\" id=\"DrinkPrice_Big\"></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"Medium\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"price\" id=\"DrinkPrice_Medium\"></h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/addCart\" method = \"post\" id=\"addCartForm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"DrinkID\" name=\"DrinkID\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-spinner mt-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"number-input b1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"minus\" type=\"button\"></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input min=\"1\" max=\"99\" id=\"Number\" name=\"Number\" value=\"1\" type=\"number\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button class=\"plus\" type=\"button\"></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class = \"chose-sweet\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h7 style = \"color : #071C35;\"> 请选择甜度</h7>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio\" style = \"display:inline;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkSweet1\" name=\"DrinkSweet\" value=\"全糖\" checked>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkSweet1\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">全糖</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio \" style = \"display:inline;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkSweet2\" name=\"DrinkSweet\" value=\"半糖\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkSweet2\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">半糖</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio\" style = \"display:inline;\">   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkSweet3\" name=\"DrinkSweet\" value=\"少糖\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkSweet3\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">少糖</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class = \"chose-temp mt-20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h7 style = \"color : #071C35;\"> 请选择温度</h7>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio\" style = \"display:inline;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkTemp1\" name=\"DrinkTemp\" value=\"热\" checked>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkTemp1\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">热</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio \" style = \"display:inline;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkTemp2\" name=\"DrinkTemp\" value=\"常温\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkTemp2\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">常温</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio\" style = \"display:inline;\">   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkTemp3\" name=\"DrinkTemp\" value=\"加冰\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkTemp3\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">加冰</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class = \"chose-sepc mt-20\" onclick=\"selectSepc()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h7 style = \"color : #071C35;\"> 请选择杯型</h7>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio\" style = \"display:inline;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkSpec1\" name=\"DrinkSpec\" value=\"超级杯\" checked>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkSpec1\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">超级杯</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio \" style = \"display:inline;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkSpec2\" name=\"DrinkSpec\" value=\"大杯\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkSpec2\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">大杯</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"custom-control custom-radio\" style = \"display:inline;\">   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" class=\"custom-control-input\" id=\"DrinkSpec3\" name=\"DrinkSpec\" value=\"中杯\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"custom-control-label\" for=\"DrinkSpec3\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-controls=\"collapseOne\">中杯</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--==================================== end product-quick-view //product-modal  ================-->\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /client/quick_view.jsp(127,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName!=null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" class=\"theme-btn br-30 ml-20\" onclick=\"submitForm();\">加入购物车</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /client/quick_view.jsp(130,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName==null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/client/login.jsp\" class=\"theme-btn br-30 ml-20\">请登陆后再购买！</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
