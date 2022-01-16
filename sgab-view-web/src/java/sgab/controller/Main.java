package sgab.controller;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Main", urlPatterns = {"/main"})
public class Main extends HttpServlet {
    private String jsp = "";
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        String acao = request.getParameter("acao");
        
        switch (acao) {
            case "Logar":
                jsp = LoginController.logar(request);
                break;
            case "UsuarioListar":
                jsp = UsuarioController.listar(request);
                break;
            case "UsuarioAlterar":
                jsp = UsuarioController.alterar(request);
                break;
            case "UsuarioGravarAlteracao":
                jsp = UsuarioController.gravarAlteracao(request);
                break;
            case "UsuarioGravarInsercao":
                jsp = UsuarioController.gravarInsercao(request);
                break;
            case "UsuarioExcluir":
                jsp = UsuarioController.excluir(request);
                break;
            case "BibliotecaGravarAlteracao":
                jsp = "gerenciaServlet";
                break;
            case "BibliotecaGravarInsercao":
                jsp = "cadstroServlet";
                break;
        }

        //Redirecionando pagina
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
    }    
}
