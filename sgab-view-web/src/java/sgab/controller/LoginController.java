package sgab.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import sgab.model.dto.Usuario;
import sgab.model.service.GestaoUsuario;

public class LoginController {

    public static String logar(HttpServletRequest request) {

        String jsp = "";

        try {
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");

            GestaoUsuario manterUsuario = new GestaoUsuario();
            Usuario usuario = manterUsuario.pesquisarUsuario(login, senha);

            if (usuario == null) {
                String erro = "Usuario nao encontrado!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            } else {
                request.getSession().setAttribute("usuarioId", usuario.getId());
                jsp = "/core/menu.jsp";
            }

        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

    public static void validarSessao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long usuarioId = (Long) request.getSession().getAttribute("usuarioId");
        if (usuarioId == null) {
            //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
    }
}
