package org.apache.jsp.partes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ofertas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<section class=\"ofertas\">\n");
      out.write("    <!-- Contenedor -->\n");
      out.write("    <div class=\"pricing-wrapper clearfix\">\n");
      out.write("        <div class=\"pricing-table\">\n");
      out.write("            <h1 class=\"pricing-title\">Plan Básico</h1>\n");
      out.write("            <div class=\"table-price\">10% <sup>Los afiliados de ARS</sup></div>\n");
      out.write("            <!-- Lista de Caracteristicas -->\n");
      out.write("            <ul class=\"pricing-list\">\n");
      out.write("                <li>Diagnóstico<span></span></li>\n");
      out.write("                <li>Radiografia <span></span></li>\n");
      out.write("                <li>Preventivo <span></span></li>\n");
      out.write("                <li>Periodoncia<span class=\"unlimited\">ilimitadas</span></li>\n");
      out.write("                <li>Emergencia<span class=\"unlimited\">ilimitadas</span></li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Boton de Comprar / Contratar -->\n");
      out.write("            <div class=\"table-buy\">\n");
      out.write("                <p>solo en el mes de Abril<sup></sup></p>\n");
      out.write("                <a href=\"#\" class=\"primary-action\">Contratar</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"pricing-table recommended\">\n");
      out.write("            <h1 class=\"pricing-title\">Plan Empresarial</h1>\n");
      out.write("            <div class=\"table-price\">18% <sup>A los mienbro de este plan</sup></div>\n");
      out.write("            <!-- Lista de Caracteristicas -->\n");
      out.write("            <ul class=\"pricing-list\">\n");
      out.write("                <li><span>De alamacenamiento</span></li>\n");
      out.write("                <li>3 <span>incluidos</span></li>\n");
      out.write("                <li><span>De transferencia mensual</span></li>\n");
      out.write("                <li><span class=\"unlimited\">ilimitadas</span></li>\n");
      out.write("                <li><span class=\"unlimited\">ilimitadas</span></li>\n");
      out.write("                <li><span>Incluido</span></li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Boton de Comprar / Contratar -->\n");
      out.write("            <div class=\"table-buy\">\n");
      out.write("                <p>solo en el mes de Abril <sup></sup></p>\n");
      out.write("                <a href=\"#\" class=\"primary-action\">Contratar</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"pricing-table\">\n");
      out.write("            <h1 class=\"pricing-title\">Ultimate</h1>\n");
      out.write("            <div class=\"table-price\">25%<sup></sup></div>\n");
      out.write("            <!-- Lista de Caracteristicas -->\n");
      out.write("            <ul class=\"pricing-list\">\n");
      out.write("                <li><span></span></li>\n");
      out.write("                <li>8<span>incluidos</span></li>\n");
      out.write("                <li><span>De transferencia mensual</span></li>\n");
      out.write("                <li><span class=\"unlimited\">ilimitadas</span></li>\n");
      out.write("                <li><span class=\"unlimited\">ilimitadas</span></li>\n");
      out.write("                <li><span>Incluido</span></li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- Boton de Comprar / Contratar -->\n");
      out.write("            <div class=\"table-buy\">\n");
      out.write("                <p>$200 <sup>/mes</sup></p>\n");
      out.write("                <a href=\"#\" class=\"primary-action\">Contratar</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
