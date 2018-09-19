/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eber_
 */
public class formulario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String nom = request.getParameter("Nombre");
            String em = request.getParameter("Email");
            String con = request.getParameter("Contrasena");
            String car = request.getParameter("carrera");
            String nac = request.getParameter("fechanacimiento");
            
            if (nom == null && em == null && con == null && car == null && nac == null){
                
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet formulario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet formulario at " + request.getContextPath() + "</h1>");
            out.println("        <form action=formulario method='post'>");
out.println("          <div class='w3-row-padding' style='margin:0 -16px 8px -16px'>");
out.println("            <div class='w3-half'>");
out.println("              <input class='w3-input w3-border' type='text' placeholder='Nombre' required name='Nombre'>");
out.println("            </div>");
out.println("            <div class='w3-half'>");
out.println("              <input class='w3-input w3-border' type='email' placeholder='Email' required name='Email'>");
out.println("            </div>");
out.println("          <input class='w3-input w3-border' type='password' placeholder='Contraseña' required name='Contrasena'>");
out.println("<select name='carrera'>");
out.println("  <option value='lsti'>Lic Tecnologias de Inf</option>");
out.println("  <option value='lfisica'>Lic Fisica</option>");
out.println("  <option value='lmatematicas'>Lic Matematicas</option>");
out.println("  <option value='lmad'>Lic Multimedia</option>");
out.println("</select>");
out.println("<br>");
out.println("<INPUT TYPE='date' name='fechanacimiento'>");
out.println("<br>");
out.println("<button class='w3-button w3-black w3-section w3-right' type='submit'>ACEPTAR</button>");
out.println("<button class='w3-button w3-black w3-section w3-right' type='submit'>CANCELAR</button>");
out.println("<button class='w3-button w3-black w3-section w3-right' type='submit'>INFO</button>");
out.println("</form>");

            out.println("</body>");
            out.println("</html>");
            }
            else{
                
                out.println("El nombre es: " + nom);
                out.println("<br> Su correo es: " + em);
                out.println("<br> Su contraseña es: " + con);
                out.println("<br> Su carrera es: " + car);
                out.println("<br> Su fecha de nacimiento es: " + nac);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
