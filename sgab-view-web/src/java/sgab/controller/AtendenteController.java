package sgab.controller;

import jakarta.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;
import sgab.model.dto.Atendente;
import sgab.model.exception.PersistenciaException;
import sgab.model.service.GestaoAtendente;
import sgab.model.dao.AtendenteDAO;
import sgab.model.dto.Pessoa;
import sgab.model.dto.util.PessoaTipo;
import sgab.model.dto.util.PessoaHelper;
import sgab.model.service.GestaoPessoasService;

public class AtendenteController {
    public static String listar(HttpServletRequest request) {
        String jsp = "";
        try {
            String login = request.getParameter("login");
            GestaoAtendente gestaoAtendente = new GestaoAtendente();
            if(login != null || "".equals(login)){
                Pessoa pessoa = gestaoAtendente.pesquisarPorLogin(login);
                if(pessoa != null){
                    pessoa.setTipo(PessoaTipo.ATENDENTE);
                    jsp = "/core/atendente/listar.jsp";
                }else{
                    String erro = "Nenhuma pessoa encontrada com o login informado";
                    request.setAttribute("erro", erro);
                    jsp = "/core/erro.jsp";
                }
            }else{
                String erro = "Login invalido!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "/core/erro.jsp";
        }
        return jsp;
    }
    
    public static String excluir(HttpServletRequest request) {
        String jsp = "";
        try {
            Long atendenteId = Long.parseLong(request.getParameter("atendenteId"));
            GestaoAtendente gestaoAtendente = new GestaoAtendente();
            Atendente atendente = gestaoAtendente.pesquisarId(atendenteId);
            try {
                gestaoAtendente.removerAtendente(atendenteId);
                jsp = AtendenteController.listar(request);
            }
            catch(PersistenciaException ex) {
                String erro = "Ocorreu erro ao Excluir o Atendente!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

    public static String alterar(HttpServletRequest request) {
        String jsp = "";
        try {
            Long atendenteId = Long.parseLong(request.getParameter("atendenteId"));
            GestaoAtendente manterAtendente = new GestaoAtendente();
            Atendente atendente = manterAtendente.pesquisarId(atendenteId);
            if (atendente != null) {
                request.setAttribute("atendente", atendente);
                jsp = "/core/atendente/alterar.jsp";
            } else {
                String erro = "Ocorreu erro ao Alterar o Atendente!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
    public static String gravarInsercao(HttpServletRequest request) {
        String jsp = "";
        try {
            String login = request.getParameter("login");
            GestaoPessoasService gestaoPessoasService = new GestaoPessoasService();
            
            if(login != null || "".equals(login)){
                Pessoa pessoa = gestaoPessoasService.pesquisarPorLogin(login);
                if(pessoa != null){
                    pessoa.setTipo(PessoaTipo.ATENDENTE);
                    jsp = "/core/autores/certo.jsp";
                }else{
                    String erro = "Nenhuma pessoa encontrada com o login informado";
                    request.setAttribute("erro", erro);
                    jsp = "/core/erro.jsp";
                }
            }else{
                String erro = "Login invalido!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
}