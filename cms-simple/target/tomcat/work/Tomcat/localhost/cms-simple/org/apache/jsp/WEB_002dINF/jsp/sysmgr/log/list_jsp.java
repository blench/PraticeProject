/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2017-07-04 03:02:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.sysmgr.log;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write('\r');
      out.write('\n');
String contextPath = request.getContextPath();
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${moduleName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("管理</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jsp/inc/meta.jsp", out, false);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t//去掉最后一个逗号\r\n");
      out.write("\t\t$('#grid1').datagrid({\r\n");
      out.write("\t\t    url:'");
      out.print(contextPath);
      out.write("/sysmgr/log/list',   \r\n");
      out.write("\t\t    columns:[[\r\n");
      out.write("\t\t    {field:'userName',title:'用户名 ',width:100},\r\n");
      out.write("\t\t    {field:'content',title:'日志内容',width:500},\r\n");
      out.write("\t\t    {field:'createTimeF',title:'记录时间',width:200}\r\n");
      out.write("\t\t    ]],\r\n");
      out.write("\t\t    rownumbers:true,\r\n");
      out.write("\t\t    singleSelect:true,\r\n");
      out.write("\t\t    selectOnCheck:false,\r\n");
      out.write("\t\t    checkOnSelect:false,\r\n");
      out.write("\t\t    pagination:true,\r\n");
      out.write("\t\t    pageList:[5,10,20,50],\r\n");
      out.write("\t\t    pageSize:20,\r\n");
      out.write("\t\t    fit:true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction query(){\r\n");
      out.write("\t\t$('#grid1').datagrid('load', {\r\n");
      out.write("\t\t\tuserName: $(\"#userName\").val(),\r\n");
      out.write("\t\t\tbeginTime: $(\"#beginTime\").datebox('getValue'),\r\n");
      out.write("\t\t\tendTime: $(\"#endTime\").datebox('getValue')\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<div region=\"north\" title=\"查询\" style=\"height:65px;margin-top:5px;\">\r\n");
      out.write("\t\t<form id=\"searchForm\" method=\"post\" action=\"\" target=\"_blank\">\r\n");
      out.write("\t\t    <table>  \r\n");
      out.write("\t\t    \t<tr>\r\n");
      out.write("\t\t    \t\t<td>用户名:</td>\r\n");
      out.write("\t\t    \t\t<td><input type=\"text\" id=\"userName\" class=\"input-text\"/></td>\r\n");
      out.write("\t\t    \t\t<td>记录时间:</td>\r\n");
      out.write("\t\t    \t\t<td>\r\n");
      out.write("\t\t    \t\t\t<input type=\"text\" id=\"beginTime\" name=\"beginTime\" class=\"easyui-datetimebox\" style=\"width:150px;\"/>\r\n");
      out.write("\t\t    \t\t\t至\r\n");
      out.write("\t\t    \t\t\t<input type=\"text\" id=\"endTime\" name=\"endTime\" class=\"easyui-datetimebox\" style=\"width:150px;\"/>\r\n");
      out.write("\t\t    \t\t</td>\r\n");
      out.write("\t\t    \t\t<td>\r\n");
      out.write("\t\t    \t\t\t<a id=\"btn\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" onclick=\"query()\">查询</a>\r\n");
      out.write("\t\t    \t\t\t<a id=\"btn\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-undo'\" onclick=\"searchForm.reset()\">清空</a>\r\n");
      out.write("\t\t    \t\t</td>\r\n");
      out.write("\t\t    \t</tr>\r\n");
      out.write("\t    \t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center'\">\r\n");
      out.write("\t\t<table fit=\"true\" id=\"grid1\" title=\"日志列表\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
