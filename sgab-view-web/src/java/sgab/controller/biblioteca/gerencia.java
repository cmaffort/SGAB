package sgab.controller.biblioteca;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sgab.model.dto.Biblioteca;
import sgab.model.service.GestaoBiblioteca;

@WebServlet(urlPatterns = {"/gerenciaBiblioteca"})
public class gerenciaServlet extends HttpServlet {

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
            
            String value = request.getParameter("inputsGerenciar");
            
            GestaoBiblioteca gestao = new GestaoBiblioteca();
            Biblioteca biblioteca;
            String nome = request.getParameter("Biblioteca");
            
            switch(value){
                case "1":
                    Long pesquisarId = Long.parseLong(request.getParameter("dado"));
                    biblioteca = gestao.pesquisarId(pesquisarId);
                    request.setAttribute("nome", biblioteca.getNome());
                    request.setAttribute("id", biblioteca.getId());
                    request.setAttribute("unidadeOrg", biblioteca.getUnidadeOrg());
                    String path = "sgab/core/biblioteca/pesquisado.jsp";
                    RequestDispatcher rd = request.getRequestDispatcher(path);
                    rd.forward(request, response);
                    break;
                case "2":
                    String pesquisarNome = request.getParameter("dado");
                    biblioteca = gestao.pesquisarNome(pesquisarNome);
                    request.setAttribute("nome", biblioteca.getNome());
                    request.setAttribute("id", biblioteca.getId());
                    request.setAttribute("unidadeOrg", biblioteca.getUnidadeOrg());
                    String path2 = "sgab/core/biblioteca/pesquisado.jsp";
                    RequestDispatcher rd2 = request.getRequestDispatcher(path2);
                    rd2.forward(request, response);
                    break;
                case "3":
                    Long alterarIDInput = Long.parseLong(request.getParameter("dado"));
                    gestao.alterarId(nome,alterarIDInput);
                    String path3 = "sgab/core/biblioteca/pesquisado.jsp";
                    RequestDispatcher rd3 = request.getRequestDispatcher(path3);
                    rd3.forward(request, response);
                    break;
                case "4":
                    String alterarNomeInput = request.getParameter("dado");
                    gestao.alterarNome(nome,alterarNomeInput);
                    String path4 = "sgab/core/biblioteca/pesquisado.jsp";
                    RequestDispatcher rd4 = request.getRequestDispatcher(path4);
                    rd4.forward(request, response);
                    break;
                case "5":
                    String alterarUnidadeOrgInput = request.getParameter("dado");
                    gestao.alterarUnidadeOrganizacional(nome,alterarUnidadeOrgInput);
                    String path5 = "sgab/core/biblioteca/pesquisado.jsp";
                    RequestDispatcher rd5 = request.getRequestDispatcher(path5);
                    rd5.forward(request, response);
                    break;
                    
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