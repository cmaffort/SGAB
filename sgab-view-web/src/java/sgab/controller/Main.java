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
            case "ObraListar":
                jsp = ObraController.listar(request);
                break;
            case "ObraPesquisar":
                jsp = ObraController.pesquisar(request);
                break;
            case "ObraGravarInsercao":
                jsp = ObraController.gravarInsercao(request);
                break;
            case "ObraAlterar":
                jsp = ObraController.alterar(request);
                break;
            case "ObraGravarAlteracao":
                jsp = ObraController.gravarAlteracao(request);
                break;
            case "ObraExcluir":
                jsp = ObraController.excluir(request);
                break;                               
            case "PessoaPesquisar":
                jsp = PessoaController.pesquisarLogin(request);
                break;
            case "PessoaListar":
                jsp = PessoaController.listar(request);
                break;
            case "PessoaAlterar":
                jsp = PessoaController.alterar(request);
                break;
            case "PessoaGravarAlteracao":
                jsp = PessoaController.gravarAlteracao(request);
                break;
            case "PessoaGravarInsercao":
                jsp = PessoaController.gravarInsercao(request);
                break;
            case "PessoaExcluir":
                jsp = PessoaController.excluir(request);
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
