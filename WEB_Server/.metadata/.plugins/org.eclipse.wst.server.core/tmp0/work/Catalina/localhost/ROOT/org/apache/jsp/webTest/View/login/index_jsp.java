/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-09-19 15:22:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webTest.View.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1598754809532L));
    _jspx_dependants.put("jar:file:/C:/Users/EaBEll/Documents/GitHub/GraduationPortfolio/WEB_Server/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WebTest/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323225978000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.File");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../../Model/mainForm/mainForm.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../Model/mainForm/mainForm.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원제 게시판 예시</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"mainForm.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t<!-- 헤더 -->\r\n");
      out.write("\t\t\t<header>\r\n");
      out.write("\t\t\t\t<a href=\"/index.do\"> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/../img/logo.png\"\r\n");
      out.write("\t\t\t\t\t style=\"position: relative; top: 15px; left: 0px; width: 140px; width:140px\">\r\n");
      out.write("\t\t\t\t</a> <input type=\"text\" onclick=\"\"\r\n");
      out.write("\t\t\t\t\tstyle=\"position: relative; left: 20px;\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br> <a href=\"\" onmouseover=\"TextMover()\"\r\n");
      out.write("\t\t\t\t\tonmouseout=\"TextMount()\" id=\"nav\" style=\"color: black;\">차트</a>\r\n");
      out.write("\t\t\t\t&nbsp; <a href=\"");
      out.print(request.getContextPath());
      out.write("/../fileUpLoad/fileList.jsp\" onmouseover=\"TextMover2()\"\r\n");
      out.write("\t\t\t\t\tonmouseout=\"TextMount2()\" id=\"nav2\" style=\"color: black;\">최신음악</a>\r\n");
      out.write("\t\t\t\t&nbsp; <a href=\"\" onmouseover=\"TextMover3()\"\r\n");
      out.write("\t\t\t\t\tonmouseout=\"TextMount3()\" id=\"nav3\" style=\"color: black;\">장르음악</a>\r\n");
      out.write("\t\t\t\t\t\t&nbsp; <a href=\"../article/list.jsp\"  id=\"nav3\" style=\"color: black;\">게시판</a>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t<hr id=\"hr\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 콘텐츠 -->\r\n");
      out.write("\t<div id=\"content\" align=\"center\" style=\"background-color: #ffffff;\">\r\n");
      out.write("\t\t<section id=\"main_section\">\r\n");
      out.write("\t\t\t<article class=\"main_article\"></article>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t<!-- 메인 섹션 건들지 말것. -->\r\n");
      out.write("\r\n");
      out.write("\t\t<aside id=\"main_aside\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<a href=\"../../../나는가수다.msi\" download=>Window다운로드</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("<aside id=\"main_bside\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table ><thead>\r\n");
      out.write("\t<tr><span style=\"color: #ff8385\">최신음악</span></tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드.jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (1).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (2).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (3).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (4).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (5).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<table ><thead>\r\n");
      out.write("\t<tr><span style=\"color: #ff8385\">이달의 음악</span></tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (6).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (7).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (8).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (9).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (10).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t\t<td><img  src=\"../../img/newchart/다운로드 (11).jpg\" style=\"height: 80px; width: 80px;\">\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\r\n");
      out.write("\t\t<aside id=\"main_bside\" style=\"float: left;\">\r\n");
      out.write("\t\t\t<span style=\"color: #ff8385\">추천음악</span><br>\r\n");
      out.write("\t\t<img  src=\"../../img/newchart/다운로드 (16).jpg\" style=\"height: 200px; width:200px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 바텀 -->\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t<br> <br>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t</div>\r\n");
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
      // /webTest/View/login/index.jsp(59,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty authUser }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<div align=\"center\"><a href=\"\"></a> <a href=\"../login/signUp.jsp\">회원가입</a></div>\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"../login/login.jsp\" ><img alt=\"\" src=\"../../img/login/login.png\" style=\"height: 42px; width: 244px;\"></a>\r\n");
          out.write("\t\t\t\t\t\t\t<br>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
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
      // /webTest/View/login/index.jsp(64,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty authUser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authUser.nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님, 안녕하세요.<br />\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"/LogoutHandler\">[로그아웃하기]</a>\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"changePwdForm.jsp\">[암호변경하기]</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"../list/newMusicForm.jsp\">[마이페이지]</a>\r\n");
          out.write("\t\t\t\t\t\t");
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
