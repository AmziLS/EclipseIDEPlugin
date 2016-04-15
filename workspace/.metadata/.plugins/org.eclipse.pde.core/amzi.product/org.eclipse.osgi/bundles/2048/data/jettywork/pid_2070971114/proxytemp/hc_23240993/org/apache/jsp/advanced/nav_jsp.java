package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	WebappPreferences prefs = data.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>");
      out.print(ServletResources.getString("Help", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
 
if (!data.isMozilla()) {

      out.write("\n");
      out.write("FRAMESET {\n");
      out.write("\tborder-top:1px solid ThreeDShadow;\n");
      out.write("\tborder-left:1px solid ThreeDShadow;\n");
      out.write("\tborder-right:1px solid ThreeDShadow;\n");
      out.write("}\n");

}

      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("var isMozilla = navigator.userAgent.indexOf('Mozilla') != -1 && parseInt(navigator.appVersion.substring(0,1)) >= 5;\n");
      out.write("var isMozilla10 = isMozilla && navigator.userAgent.indexOf('rv:1') != -1;\n");
      out.write("var isIE = navigator.userAgent.indexOf('MSIE') != -1;\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Shows specified view. Called from actions that switch the view\n");
      out.write(" */\n");
      out.write("function showView(view)\n");
      out.write("{\n");
      out.write("\t// Note: assumes the same id shared by tabs and iframes\n");
      out.write("\tViewsFrame.showView(view);\n");
      out.write("\tTabsFrame.showTab(view);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Shows the TOC frame, loads appropriate TOC, and selects the topic\n");
      out.write(" * isAutosynch means that we are synching as a result of following a hyperlink\n");
      out.write(" * and should not display errors or force the TOC view to show\n");
      out.write(" */\n");
      out.write("function displayTocFor(topic, isAutosynch)\n");
      out.write("{\n");
      out.write("\tvar tocView = ViewsFrame.toc.tocViewFrame;\n");
      out.write("\t\n");
      out.write("\tif (isAutosynch) {\n");
      out.write("\t    if (!tocView.isAutosynchEnabled()) {\n");
      out.write("\t        return;\n");
      out.write("\t    }\n");
      out.write("    } else {\n");
      out.write("        showView(\"toc\");\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("\tif (tocView.selectTopic) {\n");
      out.write("\t    tocView.selectTopic(topic, isAutosynch);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" * Shows the TOC frame and collapses all TOCs.\n");
      out.write(" */\n");
      out.write("function collapseToc()\n");
      out.write("{\n");
      out.write("\t/******** HARD CODED VIEW NAME *********/\n");
      out.write("\tshowView(\"toc\");\n");
      out.write("\tvar tocView = ViewsFrame.toc.tocViewFrame;\n");
      out.write("\tif (tocView.location.href.indexOf(\"?\") > 0) {\n");
      out.write("\t\ttocView.location = \"tocView.jsp\";\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<frameset id=\"navFrameset\" rows=\"*,21\"  framespacing=\"0\" border=\"0\"  frameborder=\"0\" scrolling=\"no\">\n");
      out.write("   <frame name=\"ViewsFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "ViewsFrame", request));
      out.write("\" src='");
      out.print("views.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" resize=yes>\n");
      out.write("   <frame name=\"TabsFrame\" title=\"");
      out.print(ServletResources.getString("TabsFrame", request));
      out.write("\" src='");
      out.print("tabs.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" noresize>\n");
      out.write("</frameset>\n");
      out.write("\n");
      out.write("</html>");
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
