package org.apache.jsp.partes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Conocenos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--Conocenos-->\n");
      out.write("<section class=\"quienessomos\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-center\">\n");
      out.write("                <h2 class=\"section heading\"></h2>\n");
      out.write("                <h3 class=\"section-heading text-left\">Quienes Somos</h3>\n");
      out.write("                <p class=\"text-muted\" style=\" text-align: justify\">\n");
      out.write("                    Fundada en 2008 por el Dr. Oscar Hasbún, nuestra empresa se encuentra entre las principales \n");
      out.write("                    compañías de igualas dentales del país. Sonrisa Felix es una empresa con 11 años en el mercado y\n");
      out.write("                    más de 100 empresas afiliadas a las cuales le presta servicio directamente o a través de las diferentes ARS.\n");
      out.write("\n");
      out.write("                    Nuestra empresa cada día afianza más su compromiso con la calidad del servicio que ofrece a todos sus afiliados\n");
      out.write("                    por lo cual usted puede sentirse confiado en que siempre estaremos dando un paso adelante en la eficiencia y calidad\n");
      out.write("                    que el paciente se merece.\n");
      out.write("\n");
      out.write("                    Sonrisa Felix es un moderno sistema de igualas odontológicas que ha sido diseñado bajo la base de medicina preventiva, \n");
      out.write("                    donde el afiliado y sus dependientes podrán asistir a sus citas dentales periódicamente para evitar daños futuros en su \n");
      out.write("                    salud oral.</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!--Mision-->\n");
      out.write("<section class=\"mision\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-left\">\n");
      out.write("                <h3 class=\"section-heading\" >MISIÓN</h3>\n");
      out.write("                <p class=\"text-muted \" style=\" text-align: justify\">\n");
      out.write("                    Brindar servicios odontológicos integrales contribuyendo a \n");
      out.write("                    resolver eficazmente los problemas de salud Oral de nuestros pacientes, \n");
      out.write("                    aplicando para ello conceptos de excelencia en el servicio, eficiencia en la \n");
      out.write("                    gestión y calidez personalizada en la atención. </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!--Vision-->\n");
      out.write("<section class=\"vision\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-left\">\n");
      out.write("                <h3 class=\"section-heading\" >VISIÓN</h3>\n");
      out.write("                <p class=\"text-muted\" style=\" text-align: justify\">\n");
      out.write("                    Ser la clínica odontológica líder en la ciudad de Santiago, con lo más avanzado en\n");
      out.write("                    tecnología y con especialistas que reúnan los requisitos máximos de profesionalismo \n");
      out.write("                    y excelencia, para satisfacer al máximo las exigencias de nuestros pacientes e ir más\n");
      out.write("                    allá de sus expectativas, deseando establecer una relación duradera con cada paciente \n");
      out.write("                    basada en el tratamiento personalizado y orientado al detalle brindándoles nuestra \n");
      out.write("                    experiencia a su servicio. </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!--Valores-->\n");
      out.write("<section class=\"valores\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-left\">\n");
      out.write("                <h3 class=\"section-heading\" >Valores</h3>\n");
      out.write("                <ul style=\"text-align: justify\">\n");
      out.write("                    <li>Serviciales</li>\n");
      out.write("                    <li>Respetuosos</li>\n");
      out.write("                    <li>Comprometidos</li>\n");
      out.write("                    <li>Íntegros</li>\n");
      out.write("                    <li>Responsables</li>\n");
      out.write("                    <li>Unidos</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>");
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
