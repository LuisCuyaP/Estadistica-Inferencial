/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author UPT
 */
@WebServlet(name = "Procesar", urlPatterns = {"/Procesar"})
public class Procesar extends HttpServlet {

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
         String ape=null;
         double monto=0;
         String fecha=null;
         
           try {
               HttpSession s=request.getSession();
                ape=request.getParameter("txtape");      
                monto=Double.parseDouble(request.getParameter("txtmon"));      
                fecha=request.getParameter("txtfecha");      
                //proceso
                double incremento=monto*1.20;
                //guardar datos en una variable de sesion
                s.setAttribute("sape", ape);
                s.setAttribute("smonto", monto);
                s.setAttribute("sfecha", fecha);
                //salida
                out.println("<font color='red'>");
                out.println("Apellidos : "+ape+"<br>");
                out.println("Monto : "+monto+"<br>");
                out.println("Fecha : "+fecha+"<br>");
                out.println("</font>");
                out.println("<a href='./view/datos.jsp'>");
                out.println("Ir a datos");
                out.println("</a>");
           } catch(Exception ex){
                out.println("<font color='red'>");
                out.println("Error : "+ex.getMessage()+"<br>");
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
