package controller;

import model.dto.Assunto;
import model.service.GestaoAssunto;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "cadastrarController", urlPatterns = {"/cadastrarController"})
public class cadastrarController extends HttpServlet {
    
    private Assunto assunto;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            //assunto = new Assunto();
            
            GestaoAssunto service = new GestaoAssunto();
          
            String tagAssunto = request.getParameter("assunto"));
            
            service.adicionarAssunto(tagAssunto);

            request.setAttribute("tagAssunto", tagAssunto);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/view/resultadoCadastrar.jsp"); // verificar caminho do arquivo (resultadoCadastrar.jsp)
            dispatcher.forward(request, response);
        }

        /*
        private Assunto cadastrar(String tagAssunto) { // Pode sofrer alteração dependendo do service

            GestaoAssunto service = new GestaoAssunto();

            service.adicionarAssunto(tagAssunto); // verificar se retorna alguma coisa
        }
        */
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
