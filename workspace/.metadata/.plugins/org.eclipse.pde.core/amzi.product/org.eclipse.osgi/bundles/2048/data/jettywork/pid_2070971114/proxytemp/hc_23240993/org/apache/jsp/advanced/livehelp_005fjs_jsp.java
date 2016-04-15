package org.apache.jsp.advanced;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.help.internal.webapp.data.*;

public final class livehelp_005fjs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

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
      			"/advanced/err.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

	request.setCharacterEncoding("UTF-8");

      out.write("\n");
      out.write("<script language=\"JavaScript\">\n");
      out.write("function liveActionInternal(topHelpWindow, pluginId, className, argument)\n");
      out.write("{\n");

	RequestData data = new RequestData(application,request, response);
	WebappPreferences prefs = data.getPrefs();
	if(data.getMode() == RequestData.MODE_INFOCENTER){

      out.write("\n");
      out.write("\talert(\"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("noLiveHelpInInfocenter", request)));
      out.write("\");\n");
      out.write("\treturn;\n");

	}else if(!prefs.isActiveHelp()){

      out.write("\n");
      out.write("\talert(\"");
      out.print(UrlUtil.JavaScriptEncode(ServletResources.getString("noLiveHelp", request)));
      out.write("\");\n");
      out.write("\treturn;\n");

	}else {

      out.write("\n");
      out.write("\t// construct the proper url for communicating with the server\t\n");
      out.write("\tvar url= window.location.href;\n");
      out.write("\t\n");
      out.write("\tvar i = url.indexOf(\"?\");\n");
      out.write("\tif(i>0)\n");
      out.write("\t\turl=url.substring(0, i);\n");
      out.write("\t\n");
      out.write("\ti = url.indexOf(\"/topic/\");\n");
      out.write("\tif(i < 0)\n");
      out.write("\t\ti = url.lastIndexOf(\"/\");\n");
      out.write("\n");
      out.write("\turl=url.substring(0, i+1);\n");
      out.write("\tvar encodedArg=encodeURIComponent(argument);\n");
      out.write("\turl=url+\"livehelp/?pluginID=\"+pluginId+\"&class=\"+className+\"&arg=\"+encodedArg+\"&nocaching=\"+Math.random();\n");
      out.write("\n");
      out.write("\t// we need to find the toolbar frame.\n");
      out.write("\t// to do: cleanup this, including the location of the hidden livehelp frame.\t\n");
      out.write("\tvar toolbarFrame = topHelpWindow.HelpFrame.ContentFrame.ContentToolbarFrame;\n");
      out.write("\tif (!toolbarFrame){\n");
      out.write("\t\twindow.location=url;\n");
      out.write("\t\treturn;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tif(toolbarFrame.liveHelpFrame){\n");
      out.write("\t\ttoolbarFrame.liveHelpFrame.location=url;\n");
      out.write("\t}\n");

	}

      out.write("\n");
      out.write("}\n");
      out.write("function showTopicInContentsInternal(topHelpWindow, topic) {\n");
      out.write("\ttry{\n");
      out.write("\t\ttopHelpWindow.HelpFrame.NavFrame.displayTocFor(topic, false);\n");
      out.write("\t}catch(e){\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
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
