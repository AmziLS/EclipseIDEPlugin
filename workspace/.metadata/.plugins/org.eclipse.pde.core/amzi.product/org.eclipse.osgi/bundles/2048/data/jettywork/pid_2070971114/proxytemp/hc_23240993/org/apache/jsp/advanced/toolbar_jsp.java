package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class toolbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
	ToolbarData data = new ToolbarData(application,request, response);
	WebappPreferences prefs = data.getPrefs();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<title>");
      out.print(ServletResources.getString("Toolbar", request));
      out.write("</title>\n");
      out.write(" \n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("/* need this one for Mozilla */\n");
      out.write("HTML { \n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("BODY {\n");
      out.write("\tbackground:");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
      out.write("\n");
      out.write("#titleText {\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tcolor:WindowText;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".buttonOn a { \n");
      out.write("\tdisplay:block;\n");
      out.write("\tmargin-left:2px;\n");
      out.write("\tmargin-right:2px;\n");
      out.write("\twidth:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("\theight:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("\tborder:1px solid Highlight;\n");
 
if (data.isIE()){

      out.write("\n");
      out.write("\twriting-mode:tb-rl; ");
      out.write('\n');

}

      out.write("\t\n");
      out.write("    vertical-align:middle;\n");
 
    String bg = prefs.getViewBackgroundStyle();
    if (bg.length() == 0) {

      out.write("\n");
      out.write("\tbackground: Window;\n");

    } else {

      out.write("\n");
      out.write("   ");
      out.print(bg);
      out.write('\n');

}

      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button a, .buttonMenu a { \n");
      out.write("\tdisplay:block;\n");
      out.write("\tmargin-left:2px;\n");
      out.write("\tmargin-right:2px;\n");
      out.write("\theight:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("\tborder:1px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(';');
      out.write('\n');
 
if (data.isIE()){

      out.write("\n");
      out.write("\twriting-mode:tb-rl; ");
      out.write('\n');

}

      out.write("\t\n");
      out.write("\tvertical-align:middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button a {\n");
      out.write("\twidth:");
      out.print(data.isMozilla()?18:20);
      out.write("px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".buttonMenu a {\n");
      out.write("\twidth:");
      out.print(data.isMozilla()?30:32);
      out.write("px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".buttonHidden a { \n");
      out.write("\tdisplay:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button a:hover, .buttonMenu a:hover { \n");
      out.write("\tborder-top:1px solid ButtonHighlight; \n");
      out.write("\tborder-");
      out.print(isRTL?"right":"left");
      out.write(":1px solid ButtonHighlight; \n");
      out.write("\tborder-");
      out.print(isRTL?"left":"right");
      out.write(":1px solid ButtonShadow; \n");
      out.write("\tborder-bottom:1px solid ButtonShadow;\n");
      out.write("}\n");
      out.write("\n");
 if (data.isIE() || data.isMozilla() && "1.2.1".compareTo(data.getMozillaVersion()) <=0){
// maximize (last) button should not jump

      out.write('\n');
      out.write('#');
      out.write('b');
      out.print(data.getButtons().length-1);
      out.write(":hover{\n");
      out.write("\tborder:1px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("}\n");
}
      out.write("\n");
      out.write("\n");
      out.write(".separator {\n");
      out.write("\tbackground-color: ThreeDShadow;\n");
      out.write("\theight:100%;\n");
      out.write("\twidth: 1px;\n");
      out.write("\tborder-top:2px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-bottom:2px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-left:3px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\tborder-right:3px solid ");
      out.print(prefs.getToolbarBackground());
      out.write(";\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("#container {\n");
      out.write("\tborder-bottom:1px solid ThreeDShadow;\n");

if (data.isIE()) {

      out.write(' ');
      out.write('\n');

}else if (data.isMozilla()){

      out.write("\n");
      out.write("\tborder-top:1px solid ThreeDShadow;\n");
      out.write("\theight:24px;\n");

}

      out.write("\n");
      out.write("}\n");
      out.write("\n");

// workaround for adding right border on mozilla (ugly..)
if (data.isMozilla() && "content".equals(request.getParameter("toolbar"))) { 

      out.write("\n");
      out.write("\n");
      out.write("/* need this one for Mozilla */\n");
      out.write("HTML { \n");
      out.write("\tmargin:0px;\n");
      out.write("\tpadding:0px;\n");
      out.write("}\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("var bRestore = false;\n");
      out.write("// Preload images\n");

ToolbarButton[] buttons = data.getButtons();
for (int i=0; i<buttons.length; i++) {
	if (!buttons[i].isSeparator()) {

      out.write("\n");
      out.write("\tvar ");
      out.print(buttons[i].getName());
      out.write(" = new Image();\n");
      out.write("\t");
      out.print(UrlUtil.JavaScriptEncode(buttons[i].getName()));
      out.write(".src = \"");
      out.print(UrlUtil.JavaScriptEncode(buttons[i].getOnImage()));
      out.write('"');
      out.write(';');
      out.write('\n');

	}
}

      out.write("\n");
      out.write("\n");
      out.write("function setTitle(label)\n");
      out.write("{\n");
      out.write("\tif( label == null) label = \"\";\n");
      out.write("\tvar title = document.getElementById(\"titleText\");\n");
      out.write("\tif (title == null) return;\n");
      out.write("\tvar text = title.lastChild;\n");
      out.write("\tif (text == null) return;\n");
      out.write("\ttext.nodeValue = label;\n");
      out.write("}\n");
      out.write("\n");
 if (data.isIE()
	|| data.isMozilla() && "1.2.1".compareTo(data.getMozillaVersion()) <=0
	|| (data.isSafari() && "120".compareTo(data.getSafariVersion()) <= 0) ){

      out.write("\n");
      out.write("function registerMaximizedChangedListener(){\n");
      out.write("\t// get to the frameset\n");
      out.write("\tvar p = parent;\n");
      out.write("\twhile (p && !p.registerMaximizeListener)\n");
      out.write("\t\tp = p.parent;\n");
      out.write("\t\n");
      out.write("\tif (p!= null){\n");
      out.write("\t\tp.registerMaximizeListener('");
      out.print(UrlUtil.JavaScriptEncode(data.getName()));
      out.write("Toolbar', maximizedChanged);\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("registerMaximizedChangedListener();\n");
      out.write("\n");
      out.write("/**\n");
      out.write(" * Handler for double click: maximize/restore this view\n");
      out.write(" * Note: Mozilla browsers prior to 1.2.1 do not support programmatic frame resizing well.\n");
      out.write(" */\n");
      out.write("function mouseDblClickHandler(e) {\n");
      out.write("\t// ignore double click on buttons\n");
      out.write("\tvar target=");
      out.print(data.isIE()?"window.event.srcElement":"e.target");
      out.write(";\n");
      out.write("\tif (target.tagName && (target.tagName == \"A\" || target.tagName == \"IMG\"))\n");
      out.write("\t\treturn;\n");
      out.write("\ttoggleFrame();\n");
      out.write("\treturn false;\n");
      out.write("}\t\t\n");
      out.write("function restore_maximize(button)\n");
      out.write("{\n");
      out.write("\ttoggleFrame();\n");
      out.write("\tif (button && document.getElementById(button)){\n");
      out.write("\t\tdocument.getElementById(button).blur();\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function toggleFrame(){\n");
      out.write("\t// get to the frameset\n");
      out.write("\tvar p = parent;\n");
      out.write("\twhile (p && !p.toggleFrame)\n");
      out.write("\t\tp = p.parent;\n");
      out.write("\t\n");
      out.write("\tif (p!= null){\n");
      out.write("\t\tp.toggleFrame('");
      out.print(UrlUtil.JavaScriptEncode(data.getTitle()));
      out.write("');\n");
      out.write("\t}\n");
      out.write("\tdocument.selection.clear;\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("function maximizedChanged(maximizedNotRestored){\n");
      out.write("\tif(maximizedNotRestored){\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").src=\"");
      out.print(data.getRestoreImage());
      out.write("\";\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"title\", \n");
      out.write("\t\t    \"");
      out.print(UrlUtil.JavaScriptEncode(data.getRestoreTooltip()));
      out.write("\");\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"alt\", \n");
      out.write("\t\t    \"");
      out.print(UrlUtil.JavaScriptEncode(data.getRestoreTooltip()));
      out.write("\");\n");
      out.write("\t\tbRestore = true;\n");
      out.write("\t}else{\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").src=\"");
      out.print(data.getMaximizeImage());
      out.write("\";\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"title\", \n");
      out.write("\t\t    \"");
      out.print(UrlUtil.JavaScriptEncode(data.getMaximizeTooltip()));
      out.write("\");\n");
      out.write("\t\tdocument.getElementById(\"maximize_restore\").setAttribute(\"alt\", \n");
      out.write("\t\t    \"");
      out.print(UrlUtil.JavaScriptEncode(data.getMaximizeTooltip()));
      out.write("\");\n");
      out.write("\t\tbRestore = false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.print(( data.isIE() || data.isSafari() )?
	"document.ondblclick = mouseDblClickHandler;"
:
	"document.addEventListener('dblclick', mouseDblClickHandler, true);");
      out.write('\n');
}
      out.write("\n");
      out.write("\n");
      out.write("function setButtonState(buttonName, pressed) {\n");
      out.write("\tif(!document.getElementById(\"tdb_\"+buttonName))\n");
      out.write("\t\treturn;\n");
      out.write("\tif (pressed == \"hidden\")\n");
      out.write("\t\tdocument.getElementById(\"tdb_\"+buttonName).className=\"buttonHidden\";\n");
      out.write("\telse if(pressed == true)\n");
      out.write("\t\tdocument.getElementById(\"tdb_\"+buttonName).className=\"buttonOn\";\n");
      out.write("\telse\n");
      out.write("\t\tdocument.getElementById(\"tdb_\"+buttonName).className=\"button\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function setWindowStatus(buttonName){\n");
      out.write("\t");

	for (int i=0; i<buttons.length; i++) {
		String name = buttons[i].getName();
      out.write("\n");
      out.write("\t\tif (buttonName == \"");
      out.print(UrlUtil.JavaScriptEncode(name));
      out.write("\"){\n");
      out.write("\t\t\tif (buttonName == \"maximize_restore\"){\n");
      out.write("\t\t\t\tif (bRestore){\n");
      out.write("\t\t\t\t\twindow.status = \"");
      out.print(UrlUtil.JavaScriptEncode(data.getRestoreTooltip()));
      out.write("\";\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\twindow.status = \"");
      out.print(UrlUtil.JavaScriptEncode(data.getMaximizeTooltip()));
      out.write("\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\twindow.status = \"");
      out.print(UrlUtil.JavaScriptEncode(buttons[i].getTooltip()));
      out.write("\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t");
	
	}
	
      out.write("\n");
      out.write("}\n");
      out.write("\n");

if (data.hasMenu()) {

      out.write("\n");
      out.write("\n");
      out.write("function menu(button, param) {\n");
      out.write("\tvar doc = parent.frames[1].document;\n");
      out.write("\tif (!doc.getElementById(\"menu\")) {\n");
      out.write("\t\tvar menu = doc.createElement(\"div\");\n");
      out.write("\t\tmenu.id = \"menu\";\n");
      out.write("\t\tmenu.srcButton = button;\n");
      out.write("\t\tmenu.onmouseout = menuExit;\n");
      out.write("\t\tmenu.onkeydown = menuKey;\n");
      out.write("\t\t\n");
      out.write("\t\tmenu.style.padding = \"2px 2px 2px 2px\";\n");
      out.write("\t\tmenu.style.position = \"absolute\";\n");
      out.write("\t\tmenu.style.");
      out.print(isRTL ? "left" : "right");
      out.write(" = \"0px\";\n");
      out.write("\t\tmenu.style.top = \"0px\";\n");
      out.write("\t\tmenu.style.background = \"");
      out.print(prefs.getToolbarBackground());
      out.write("\";\n");
      out.write("\t\tmenu.style.font = \"");
      out.print(prefs.getToolbarFont());
      out.write("\";\n");
      out.write("\t\tmenu.style.border");
      out.print(isRTL ? "Right" : "Left");
      out.write(" = \"1px solid ThreeDShadow\";\n");
      out.write("\t\tmenu.style.borderBottom = \"1px solid ThreeDShadow\";\n");
      out.write("\n");
      out.write("\t\tvar entries = param.split(\",\");\n");
      out.write("\t\tfor (var i=0;i<entries.length;++i) {\n");
      out.write("\t\t\tvar properties = entries[i].split(\"=\");\n");
      out.write("\t\t\tvar anchor = doc.createElement(\"a\");\n");
      out.write("\t\t\tvar text = doc.createTextNode(properties[0]);\n");
      out.write("\t\t\tanchor.appendChild(text);\n");
      out.write("\t\t\tanchor.href = \"javascript:parent.frames[0].closeMenu(),parent.frames[0].\" + properties[1];\n");
      out.write("\t\t\tanchor.target = \"_self\";\n");
      out.write("\t\t\tanchor.onmouseover = itemEnter;\n");
      out.write("\t\t\tanchor.onmouseout = itemExit;\n");
      out.write("\t\t\tanchor.onfocus = itemEnter;\n");
      out.write("\t\t\tanchor.onblur = itemExit;\n");
      out.write("\t\t\tanchor.style.display = \"block\";\n");
      out.write("\t\t\tanchor.style.cursor = \"default\";\n");
      out.write("\t\t\tanchor.style.textDecoration = \"none\";\n");
      out.write("\t\t\tanchor.style.padding = \"4px 4px 4px 4px\";\n");
      out.write("\t\t\tanchor.style.background = \"transparent\";\n");
      out.write("\t\t\tanchor.style.color = \"WindowText\";\n");
      out.write("\t\t\tmenu.appendChild(anchor);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tdoc.body.appendChild(menu);\n");
      out.write("\t\tmenu.focus();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tif (button && document.getElementById(button)) {\n");
      out.write("\t\tvar buttonElem = document.getElementById(button);\n");
      out.write("\t\tbuttonElem.blur();\n");
      out.write("\t\tbuttonElem.firstChild.title = \"\";\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function menuKey(e) {\n");
      out.write("\tvar key;\n");
      out.write("\tif (!e) var e = parent.frames[parent.frames.length - 1].window.event;\n");
      out.write("\tif (e.keyCode) key = e.keyCode;\n");
      out.write("\telse if (e.which) key = e.which;\n");
      out.write("    var src = e.srcElement ? e.srcElement : e.target;\n");
      out.write("\n");
      out.write("  \tif (key == 38) { // Up arrow\n");
      out.write("  \t\tif (src.id != \"menu\" && src.previousSibling) {\n");
      out.write("  \t\t\tsrc.previousSibling.focus();\n");
      out.write("  \t\t}\n");
      out.write("  \t}\n");
      out.write("  \telse if (key == 40) { // Down arrow\n");
      out.write("  \t\tif (src.id == \"menu\") {\n");
      out.write("  \t\t\tsrc.firstChild.focus();\n");
      out.write("  \t\t}\n");
      out.write("  \t\telse if (src.nextSibling) {\n");
      out.write("  \t\t\tsrc.nextSibling.focus();\n");
      out.write("  \t\t}\n");
      out.write("  \t}\n");
      out.write("  \telse if (key == 27) { // Esc\n");
      out.write("  \t\tcloseMenu();\n");
      out.write("  \t}\n");
      out.write("  \telse {\n");
      out.write("  \t\treturn true;\n");
      out.write("  \t}\n");
      out.write("  \treturn false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeMenu() {\n");
      out.write("    parent.frames[parent.frames.length - 1].window.status = \"\";\n");
      out.write("\tvar menu = parent.frames[1].document.getElementById(\"menu\");\n");
      out.write("\tmenu.parentNode.removeChild(menu);\n");
      out.write("\n");
      out.write("\tvar img = document.getElementById(menu.srcButton).firstChild;\n");
      out.write("\timg.title = img.alt;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function itemEnter(e) {\n");
      out.write("    this.style.background = \"Highlight\";\n");
      out.write("    this.style.color = \"HighlightText\";\n");
      out.write("    parent.frames[parent.frames.length - 1].window.status = this.firstChild.nodeValue;\n");
      out.write("    return true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function itemExit(e) {\n");
      out.write("    this.style.background = \"transparent\";\n");
      out.write("    this.style.color = \"WindowText\";\n");
      out.write("    parent.frames[parent.frames.length - 1].window.status = \"\";\n");
      out.write("    return true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function menuExit(e) {\n");
      out.write("\tif (!e) var e = parent.frames[parent.frames.length - 1].window.event;\n");
      out.write("    var target = e.relatedTarget ? e.relatedTarget : e.toElement;\n");
      out.write("    while (target && target != this)\n");
      out.write("         target = target.parentNode;\n");
      out.write("    if (target == this) return;\n");
      out.write("    closeMenu();\n");
      out.write("}\n");
      out.write("\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");

if (data.getScript() != null) {

      out.write("\n");
      out.write("<script language=\"JavaScript\" src=\"");
      out.print(UrlUtil.htmlEncode(data.getScript()));
      out.write("\"></script>\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write(" \n");

if(buttons.length > 0){

      out.write("\n");
      out.write("\t<body dir=\"");
      out.print(direction);
      out.write('"');
      out.write('>');
      out.write('\n');

}else{

      out.write("\n");
      out.write("\t<body dir=\"");
      out.print(direction);
      out.write("\" tabIndex=\"-1\">\n");

}

      out.write("\n");
      out.write("\n");
      out.write("<table id=\"container\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"100%\" style='padding-");
      out.print(isRTL?"right":"left");
      out.write(':');
      out.print(data.isIE()?"5px":"8px");
      out.write(";'>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td nowrap style=\"font: ");
      out.print(prefs.getToolbarFont());
      out.write("\" valign=\"middle\">\n");
      out.write("\t\t\t<div id=\"titleTextTableDiv\" style=\"overflow:hidden; height:22px;\"><table><tr><td nowrap style=\"font:");
      out.print(prefs.getToolbarFont());
      out.write("\"><div id=\"titleText\" >&nbsp;");
      out.print(data.getTitle());
      out.write("</div></td></tr></table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div style=\"position:absolute; top:1px; ");
      out.print(isRTL?"left":"right");
      out.write(":0px;\">\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" height=\"100%\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"");
      out.print(isRTL?"left":"right");
      out.write("\">\n");
      out.write("\t\t\t\t\t<table align=\"");
      out.print(isRTL?"left":"right");
      out.write("\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"100%\" style=\"background:");
      out.print(prefs.getToolbarBackground());
      out.write("\">\n");
      out.write("\t\t\t\t\t<tr>\n");

	for (int i=0; i<buttons.length; i++) {
		if (buttons[i].isSeparator()) {

      out.write("\n");
      out.write("\t\t\t\t\t\t<td align=\"middle\" class=\"separator\" valign=\"middle\">\n");
      out.write("\t\t\t\t\t\t</td>\n");

		} else {

      out.write("\n");
      out.write("\t\t\t\t\t\t<td align=\"middle\" id=\"tdb_");
      out.print(UrlUtil.htmlEncode(buttons[i].getName()));
      out.write("\" class=\"");
      out.print(UrlUtil.htmlEncode(buttons[i].getStyleClass()));
      out.write("\" height=18>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:");
      out.print(UrlUtil.htmlEncode(buttons[i].getAction()));
      out.write('(');
      out.write('\'');
      out.write('b');
      out.print(i);
      out.write("', '");
      out.print(UrlUtil.htmlEncode(buttons[i].getParam()));
      out.write("');\" \n");
      out.write("\t\t\t\t\t\t\t   onmouseover=\"javascript:setWindowStatus('");
      out.print(UrlUtil.htmlEncode(buttons[i].getName()));
      out.write("');return true;\" \n");
      out.write("\t\t\t\t\t\t\t   onmouseout=\"window.status='';\"\n");
      out.write("\t\t\t\t\t\t\t   id=\"b");
      out.print(i);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t   <img src=\"");
      out.print(UrlUtil.htmlEncode(buttons[i].getOnImage()));
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\t\t\talt='");
      out.print(UrlUtil.htmlEncode(buttons[i].getTooltip()));
      out.write("' \n");
      out.write("\t\t\t\t\t\t\t\t\ttitle='");
      out.print(UrlUtil.htmlEncode(buttons[i].getTooltip()));
      out.write("'\n");
      out.write("\t\t\t\t\t\t\t\t\tborder=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"");
      out.print(UrlUtil.htmlEncode(buttons[i].getName()));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</td>\n");

		}
	}

      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table> \n");
      out.write("\t\t</div>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("\n");
// special case for content toolbar - internally used live help frame
if ("content".equals(request.getParameter("toolbar"))) {

      out.write("\n");
      out.write("    <iframe name=\"liveHelpFrame\" title=\"");
      out.print(ServletResources.getString("ignore", "liveHelpFrame", request));
      out.write("\" src=\"blank.html\" style=\"visibility:hidden\" tabindex=\"-1\" frameborder=\"no\" width=\"0\" height=\"0\" scrolling=\"no\">\n");
      out.write("    </iframe>\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</body>     \n");
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
