/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eabiii
 */
@WebServlet(urlPatterns = {"/OutputServlet"})
public class OutputServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    
    String username =request.getParameter("user");
    String password =request.getParameter("pass");
    int pin = Integer.parseInt(request.getParameter("pin"));
    
    PrintWriter out=response.getWriter();
    response.setContentType("text/html; charset=UTF-8");
    
    out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OutputServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Username is "+username+"</p>");
            out.println("<p>Password is "+password+"</p>");
            out.println("<p>PIN is "+pin+"</p>");
            out.println("</body>");
            out.println("</html>");
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
