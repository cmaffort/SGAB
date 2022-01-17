package sgab.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sgab.model.dto.Autor;
import sgab.model.service.GestaoAutor;


@WebServlet(urlPatterns = {"/PesquisarAutor"})
public class PesquisarAutorServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            String nome = request.getParameter("nomeAutor");
            Long id = Long.parseLong(request.getParameter("idAutor"));

            GestaoAutor gestaoAutor = new GestaoAutor();
            Autor autor;

            if(id!=null){
                autor = gestaoAutor.pesquisarId(id);
                request.setAttribute("nome", autor.getNome());
                request.setAttribute("id", autor.getId());
                response.sendRedirect("/sgab/core/autores/pesquisapronta.jsp");
            } 
            else if(nome!=null){
                autor = gestaoAutor.pesquisarNome(nome);
                request.setAttribute("nome", autor.getNome());
                request.setAttribute("id", autor.getId());
                response.sendRedirect("/sgab/core/autores/pesquisapronta.jsp");
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
        return "Pesquisa um autor no banco";
    }// </editor-fold>

}