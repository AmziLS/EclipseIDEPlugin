package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class tabs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/advanced/header.jsp");
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");

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
	View[] views = data.getViews();

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("Tabs", request));
      out.write("</title>\n");
      out.write("    \n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\theight:100%;\n");
 
if (data.isMozilla()){

      out.write("\n");
      out.write("\theight:21px;\n");

}

      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* tabs at the bottom */\n");
      out.write(".tab {\n");
      out.write("\tfont-size:5px;");
      out.write("\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tborder-top:1px solid ThreeDShadow;\n");
      out.write("\tborder-bottom:1px solid ");
      out.print(data.isMozilla()?prefs.getToolbarBackground():"ThreeDShadow");
      out.write(";\n");
      out.write("\tcursor:default;\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pressed {\n");
      out.write("\tfont-size:5px;");
      out.write("\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tcursor:default;\n");
      out.write("\t");
      out.print(prefs.getViewBackgroundStyle());
      out.write("\n");
      out.write("\tborder-top:0px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-bottom:1px solid ThreeDShadow;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".separator {\n");
      out.write("\theight:100%;\n");
      out.write("\tbackground-color:ThreeDShadow;\n");
      out.write("\tborder-bottom:1px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".separator_pressed {\n");
      out.write("\theight:100%;\n");
      out.write("\tbackground-color:ThreeDShadow;\n");
      out.write("\tborder-top:0px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-bottom:1px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
      out.write("\n");
      out.write("A {\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\tvertical-align:middle;\n");
      out.write("\theight:16px;\n");
      out.write("\twidth:16px;\n");
 
if (data.isIE()){

      out.write("\n");
      out.write("\twriting-mode:tb-rl; ");
      out.write('\n');

} else {

      out.write("\n");
      out.write("\tdisplay:block;");
      out.write('\n');

}

      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("IMG {\n");
      out.write("\tborder:0px;\n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("\theight:16px;\n");
      out.write("\twidth:16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("var isMozilla = navigator.userAgent.indexOf('Mozilla') != -1 && parseInt(navigator.appVersion.substring(0,1)) >= 5;\n");
      out.write("var isIE = navigator.userAgent.indexOf('MSIE') != -1;\n");
      out.write("var linksArray = new Array (\"linktoc\", \"linkindex\", \"linksearch\", \"linkbookmarks\");\n");
      out.write("\n");
      out.write("if (isIE){\n");
      out.write("  document.onkeydown = keyDownHandler;\n");
      out.write("} else {\n");
      out.write("  document.addEventListener('keydown', keyDownHandler, true);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Returns the target node of an event\n");
      out.write(" */\n");
      out.write("function getTarget(e) {\n");
      out.write("\tvar target;\n");
      out.write("  \tif (isIE)\n");
      out.write("   \t\ttarget = window.event.srcElement;\n");
      out.write("  \telse\n");
      out.write("  \t\ttarget = e.target;\n");
      out.write("\n");
      out.write("\treturn target;\n");
      out.write("}\n");
      out.write("\n");

for (int i=0; i<views.length; i++) {

      out.write("\n");
      out.write("\tvar ");
      out.print(views[i].getName());
      out.write(" = new Image();\n");
      out.write("\t");
      out.print(views[i].getName());
      out.write(".src = \"");
      out.print(views[i].getOnImage());
      out.write('"');
      out.write(';');
      out.write('\n');

}

      out.write("\n");
      out.write("\n");
      out.write("var lastTab = \"\";\n");
      out.write("/* \n");
      out.write(" * Switch tabs.\n");
      out.write(" */ \n");
      out.write("function showTab(tab)\n");
      out.write("{ \t\n");
      out.write("\tif (tab == lastTab) \n");
      out.write("\t\treturn;\n");
      out.write("\t\n");
      out.write("\tlastTab = tab;\n");
      out.write("\t\n");
      out.write(" \t// show the appropriate pressed tab\n");
      out.write("  \tvar buttons = document.body.getElementsByTagName(\"TD\");\n");
      out.write("  \tfor (var i=0; i<buttons.length; i++)\n");
      out.write("  \t{\n");
      out.write("  \t\tif (buttons[i].id == tab) { \n");
      out.write("\t\t\tbuttons[i].className = \"pressed\";\n");
      out.write("\t\t\tif (i > 0) \n");
      out.write("\t\t\t\tbuttons[i-1].className = \"separator_pressed\";\n");
      out.write("\t\t\tif (i<buttons.length-1) \n");
      out.write("\t\t\t\tbuttons[i+1].className = \"separator_pressed\";\n");
      out.write("\t\t} else if (buttons[i].className == \"pressed\") {\n");
      out.write("\t\t\tbuttons[i].className = \"tab\";\n");
      out.write("\t\t\tif (i > 0) \n");
      out.write("\t\t\t\tif (i > 1 && buttons[i-2].id == tab) \n");
      out.write("\t\t\t\t\tbuttons[i-1].className = \"separator_pressed\";\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\tbuttons[i-1].className = \"separator\";\n");
      out.write("\t\t\tif (i<buttons.length-1) \n");
      out.write("\t\t\t\tif (i<buttons.length-2 && buttons[i+2].id == tab) \n");
      out.write("\t\t\t\t\tbuttons[i+1].className = \"separator_pressed\";\n");
      out.write("\t\t\t\telse\n");
      out.write("\t\t\t\t\tbuttons[i+1].className = \"separator\";\n");
      out.write("\t\t}\n");
      out.write(" \t }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Handler for key down (arrows)\n");
      out.write(" */\n");
      out.write("function keyDownHandler(e)\n");
      out.write("{\n");
      out.write("\tvar key;\n");
      out.write("\n");
      out.write("\tif (isIE) {\n");
      out.write("\t\tkey = window.event.keyCode;\n");
      out.write("\t} else {\n");
      out.write("\t\tkey = e.keyCode;\n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("\tif (key <37 || key > 39) \n");
      out.write("\t\treturn true;\n");
      out.write("\t\n");
      out.write("  \tvar clickedNode = getTarget(e);\n");
      out.write("  \tif (!clickedNode) return true;\n");
      out.write("\n");
      out.write("\tvar linkId=\"\";\n");
      out.write("\tif (clickedNode.tagName == 'A')\n");
      out.write("\t\tlinkId=clickedNode.id;\n");
      out.write("\telse if(clickedNode.tagName == 'TD')\n");
      out.write("\t\tlinkId=\"link\"+clickedNode.id;\n");
      out.write("\n");
      out.write("  \tif (isIE)\n");
      out.write("  \t\twindow.event.cancelBubble = true;\n");
      out.write("  \telse\n");
      out.write("  \t\te.cancelBubble = true;\n");
      out.write("  \tif (key == 38 ) { // up arrow\n");
      out.write("\t\tif(linkId.length>4){\n");
      out.write("\t\t\tparent.showView(linkId.substring(4, linkId.length));\n");
      out.write("\t\t\tclickedNode.blur();\n");
      out.write("\t\t\tparent.frames.ViewsFrame.focus();\n");
      out.write("\t\t}\n");
      out.write("  \t} else if (key == 39) { // Right arrow, expand\n");
      out.write("  \t\tvar nextLink=getNextLink(linkId);\n");
      out.write("\t\tif(nextLink!=null){\n");
      out.write("\t\t\tdocument.getElementById(nextLink).focus();\n");
      out.write("\t\t}\n");
      out.write("  \t} else if (key == 37) { // Left arrow,collapse\n");
      out.write("   \t\tvar previousLink=getPreviousLink(linkId);\n");
      out.write("\t\tif(previousLink!=null){\n");
      out.write("\t\t\tdocument.getElementById(previousLink).focus();\n");
      out.write("\t\t}\n");
      out.write(" \t}\n");
      out.write("  \t \t\t\t\n");
      out.write("  \treturn false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function getNextLink(currentLink){\n");
      out.write("\tfor(i=0; i<linksArray.length; i++){\n");
      out.write("\t\tif(currentLink==linksArray[i]){\n");
      out.write("\t\t\tif((i+1)<linksArray.length)\n");
      out.write("\t\t\t\treturn linksArray[i+1];\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\treturn linksArray[0];\n");
      out.write("}\n");
      out.write("\n");
      out.write("function getPreviousLink(currentLink){\n");
      out.write("\tfor(i=0; i<linksArray.length; i++){\n");
      out.write("\t\tif(currentLink==linksArray[i]){\n");
      out.write("\t\t\tif(i>0)\n");
      out.write("\t\t\t\t return linksArray[i-1];\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\treturn linksArray[linksArray.length-1];\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("   \n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\" onload=\"showTab('");
      out.print(data.getVisibleView());
      out.write("')\">\n");
      out.write("\n");
      out.write("  <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\" height=\"100%\" valign=\"middle\">\n");
      out.write("   <tr>\n");
      out.write("\n");

	for (int i=0; i<views.length; i++) 
	{
		String title = ServletResources.getString(views[i].getName(), request);
		if (i != 0) {

      out.write("\n");
      out.write("\t<td width=\"1px\" class=\"separator\"><div style=\"width:1px;height:1px;display:block;\"></div></td>\n");
      out.write("\t");
      out.write('\n');

		}

      out.write("\n");
      out.write("\t<td  title=\"");
      out.print(UrlUtil.htmlEncode(title));
      out.write("\" \n");
      out.write("\t     align=\"center\"  \n");
      out.write("\t     valign=\"middle\"\n");
      out.write("\t     class=\"tab\" \n");
      out.write("\t     id=\"");
      out.print(views[i].getName());
      out.write("\" \n");
      out.write("\t     onclick=\"parent.showView('");
      out.print(views[i].getName());
      out.write("')\" \n");
      out.write("\t     onmouseover=\"window.status='");
      out.print(UrlUtil.JavaScriptEncode(title));
      out.write("';return true;\" \n");
      out.write("\t     onmouseout=\"window.status='';\">\n");
      out.write("\t     <a  href='javascript:parent.showView(\"");
      out.print(views[i].getName());
      out.write("\");' \n");
      out.write("\t         onclick='this.blur();return false;' \n");
      out.write("\t         onmouseover=\"window.status='");
      out.print(UrlUtil.JavaScriptEncode(title));
      out.write("';return true;\" \n");
      out.write("\t         onmouseout=\"window.status='';\"\n");
      out.write("\t         id=\"link");
      out.print(views[i].getName());
      out.write("\"\n");
      out.write("\t         ");
      out.print(views[i].getKey()==View.NO_SHORTCUT?"":"ACCESSKEY=\""+views[i].getKey()+"\"");
      out.write(">\n");
      out.write("\t         <img alt=\"");
      out.print(UrlUtil.htmlEncode(title));
      out.write("\" \n");
      out.write("\t              title=\"");
      out.print(UrlUtil.htmlEncode(title));
      out.write("\" \n");
      out.write("\t              src=\"");
      out.print(views[i].getOnImage());
      out.write("\"\n");
      out.write("\t              id=\"img");
      out.print(views[i].getName());
      out.write("\"\n");
      out.write("\t              height=\"16\"\n");
      out.write("\t         >\n");
      out.write("\t     </a>\n");
      out.write("\t</td>\n");

	}

      out.write("\n");
      out.write(" \n");
      out.write("   </tr>\n");
      out.write("   </table>\n");
      out.write("\n");
      out.write("</body>\n");
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
