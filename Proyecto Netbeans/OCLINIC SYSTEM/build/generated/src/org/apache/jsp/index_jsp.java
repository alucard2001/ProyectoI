package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(11);
    _jspx_dependants.add("/partes/head.jsp");
    _jspx_dependants.add("/partes/jumbotron.jsp");
    _jspx_dependants.add("/partes/Menu.jsp");
    _jspx_dependants.add("/partes/Bienvenida.jsp");
    _jspx_dependants.add("/partes/Conocenos.jsp");
    _jspx_dependants.add("/partes/Servicios.jsp");
    _jspx_dependants.add("/partes/Garantia.jsp");
    _jspx_dependants.add("/partes/Staff.jsp");
    _jspx_dependants.add("/partes/Contactenos.jsp");
    _jspx_dependants.add("/partes/Final.jsp");
    _jspx_dependants.add("/partes/Derecho.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Clinica Odontologica Sonrisa Feliz</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"imagenes/icono-de-la-clinica.png\" type=\"imagen/xl-icon\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("   </head>\n");
      out.write("\r\n");
      out.write("    <body> \r\n");
      out.write("        ");
      out.write("\n");
      out.write(" <!--jumbotron-->\n");
      out.write("        <section class=\"jumbotron\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"titulo\">Sonrisa Feliz</h1>\n");
      out.write("                <h3>Mirando el mundo con una sonrisa</h3>\n");
      out.write("                <p> <a href=\"#\"  class=\"btn btn-primary btn-lg\" onclick=\"$('.quienessomos').animatescroll({padding: 71})\">Conocenos</a></p>\n");
      out.write("            </div>\n");
      out.write("        </section>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write('9');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header> \r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\" style=\"display: block;\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header page-scroll\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion-sf\">\r\n");
      out.write("                    <span class=\"sr-only\">este es el boton desplegave</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>                    \r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"#\">Sonrisa Feliz</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--menu-->\r\n");
      out.write("            <div class=\"collapse navbar-collapse \" id=\"navegacion-sf\" >\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li><a href=\"index.jsp\" onclick=\"$('header').animatescroll({padding: 71})\">Inicio</a></li> \r\n");
      out.write("\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\">\r\n");
      out.write("                            Conocenos <span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\" onclick=\"$('.services').animatescroll({padding: 71})\">Servicios</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"#\" onclick=\"$('.quienessomos').animatescroll({padding: 71})\">Quienes Somos</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"#\" onclick=\"$('.mision').animatescroll({padding: 71})\">Vision y Mision</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"#\" onclick=\"$('.valores').animatescroll({padding: 71})\">Valores</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"#\" onclick=\"$('.staff').animatescroll({padding: 71})\">Staff</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"#\" onclick=\"$('.garantia').animatescroll({padding: 71})\">Garantia</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"partes/Ofertas.jsp#\"onclick=\"$('.oferta').animatescroll({padding: 71})\">Ofertas</a></li>\r\n");
      out.write("                    <li><a href=\"#\" onclick=\"$('.contactos').animatescroll({padding: 71})\">Contactenos</a></li>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        $(document).ready(function () {\r\n");
      out.write("                            $(\"#ValidarUsuario\").submit(function () {\r\n");
      out.write("                                $.post(\"ValidarUsuario\", $(\"#ValidarUsuario\").serialize(), function (data) {\r\n");
      out.write("                                    perfil = jQuery.trim(data);\r\n");
      out.write("                                    if (perfil == 1)\r\n");
      out.write("                                        $(\"#mensajeingreso\").html(\"<h1>Usuario o Clave no Valida</h1>\");\r\n");
      out.write("                                    //document.location.href = \"MenuAdmin.jsp\";\r\n");
      out.write("                                    else\r\n");
      out.write("                                        $(\"#mensajeingreso\").html(\"<h1>Usuario o Clave no Valida</h1>\");\r\n");
      out.write("                                });\r\n");
      out.write("                                return false;\r\n");
      out.write("                            });\r\n");
      out.write("                        });\r\n");
      out.write("                    </script> \r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"partes/Login.jsp#\" class=\"dropdown-toggle glyphicon glyphicon-lock\" data-toggle=\"dropdown\"><span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul id=\"login-dp\" class=\"dropdown-menu\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-12\">\r\n");
      out.write("                                        <form  name=\"ValidarUsuario\" id=\"ValidarUsuario\" action=\"ValidarUsuario\" method=\"POST\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"sr-only\" for=\"exampleInputEmail2\">Usuario</label>\r\n");
      out.write("                                                <input type=\"text\" placeholder=\"Username\" name=\"usuario\" id=\"usuario\" value=\"\" class=\"form-control\" required >\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\r\n");
      out.write("                                                <input type=\"password\" placeholder=\"Password\" name=\"clave\" id=\"clave\" value=\"\" class=\"form-control\" required>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bottom text-center\">\r\n");
      out.write("                                        <div ></div>\r\n");
      out.write("                                        <a id=\"mensajeingreso\"><b></b></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Bievenido-->\n");
      out.write("<section class=\"bievenido\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      \n");
      out.write("        <div class=\"row\">\n");
      out.write("             \n");
      out.write("            <div class=\"col-lg-12 text-center\">\n");
      out.write("               \n");
      out.write("                <h2 class=\"section-heading\">Bievenido</h2>\n");
      out.write("                <h3 class=\"section-heading text-left\"></h3>\n");
      out.write("                <p class=\"text-muted\" style=\" text-align: justify\">\n");
      out.write("                    Queremos darle la bienvenida a nuestra web e invitarle a conocer la Clinica y \n");
      out.write("                    descubrir los servicios odontológicos integrales que brindamos, cuidando al máximo \n");
      out.write("                    su salud con profesionalismo, calidad, garantía y brindando las mejores facilidades de pago.\n");
      out.write("                    No defraudamos a nuestros pacientes, les escuchamos, entendemos y realizamos el \n");
      out.write("                    tratamiento más adecuado para cada uno, nuestro trabajo no acaba hasta que el paciente \n");
      out.write("                    esté satisfecho, logrando excelentes resultados.\n");
      out.write("                    Sonrisas y Detalles su Clinica Dental de Confianza.\n");
      out.write("\n");
      out.write("\n");
      out.write("                </p\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("\r\n");
      out.write("        ");
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
      out.write("                <h3 class=\"section-heading\" >Mision</h3>\n");
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
      out.write("                <h3 class=\"section-heading\" >Vision</h3>\n");
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
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"servicios\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-center\"> \n");
      out.write("                <h2 class=\"section-heading\">Servicios</h2>\n");
      out.write("                <p class=\"section-subheading text-muted\">\n");
      out.write("                    Contamos con todas las especialidades de la odontología y los servicios de apoyo radiográficos.\n");
      out.write("                    Preocupados por la salud y atención de toda la familia tenemos un espacio preparado y adecuado con profesionales expertos.\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <span class=\"fa-stack fa-4x\">\n");
      out.write("                    <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                    <i class=\"fa fa-shopping-cart fa-stack-1x fa-inverse\"></i>\n");
      out.write("                </span>\n");
      out.write("                <h4 class=\"service-heading\">Plan Básico de Salud:</h4>\n");
      out.write("                <p class=\"text-muted\" style=\" text-align: justify\">\n");
      out.write("                    Estamos afiliados con las principales ARS del país.\n");
      out.write("                    Cobertura 80% en:</p>\n");
      out.write("                <ul class=\"section-subheading text-muted\" style=\"text-align: justify\">\n");
      out.write("                    <li>Diagnóstico</li>\n");
      out.write("                    <li>Radiografías</li>\n");
      out.write("                    <li>Preventivo</li>\n");
      out.write("                    <li>Periodoncia</li>\n");
      out.write("                    <li>Cirugía</li>\n");
      out.write("                    <li>Emergencia</li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"text-muted\" style=\" text-align: justify\">\n");
      out.write("                    Los afiliados de ARS obtienen cobertura adicional en todas las especialidades.\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("             <div class=\"col-md-4\">\n");
      out.write("                        <span class=\"fa-stack fa-4x\">\n");
      out.write("                            <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                            <i class=\"fa fa-laptop fa-stack-1x fa-inverse\"></i>\n");
      out.write("                        </span>\n");
      out.write("                        <h4 class=\"service-heading\">El Plan Empresarial:</h4>\n");
      out.write("                        <p class=\"text-muted\" style=\"text-align: justify\">Nuestros planes se adaptan a las necesidades.\n");
      out.write("                            Con nuestros planes el afiliado se siente confiado en el cuidado de su salud oral.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <span class=\"fa-stack fa-4x\">\n");
      out.write("                    <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                    <i class=\"fa fa-lock fa-stack-1x fa-inverse\"></i>\n");
      out.write("                </span>\n");
      out.write("                <h4 class=\"service-heading\">Ventajas en nuestros planes:</h4>\n");
      out.write("                <ul class=\"section-subheading text-muted\" style=\"text-align: justify\">\n");
      out.write("                    <li>Cobertura inmediata</li>\n");
      out.write("                    <li>Emergencia 24 Horas</li>\n");
      out.write("                    <li>Un servicio de cobertura nacional</li>\n");
      out.write("                    <li>Menos costo en la diferencia al afiliado</li>\n");
      out.write("                    <li>Amplia cobertura en los tratamientos</li>\n");
      out.write("                    <li>Excelente ubicación de nuestros centros, entre otras.</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"garantia\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-center\">\n");
      out.write("                <h2 class=\"section-heading\">Tratamientos Garantizados</h2>\n");
      out.write("                <h3 class=\"section-heading text-left\">Nuestros Tratamientos son Garantizados</h3>\n");
      out.write("                <p class=\"text-muted\" style=\" text-align: justify\">\n");
      out.write("                    Una vez finalizada la atención profesional en los Servicios Dentales de la \n");
      out.write("                    Clínica Dental SONRISAS FELIZ, su tratamiento está garantizado.\n");
      out.write(" Si nuestros pacientes adquieren el compromiso de una buena higiene oral, evitan el consumo \n");
      out.write(" de tabaco y acuden a las revisiones periódicas de control buco-dental indicadas por nuestros \n");
      out.write(" especialistas, el porcentaje de éxito de nuestros tratamientos llega a ser muy elevado, \n");
      out.write(" teniendo resultados muy predecibles. Es importante recalcar que los implantes y las prótesis \n");
      out.write(" dentales NO SON PARA TODA LA VIDA, al igual que cualquier otra prótesis médico-quirúrgica utilizada \n");
      out.write(" en nuestro cuerpo por las distintas especialidades médicas.\n");
      out.write(" La Clínica SONRISAS FELIZ apuesta firmemente por la calidad de sus servicios, comprometiéndose \n");
      out.write(" a brindar los siguientes periodos de garantía:</p>\n");
      out.write(" \n");
      out.write("                <ul class=\"text-muted\" style=\" text-align: justify\"> \n");
      out.write("                    <li>3 meses para la especialidad de Periodoncia y Cirugía.</li>\n");
      out.write("                    <li>6 meses para las prestaciones dentales de Operatoria y Especialidades.</li>\n");
      out.write("                    <li>12 meses para la especialidad de Prótesis e Implantología.</li>\n");
      out.write("                </ul>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--staff-->\n");
      out.write("<section class=\"staff\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-center\">\n");
      out.write("                <h2 class=\"section-heading\">Staff de Profecionales</h2>\n");
      out.write("                <p class=\"section-subheading text-muted\" style=\"text-align: justify\">\n");
      out.write("                    Tenemos a su disposición un equipo de profesionales en el área altamente calificados y \n");
      out.write("                    preparados para suplir cada una de sus necesidades odontológicas con protocolos de servicio \n");
      out.write("                    que le harán sentir más que complacidos, dentro de nuestro staff tenemos a los doctores/as:\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h4 class=\"service-heading\" style=\"text-align: justify\">Dr.: Federico Rondon:</h4>\n");
      out.write("                <ul style=\"text-align: justify\">\n");
      out.write("                    <li>Cirujana Dental</li>\n");
      out.write("                    <li>Rehabilitacion Integral</li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h4 class=\"service-heading\" style=\"text-align: justify\">Dra.: Susy Bernal:</h4>\n");
      out.write("                <ul style=\"text-align: justify\">\n");
      out.write("                    <li>Cirujano Maxilofacial</li>\n");
      out.write("                    <li>Expecialista en Protesis e Implantes</li>\n");
      out.write("                    <li>Ortodoncia</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h4 class=\"service-heading\" style=\"text-align: justify\">Dr.: Marcos Peralta</h4>\n");
      out.write("                <ul style=\"text-align: justify\">\n");
      out.write("                    <li>Patologia Bucal</li>\n");
      out.write("                    <li>Prótesis Bucal e Implantología</li>\n");
      out.write("                    <li>Prótesis Maxilofacial</li>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("</section>");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--contactos-->\n");
      out.write("<section class=\"contactos\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 text-center\">\n");
      out.write("                <h3 class=\"section-heading\" >Contactanos</h3>\n");
      out.write("                <p class=\"text-muted\" style=\" text-align: justify\">\n");
      out.write("                    Queremos seguir brindandoles el mejor \n");
      out.write("                    servicio como estamos acostumbrados a ofrecerles, puede contactarnos:\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-12 text-left\">\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                        <i class=\"fa fa-phone-square fa-stack-1x fa-inverse\"></i>\n");
      out.write("                    </span>\n");
      out.write("                    Tel: 809-344-9876 / Fax: 809-233-5657 y desde el nterior sin cargos 1-200-4576<br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12 text-left\">\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                        <i class=\"fa fa-home fa-stack-1x fa-inverse\"></i>\n");
      out.write("\n");
      out.write("                    </span>\n");
      out.write("                    Ave. Las Carreras Apart. 51-A Santiago Rep. Dom.<br>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-lg-12 text-left\">\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                        <i class=\"fa fa-envelope fa-stack-1x fa-inverse\"></i>\n");
      out.write("                        \n");
      out.write("                    </span>\n");
      out.write("                    Sonrisa@feliz.com.do<br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12 text-left\">                   \n");
      out.write("\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                        <i class=\"fa fa-instagram fa-stack-1x fa-inverse\"></i>\n");
      out.write("                        \n");
      out.write("                    </span>\n");
      out.write("                    @SorizaFelizDom<br>\n");
      out.write("                    </div>\n");
      out.write("               \n");
      out.write("                <div class=\"col-lg-12 text-left\">\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                        <i class=\"fa fa-twitter fa-stack-1x fa-inverse\"></i>\n");
      out.write("                    </span>\n");
      out.write("                    @SonrisaFeliz\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                   <div class=\"col-lg-12 text-left\">\n");
      out.write("                    <span class=\"fa-stack fa-lg\">\n");
      out.write("                        <i class=\"fa fa-circle fa-stack-2x text-primary\"></i>\n");
      out.write("                        <i class=\"fa fa-facebook fa-stack-1x fa-inverse\"></i>\n");
      out.write("                    </span>\n");
      out.write("                    @SonrisaFeliz\n");
      out.write("                   </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/animatescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("<script src=\"js/retina-1.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/index.js\"></script>");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"contactos\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\" id=\"footer\">\n");
      out.write("            <blockquote class=\"panel panel-primary blockquote-reverse\">\n");
      out.write("                <div id=\"copyright\">\n");
      out.write("                    <p class=\"fl_left\">\n");
      out.write("                        Copyright © 2016 - All Rigths Reserved       \n");
      out.write("                        <a target=\"_blank\" href=\"#\" title=\"Clinica Odontologica Sonrisa Feliz\" >\n");
      out.write("                                                  \n");
      out.write("                        </a>\n");
      out.write("                    </p>\n");
      out.write("                     Template by Tatiana Montilla & Carlos Cedeño  \n");
      out.write("                </div>\n");
      out.write("                </blockquote>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
