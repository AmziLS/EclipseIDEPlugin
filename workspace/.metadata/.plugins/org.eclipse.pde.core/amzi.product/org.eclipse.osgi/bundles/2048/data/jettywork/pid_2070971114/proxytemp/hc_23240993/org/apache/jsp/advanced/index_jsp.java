package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/advanced/fheader.jsp");
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
 
request.setCharacterEncoding("UTF-8");
boolean isRTL = UrlUtil.isRTL(request, response);
String  direction = isRTL?"rtl":"ltr";
if (new RequestData(application,request, response).isMozilla()) {

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\">\n");
 
} else {

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\">\n");

}

      out.write("<!------------------------------------------------------------------------------\n");
      out.write(" ! Copyright (c) 2000, 2007 IBM Corporation and others.\n");
      out.write(" ! All rights reserved. This program and the accompanying materials \n");
      out.write(" ! are made available under the terms of the Eclipse Public License v1.0\n");
      out.write(" ! which accompanies this distribution, and is available at\n");
      out.write(" ! http://www.eclipse.org/legal/epl-v10.html\n");
      out.write(" ! \n");
      out.write(" ! Contributors:\n");
      out.write(" !     IBM Corporation - initial API and implementation\n");
      out.write(" ------------------------------------------------------------------------------->");
      out.write('\n');
      out.write('\n');
 
	LayoutData data = new LayoutData(application,request, response);
	// Initiate test for persisted cookies
	if(data.getMode() == LayoutData.MODE_INFOCENTER){
		Cookie cookieTest=new Cookie("cookiesEnabled", "yes");
		cookieTest.setMaxAge(365*24*60*60);
		response.addCookie(cookieTest);
	}

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<noscript>\n");
      out.write("<meta HTTP-EQUIV=\"REFRESH\" CONTENT=\"0;URL=index.jsp?noscript=1\">\n");
      out.write("</noscript>\n");
      out.write("<title>");
      out.print(data.getWindowTitle());
      out.write("</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "livehelp_js.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("FRAMESET {\n");
      out.write("\tborder: 0px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("function onloadHandler(e)\n");
      out.write("{\n");
 if (data.isIE() || data.isMozilla() && "1.2.1".compareTo(data.getMozillaVersion()) <=0){

      out.write("\t\n");
      out.write("    try {\n");
      out.write("        var h=window.SearchFrame.document.getElementById(\"searchLabel\").offsetHeight; ");
      out.write("\n");
      out.write("\t    if(h<=19){\n");
      out.write("\t\t    // no need to resize up to 19px \n");
      out.write("\t    } else {\n");
      out.write("\t        document.getElementById(\"indexFrameset\").setAttribute(\"rows\", ");
      out.print("0".equals(data.getBannerHeight())?"":"\""+data.getBannerHeight()+",\"+");
      out.write("(11+h)+\",*\"); ");
      out.write("\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    catch (e) {\n");
      out.write("\t}\n");
}
      out.write('\n');

if (data.isMozilla()){
// restore mozilla from minimized

      out.write("\n");
      out.write("\twindow.focus();\n");

}

      out.write("\n");
      out.write("\twindow.frames[\"SearchFrame\"].document.getElementById(\"searchWord\").focus();\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<frameset id=\"indexFrameset\" onload=\"onloadHandler()\" rows=\"");
      out.print("0".equals(data.getBannerHeight())?"":data.getBannerHeight()+",");
      out.write("24,*\"  frameborder=\"0\" framespacing=\"0\" border=0 spacing=0>\n");

	if(!("0".equals(data.getBannerHeight()))){

      out.write("\n");
      out.write("\t<frame name=\"BannerFrame\" title=\"");
      out.print(ServletResources.getString("Banner", request));
      out.write("\" src='");
      out.print(data.getBannerURL());
      out.write("'  tabIndex=\"3\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" noresize=0>\n");

	}

      out.write("\n");
      out.write("\t<frame name=\"SearchFrame\" title=\"");
      out.print(ServletResources.getString("helpToolbarFrame", request));
      out.write("\" src='");
      out.print("advanced/search.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" noresize=0>\n");
      out.write("\t<frame name=\"HelpFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "HelpFrame", request));
      out.write("\" src='");
      out.print("advanced/help.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" >\n");
      out.write("</frameset>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
