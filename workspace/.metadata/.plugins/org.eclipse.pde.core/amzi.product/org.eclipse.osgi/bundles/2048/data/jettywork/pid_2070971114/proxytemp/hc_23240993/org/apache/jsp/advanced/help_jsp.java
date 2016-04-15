package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class help_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("var maximizeListeners=new Object();\n");
      out.write("function registerMaximizeListener(name, listener){\n");
      out.write("\tmaximizeListeners[name]=listener;\n");
      out.write("}\n");
      out.write("function notifyMaximizeListeners(maximizedNotRestored){\n");
      out.write("\tfor(i in maximizeListeners){\n");
      out.write("\t\ttry{\n");
      out.write("\t\t\tmaximizeListeners[i](maximizedNotRestored);\n");
      out.write("\t\t}catch(exc){}\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("var leftCols = \"");
      out.print(isRTL?"70.5%":"29.5%");
      out.write("\";\n");
      out.write("var rightCols = \"");
      out.print(isRTL?"29.5%":"70.5%");
      out.write('"');
      out.write(';');
      out.write('\n');
      out.write("\n");
      out.write("function toggleFrame(title)\n");
      out.write("{\n");
      out.write("\tvar frameset = document.getElementById(\"helpFrameset\"); \n");
      out.write("\tvar navFrameSize = frameset.getAttribute(\"cols\");\n");
      out.write("\tvar comma = navFrameSize.indexOf(',');\n");
      out.write("\tvar left = navFrameSize.substring(0,comma);\n");
      out.write("\tvar right = navFrameSize.substring(comma+1);\n");
      out.write("\n");
      out.write("\tif (left == \"*\" || right == \"*\") {\n");
      out.write("\t\t// restore frames\n");
      out.write("\t\tframeset.frameSpacing=\"3\";\n");
      out.write("\t\tframeset.setAttribute(\"border\", \"6\");\n");
      out.write("\t\tframeset.setAttribute(\"cols\", leftCols+\",\"+rightCols);\n");
      out.write("\t\tnotifyMaximizeListeners(false);\n");
      out.write("\t} else {\n");
      out.write("\t\t// the \"cols\" attribute is not always accurate, especially after resizing.\n");
      out.write("\t\t// offsetWidth is also not accurate, so we do a combination of both and \n");
      out.write("\t\t// should get a reasonable behavior\n");

if(isRTL) {

      out.write("\n");
      out.write("\t\tvar leftSize = ContentFrame.document.body.offsetWidth;\n");
      out.write("\t\tvar rightSize = NavFrame.document.body.offsetWidth;\n");

} else {

      out.write("\n");
      out.write("\t\tvar leftSize = NavFrame.document.body.offsetWidth;\n");
      out.write("\t\tvar rightSize = ContentFrame.document.body.offsetWidth;\n");

}

      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\tleftCols = leftSize * 100 / (leftSize + rightSize);\n");
      out.write("\t\trightCols = 100 - leftCols;\n");
      out.write("\n");
      out.write("\t\t// maximize the frame.\n");
      out.write("\t\t//leftCols = left;\n");
      out.write("\t\t//rightCols = right;\n");
      out.write("\t\t// Assumption: the content toolbar does not have a default title.\n");

if(isRTL) {

      out.write("\n");
      out.write("\t\tif (title != \"\") // this is the right side for right-to-left rendering\n");
      out.write("\t\t\tframeset.setAttribute(\"cols\", \"*,100%\");\n");
      out.write("\t\telse // this is the content toolbar\n");
      out.write("\t\t\tframeset.setAttribute(\"cols\", \"100%,*\");\n");

} else {

      out.write("\n");
      out.write("\t\tif (title != \"\") // this is the left side for left-to-right rendering\n");
      out.write("\t\t\tframeset.setAttribute(\"cols\", \"100%,*\");\n");
      out.write("\t\telse // this is the content toolbar\n");
      out.write("\t\t\tframeset.setAttribute(\"cols\", \"*,100%\");\n");

}

      out.write("\t\n");
      out.write("\t\tframeset.frameSpacing=\"0\";\n");
      out.write("\t\tframeset.setAttribute(\"border\", \"1\");\n");
      out.write("\t\tnotifyMaximizeListeners(true);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<frameset\n");
 
if (data.isIE()) {

      out.write(" \n");
      out.write("\tstyle=\"border-top: 0px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\"\n");
      out.write("\tstyle=\"border-right: 4px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\"\n");
      out.write("\tstyle=\"border-bottom: 4px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\"\n");
      out.write("\tstyle=\"border-left: 4px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(';');
      out.write('"');
      out.write('\n');

}

      out.write(" \n");
      out.write("    id=\"helpFrameset\" cols=\"");
      out.print(isRTL?"70.5%,29.5%":"29.5%,70.5%");
      out.write("\" framespacing=\"3\" border=\"6\"  frameborder=\"1\"   scrolling=\"no\">\n");

if (isRTL) {

      out.write("\n");
      out.write("   \t<frame name=\"ContentFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "ContentFrame", request));
      out.write("\" class=\"content\" src='");
      out.print("content.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" resize=yes>\n");
      out.write("   \t<frame class=\"nav\" name=\"NavFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "NavFrame", request));
      out.write("\" src='");
      out.print("nav.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"1\" resize=yes>\n");

} else {

      out.write("\n");
      out.write("   \t<frame class=\"nav\" name=\"NavFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "NavFrame", request));
      out.write("\" src='");
      out.print("nav.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"1\" resize=yes>\n");
      out.write("   \t<frame name=\"ContentFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "ContentFrame", request));
      out.write("\" class=\"content\" src='");
      out.print("content.jsp"+UrlUtil.htmlEncode(data.getQuery()));
      out.write("' marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" resize=yes>\n");

}

      out.write("\n");
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
