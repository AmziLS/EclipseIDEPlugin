package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class indexView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/advanced/fheader.jsp");
    _jspx_dependants.add("/advanced/indexView.css");
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

    RequestData requestData = new ActivitiesData(application,request, response);
	WebappPreferences prefs = requestData.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("IndexViewTitle", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/*******************************************************************************\n");
      out.write(" * Copyright (c) 2005, 2006 Intel Corporation and others.\n");
      out.write(" * All rights reserved. This program and the accompanying materials \n");
      out.write(" * are made available under the terms of the Eclipse Public License v1.0\n");
      out.write(" * which accompanies this distribution, and is available at\n");
      out.write(" * http://www.eclipse.org/legal/epl-v10.html\n");
      out.write(" * \n");
      out.write(" * Contributors:\n");
      out.write(" *     Intel Corporation - initial API and implementation\n");
      out.write(" *     IBM Corporation 2006, refactored index view into a single frame\n");
      out.write(" *******************************************************************************/\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("    ");
      out.print(prefs.getViewBackgroundStyle());
      out.write("\n");
      out.write("\tfont:");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\tmargin-top:5px;\n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tborder:0px;\t\n");
      out.write("\tcursor:default;\n");
      out.write("\toverflow:hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TABLE, TR, TD, P {\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tborder:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TABLE {\n");
      out.write("\tfont:");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("TR {\n");
      out.write("\theight:21px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("INPUT {\n");
      out.write("\tfont:");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("\tborder:1px solid ThreeDShadow;\n");
      out.write("}\n");
      out.write("\n");
      out.write("INPUT {\n");
      out.write("    font-size:1.0em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#instruction {\n");
      out.write("\twhite-space:nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#indexList {\n");
      out.write("    overflow:auto;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#typein {\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#typeinTable {\n");
      out.write("\twidth:100%;\n");
      out.write("\theight: 4em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#button {\n");
      out.write("\tbackground:ThreeDShadow;\n");
      out.write("\tcolor:Window;\n");
      out.write("\tfont-size: 1.0em;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tmargin-left:1px;\n");
      out.write("}\n");
      out.write("\n");

	if (requestData.isIE()) {

      out.write("\n");
      out.write("#go {\n");
      out.write("\tpadding-");
      out.print(isRTL?"right":"left");
      out.write(":1px;\n");
      out.write("}\n");

	}

      out.write("\n");
      out.write("\n");
      out.write("#root {\n");
      out.write("\tmargin-top:0px;\n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#innerNavigation {\n");
      out.write("    margin-top:0px;\n");
      out.write("    padding-bottom: 5px;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navigation {\n");
      out.write("    width:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#td_previous {   \n");
      out.write("    text-align:");
      out.print(isRTL?"right":"left");
      out.write(";\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#td_next {\n");
      out.write("    text-align:");
      out.print(isRTL?"left":"right");
      out.write(";\n");
      out.write("    width:50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.root {\n");
      out.write("    font-weight:normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.visible, DIV.unopened { \n");
      out.write("\tborder-width:0; \n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":1.5em; \n");
      out.write("\tfont-weight:normal;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("DIV.hidden {\n");
      out.write("\tdisplay:none; \n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.visible, DIV.root {  \n");
      out.write("    margin-top:1px; \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("DIV.group { \n");
      out.write("\tborder-width:0; \n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":0; \n");
      out.write("}\n");
      out.write("\n");
      out.write("SPAN.item{\n");
      out.write("    white-space: nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("IMG {\n");
      out.write("\tborder:0px;\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tmargin-");
      out.print(isRTL?"left":"right");
      out.write(":4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("IMG.expander, IMG.h {\n");
      out.write("    margin-top:4px;\n");
      out.write("    margin-bottom:2px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A {\n");
      out.write("\ttext-decoration:none; \n");
      out.write("\tpadding-");
      out.print(isRTL?"left":"right");
      out.write(":2px;\n");
      out.write("\tcolor:WindowText;\n");
      out.write("\t/* this works in ie5.5, but not in ie5.0  */\n");
      out.write("\twhite-space: nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A:hover{\n");
      out.write("\ttext-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");
      out.write("A.active{ \n");
      out.write("\tcolor:HighlightText; \n");
      out.write("\tbackground:Highlight;\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A.active:hover{\n");
      out.write("\ttext-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");

if (requestData.isSafari()){

      out.write("\n");
      out.write("\n");
      out.write("A.nolink {\n");
      out.write("\tcolor:#808080;\n");
      out.write("}\n");
      out.write("\n");
 
} else {

      out.write("\n");
      out.write("\n");
      out.write("A.nolink {\n");
      out.write("\tcolor:GrayText;\n");
      out.write("}\n");
      out.write("\n");

}

      out.write("\n");
      out.write("\n");
      out.write("A.nolink {\n");
      out.write("\ttext-decoration:none; \n");
      out.write("\tfont-weight:bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A.nolink:hover {\n");
      out.write("\ttext-decoration:none; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".h {\n");
      out.write("\tvisibility:hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<base target=\"ContentViewFrame\">\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("var loadingMessage = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("Loading", request)));
      out.write("\";\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\" src=\"indexView.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"resize.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"helptree.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"helptreechildren.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"xmlajax.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"utils.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\" onload=\"onloadHandler()\" onresize = \"sizeList()\">\n");
      out.write("\n");
      out.write("<table id=\"typeinTable\">\n");
if (prefs.isIndexInstruction()) {
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\"><p id=\"instruction\">");
      out.print(ServletResources.getString("IndexTypeinInstructions", request));
      out.write("</p></td>\n");
      out.write("\t</tr>\n");
}
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"100%\"><input type=\"text\" id=\"typein\"></td>\n");
      out.write("\t");
if (prefs.isIndexButton()) {
      out.write("\n");
      out.write("\t\t<td><input type=\"button\" id=\"button\" value=\"");
      out.print(ServletResources.getString("IndexTypeinButton", request));
      out.write("\" onclick=\"this.blur();showIndex()\"></td>\n");
      out.write("\t");
}
      out.write("\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("<div id = \"indexList\">\n");
      out.write("<DIV class = \"group\" id = \"wai_application\">\n");
      out.write("    <DIV class = \"root\" id = \"tree_root\">\n");
      out.write("    </DIV>\n");
      out.write("</DIV>\n");
      out.write("</div>\n");
      out.write("<div id=\"navigation\">\n");
      out.write("    <table id=\"innerNavigation\" cellspacing=0 cellpadding=0 border=0 style=\"background:transparent;\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td id = \"td_previous\">\t\t\t\t\n");
      out.write("                <a id = \"previous\" class = \"enabled\" onclick=\"this.blur();loadPreviousPage()\">");
      out.print(ServletResources.getString("IndexPrevious", request));
      out.write("</a> \n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td id = \"td_next\">\n");
      out.write("\t\t\t\t<a id = \"next\" class = \"enabled\" onclick=\"this.blur();loadNextPage()\">");
      out.print(ServletResources.getString("IndexNext", request));
      out.write("</a> \n");
      out.write("\t\t\t</td>\n");
      out.write("  \t </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
