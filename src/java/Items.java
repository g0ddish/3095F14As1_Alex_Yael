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
 *Login
 * @author Yael
 */
public class Items extends HttpServlet {

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
            Layout layout = new Layout(request);
            /* TODO output your page here. You may use following sample code. */
            out.println(layout.header("Index"));
            out.println(layout.navBar());
            out.println(layout.containerOpen());
            
            out.println("<br /><br />"+
                    "  <h3 id=\"list-group-custom-content\">Catalogue</h3>\n" +
                    "  <p>Welcome to SolutionBlender Shopping! Please select a category or browse all of our items.</p>\n" +
                        "  <table class=\"table table-striped\">\n" +
                        " <tr><td>Item #1</td><td>Yael</td><td>$39.99</td><td>Yael</td></tr>" +
                        "<tr><td>Item #2</td><td>sprikut</td><td>$139.99</td><td>Yael</td></tr>" +
                        " <tr><td>yael</td><td>sprikut</td><td>$39.99</td><td>Yael</td></tr>" +
                        "<tr><td>Yael</td><td>sprikut</td><td>$39.99</td><td>Yael</td></tr>" +
                        " <tr><td>yael</td><td>sprikut</td><td>$39.99</td><td>Yael</td></tr>" +
                        "<tr><td>Yael</td><td>sprikut</td><td>$39.99</td><td>Yael</td></tr>" +
                        "<tr><td>Yael</td><td>sprikut</td><td>sprikut</td><td>Yael</td></tr>" +
                        "<tr><td>Yael</td><td>sprikut</td><td>sprikut</td><td>Yael</td></tr>" +
                        "<tr><td>Yael</td><td>sprikut</td><td>sprikut</td><td>Yael</td></tr>" +
                        "</table>");
            
            
            out.println(layout.containerClose());
            out.println(layout.footer());
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