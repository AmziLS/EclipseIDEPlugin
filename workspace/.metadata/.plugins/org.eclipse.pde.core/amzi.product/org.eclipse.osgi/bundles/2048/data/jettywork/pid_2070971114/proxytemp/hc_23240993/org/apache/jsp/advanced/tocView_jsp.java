package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class tocView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/advanced/../advanced/header.jsp");
    _jspx_dependants.add("/advanced/tocTree.css");
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
 
	RequestData requestData = new RequestData(application,request, response);
	WebappPreferences prefs = requestData.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("Content", request));
      out.write("</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/*******************************************************************************\n");
      out.write(" * Copyright (c) 2006 IBM Corporation and others.\n");
      out.write(" * All rights reserved. This program and the accompanying materials \n");
      out.write(" * are made available under the terms of the Eclipse Public License v1.0\n");
      out.write(" * which accompanies this distribution, and is available at\n");
      out.write(" * http://www.eclipse.org/legal/epl-v10.html\n");
      out.write(" * \n");
      out.write(" * Contributors:\n");
      out.write(" *     IBM Corporation - initial API and implementation\n");
      out.write(" *******************************************************************************/\n");
      out.write(" \n");
      out.write(" BODY {\n");
      out.write("\tfont: ");
      out.print(prefs.getViewFont());
      out.write(";\n");
      out.write("\tmargin-top:2px;\n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":5px;\n");
      out.write("\tpadding:0;\n");
      out.write("\tborder:0;\n");
      out.write("\t");
      out.print(prefs.getViewBackgroundStyle());
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#root {\n");
      out.write("\tmargin-top:0px;\n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.root {\n");
      out.write("    font-weight:bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.visible, DIV.unopened { \n");
      out.write("\tborder-width:0; \n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":1.5em; \n");
      out.write("\tfont-weight:normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("DIV.group { \n");
      out.write("\tborder-width:0; \n");
      out.write("\tmargin-");
      out.print(isRTL?"right":"left");
      out.write(":0; \n");
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
      out.write("\tcolor:WindowText;\n");
      out.write("\tpadding-");
      out.print(isRTL?"left":"right");
      out.write(":2px;\n");
      out.write("\t/* this works in ie5.5, but not in ie5.0  */\n");
      out.write("\twhite-space: nowrap;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A:hover{\n");
      out.write("\ttext-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");
      out.write("A.active{ \n");
      out.write("\tcolor:HighlightText;\n");
      out.write("\tbackground:Highlight;\n");
      out.write("\twidth:100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("A.active:hover{\n");
      out.write("\ttext-decoration:underline; \n");
      out.write("}\n");
      out.write("\n");
      out.write("A.nolink {\n");
      out.write("\ttext-decoration:none; \n");
      out.write("}\n");
      out.write("\n");
      out.write("A.nolink:link, A.nolink:visited {\n");
      out.write("\tcolor:WindowText;\n");
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
      out.write(" \n");
      out.write("\n");
      out.write("</style>  \n");
      out.write("    \n");
      out.write("<base target=\"ContentViewFrame\">\n");
      out.write("<script language=\"JavaScript\" src=\"helptree.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"helptreechildren.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"xmlajax.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"utils.js\"></script>\n");
      out.write("<script language=\"JavaScript\" src=\"tocTree.js\"></script>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("// Preload images\n");
      out.write("var imagesDirectory = \"");
      out.print(prefs.getImagesDirectory());
      out.write("\";\n");
      out.write("minus = new Image();\n");
      out.write("minus.src = imagesDirectory + \"/minus.gif\";\n");
      out.write("plus = new Image();\n");
      out.write("plus.src = imagesDirectory + \"/plus.gif\";\n");
      out.write("toc_open_img = new Image();\n");
      out.write("toc_open_img.src = imagesDirectory + \"/toc_open.gif\";\n");
      out.write("toc_closed_img = new Image();\n");
      out.write("toc_closed_img.src = imagesDirectory + \"/toc_closed.gif\";\n");
      out.write("folder_img = new Image();\n");
      out.write("folder_img.src = imagesDirectory + \"/container_obj.gif\";\n");
      out.write("folder_topic = new Image();\n");
      out.write("folder_topic.src = imagesDirectory + \"/container_topic.gif\";\n");
      out.write("topic_img = new Image();\n");
      out.write("topic_img.src = imagesDirectory + \"/topic.gif\";\n");
      out.write("\n");
      out.write("var altTopic = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("altTopic", request)));
      out.write("\";\n");
      out.write("var altContainer = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("altContainer", request)));
      out.write("\";\n");
      out.write("var altContainerTopic = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("altContainerTopic", request)));
      out.write("\";\n");
      out.write("var altBookClosed = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("bookClosed", request)));
      out.write("\";\n");
      out.write("var altBookOpen = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("bookOpen", request)));
      out.write("\";\n");
      out.write("var altPlus = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("expandTopicTitles", request)));
      out.write("\";\n");
      out.write("var altMinus = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("collapseTopicTitles", request)));
      out.write("\";\n");
      out.write("var loadingMessage = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("Loading", request)));
      out.write("\";\n");
      out.write("var cookiesRequired = \"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("cookiesRequired", request)));
      out.write("\";\n");
      out.write("\n");
      out.write("var isIE = navigator.userAgent.indexOf('MSIE') != -1;\n");
      out.write("\n");
      out.write("var tocTitle = \"\";\n");
      out.write("var tocId = \"\";\n");
      out.write("\t\n");
      out.write("function onloadHandler()\n");
      out.write("{\n");
      out.write("    setRootAccessibility();\n");
      out.write("\tloadChildren(null);\n");
      out.write("\t\n");
      out.write("\t// Set prefix for AJAX calls by removing advanced/tocView.jsp from location\n");
      out.write("\tvar locationHref = window.location.href;\n");
      out.write("    var slashAdvanced = locationHref.lastIndexOf('/advanced');\n");
      out.write("    if(slashAdvanced > 0) {\n");
      out.write("\t    setAjaxPrefix(locationHref.substr(0, slashAdvanced));\n");
      out.write("\t}\n");

    if (request.getParameter("topic") != null) {
        TocData data = new TocData(application,request, response);
	    if (data.getSelectedToc() != -1) {

      out.write("\n");
      out.write("\tvar tocTopic = \"");
      out.print(UrlUtil.JavaScriptEncode(data.getTocDescriptionTopic(data.getSelectedToc())));
      out.write("\";\n");
      out.write("\tvar topicSelected=false;\n");
      out.write("\t// select specified topic, or else the book\n");
      out.write("\tvar topic = \"");
      out.print(UrlUtil.JavaScriptEncode(data.getSelectedTopic()));
      out.write("\";\n");
      out.write("\tif (topic != \"about:blank\" && topic != tocTopic) {\n");
      out.write("\t\tif (topic.indexOf(window.location.protocol) != 0 && topic.length > 2) {\n");
      out.write("\t\t\t// remove the .. from topic\n");
      out.write("\t\t\ttopic = topic.substring(2);\n");
      out.write("\t\t\t// remove advanced/tocView.jsp from path to obtain contextPath\n");
      out.write("\t\t\tvar contextPath = window.location.pathname;\n");
      out.write("\t\t\tvar slash = contextPath.lastIndexOf('/');\n");
      out.write("\t\t\tif(slash > 0) {\n");
      out.write("\t\t\t\tslash = contextPath.lastIndexOf('/', slash-1);\n");
      out.write("\t\t\t\tif(slash >= 0) {\n");
      out.write("\t\t\t\t\tcontextPath = contextPath.substr(0, slash);\n");
      out.write("\t\t\t\t\ttopic = window.location.protocol + \"//\" +window.location.host + contextPath + topic;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\ttopicSelected = selectTopic(topic);\n");
      out.write("\t} \n");

	    }
	} else if (!"true".equalsIgnoreCase(request.getParameter("collapse"))) {

      out.write("   \n");
      out.write("        if (isAutosynchEnabled()) {\n");
      out.write("\t        selectTopic(\"");
      out.print(prefs.getHelpHome());
      out.write("\", true);\n");
      out.write("\t    }\n");

	} 

      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("function onunloadHandler() {\n");

// for large books, we want to avoid a long unload time
if (requestData.isIE()){

      out.write("\n");
      out.write("\tdocument.body.innerHTML = \"\";\n");

}

      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body dir=\"");
      out.print(direction);
      out.write("\" onload=\"onloadHandler()\" onunload=\"onunloadHandler()\">\n");
      out.write("  <DIV class = \"group\" id = \"wai_application\">\n");
      out.write("    <DIV class = \"root\" id = \"tree_root\">\n");
      out.write("    </DIV>\n");
      out.write("  </DIV>\n");
      out.write("</body>\n");
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
