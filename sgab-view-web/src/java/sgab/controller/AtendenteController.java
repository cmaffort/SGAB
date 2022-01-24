package sgab.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;
import sgab.model.dto.Atendente;
import sgab.model.exception.PersistenciaException;
import sgab.model.service.GestaoAtendente;
import sgab.model.dao.AtendenteDAO;

public class AtendenteController {
    public static String listar(HttpServletRequest request) {
        String jsp = "";
        try {
            GestaoAtendente gestaoAtendente = new GestaoAtendente();
            List<Atendente> listAtendentes = gestaoAtendente.listarAtivos();
            if (listAtendentes != null) {
                request.setAttribute("listAtendentes", listAtendentes);
                jsp = "/core/atendente/listar.jsp";
            } else {
                String erro = "Nao existe registro!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
    
    
   /* 
    public static String excluir(HttpServletRequest request) {
        String jsp = "";
        try {
            Long atendenteId = Long.parseLong(request.getParameter("atendenteId"));
            GestaoAtendente gestaoAtendente = new GestaoAtendente();
            Atendente atendente = gestaoAtendente.pesquisarId(atendenteId);
            try {
                gestaoAtendente.removerAtendente(atendente);
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
    }*/
}