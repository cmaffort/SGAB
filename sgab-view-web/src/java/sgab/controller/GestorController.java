package sgab.controller.gestor;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import sgab.model.dto.Pessoa;
import sgab.model.dto.util.PessoaTipo;
import sgab.model.exception.PersistenciaException;
import sgab.model.service.GestaoGestor;


public class GestorController{

    public static String pesquisarAtendenteLogin(HttpServletRequest request){
        String jsp = "";
        try {
            String login = request.getParameter("login");
            GestaoGestor gestaoGestor = new GestaoGestor();
            List<Pessoa> listPessoa = null;
            listPessoa.add(gestaoGestor.pesquisarAtedentesPorLogin(login)); 
            if (listPessoa != null) {
                request.setAttribute("listPessoas", listPessoa);
                jsp = "/core/gestor/listar.jsp";
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

    public static String pesquisarBibliotecarioLogin(HttpServletRequest request){
        String jsp = "";
        try {
            String login = request.getParameter("login");
            GestaoGestor gestaoGestor = new GestaoGestor();
            List<Pessoa> listPessoa = null;
            listPessoa.add(gestaoGestor.pesquisarBibliotecariosPorLogin(login)); 
            if (listPessoa != null) {
                request.setAttribute("listPessoas", listPessoa);
                jsp = "/core/gestor/listar.jsp";
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

    public static String listarAtendentes(HttpServletRequest request) {
        String jsp = "";
        try {
            GestaoGestor gestaoGestor = new GestaoGestor();
            List<Pessoa> listPessoas = gestaoGestor.pesquisarAtendentesAtivos();
            if (listPessoas != null) {
                request.setAttribute("listPessoas", listPessoas);
                jsp = "/core/gestor/listar.jsp";
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

    public static String listarBibliotecarios(HttpServletRequest request) {
        String jsp = "";
        try {
            GestaoGestor gestaoGestor = new GestaoGestor();
            List<Pessoa> listPessoas = gestaoGestor.pesquisarBibliotecariosAtivos();
            if (listPessoas != null) {
                request.setAttribute("listPessoas", listPessoas);
                jsp = "/core/gestor/listar.jsp";
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

    public static String alterarBibliotecario(HttpServletRequest request) {
        String jsp = "";
        try {
            String login = request.getParameter("login");
            GestaoGestor gestaoGestor = new GestaoGestor();
            Pessoa pessoa = gestaoGestor.pesquisarBibliotecarioPorLogin(login);
            if (pessoa != null) {
                request.setAttribute("pessoa", pessoa);
                jsp = "/core/gestor/alterar.jsp";
            } else {
                String erro = "Ocorreu erro ao Alterar Pessoa!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

    public static String alterarAtendente(HttpServletRequest request) {
        String jsp = "";
        try {
            String login = request.getParameter("login");
            GestaoGestor gestaoGestor = new GestaoGestor();
            Pessoa pessoa = gestaoGestor.pesquisarAtendentesPorLogin(login);
            if (pessoa != null) {
                request.setAttribute("pessoa", pessoa);
                jsp = "/core/gestor/alterar.jsp";
            } else {
                String erro = "Ocorreu erro ao Alterar Pessoa!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

    public static String gravarAlteracaoAtendente(HttpServletRequest request) {
        String jsp = "";
        try {
            Long pessoaId = Long.parseLong(request.getParameter("pessoaId"));
            String login = request.getParameter("login");
            Long cpf = Long.parseLong(request.getParameter("cpf"));
            String nomeCompleto = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            Pessoa pessoa = new Pessoa(login, cpf);
            pessoa.setId(pessoaId);
            pessoa.setNome(nomeCompleto);
            pessoa.setEmail(email);
            pessoa.setSenha(senha);
            pessoa.setHabilitado(true);
            pessoa.setTipo(PessoaTipo.ATENDENTE);
            
            GestaoGestor gestaoGestor = new GestaoGestor();
            try {
                gestaoGestor.alterar(pessoa);
                jsp = listar(request);
            } 
            catch(PersistenciaException ex) {
                String erro = "Nao foi possivel alterar esse registro!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }


    public static String gravarAlteracaoBibliotecario(HttpServletRequest request) {
        String jsp = "";
        try {
            Long pessoaId = Long.parseLong(request.getParameter("pessoaId"));
            String login = request.getParameter("login");
            Long cpf = Long.parseLong(request.getParameter("cpf"));
            String nomeCompleto = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            Pessoa pessoa = new Pessoa(login, cpf);
            pessoa.setId(pessoaId);
            pessoa.setNome(nomeCompleto);
            pessoa.setEmail(email);
            pessoa.setSenha(senha);
            pessoa.setHabilitado(true);
            pessoa.setTipo(PessoaTipo.BIBLIOTECARIO);
            
            GestaoGestor gestaoGestor = new GestaoGestor();
            try {
                gestaoGestor.alterar(pessoa);
                jsp = listar(request);
            } 
            catch(PersistenciaException ex) {
                String erro = "Nao foi possivel alterar esse registro!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

    public static String gravarInsercaoBiblioteca(HttpServletRequest request) {
        String jsp = "";
        try {
            String login = request.getParameter("login");
            Long cpf = Long.parseLong(request.getParameter("cpf"));
            String nomeCompleto = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");

            Pessoa pessoa = new Pessoa(cpf, login, nomeCompleto, email, senha);
            pessoa.setTipo(PessoaTipo.BIBLIOTECARIO);

            GestaoGestor gestaoGestor = new GestaoGestor();
            Long pessoaId = gestaoGestor.cadastrar(pessoa);

            if (pessoaId != null) {
                jsp = listar(request);
            } else {
                String erro = "Nao foi possível gravar esse registro!";
                request.setAttribute("erro", erro);
                jsp = "/core/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }

    public static String gravarInsercaoAtendente(HttpServletRequest request) {
        String jsp = "";
        try {
            String login = request.getParameter("login");
            Long cpf = Long.parseLong(request.getParameter("cpf"));
            String nomeCompleto = request.getParameter("nome");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");

            Pessoa pessoa = new Pessoa(cpf, login, nomeCompleto, email, senha);
            pessoa.setTipo(PessoaTipo.ATENDENTE);

            GestaoGestor gestaoGestor = new GestaoGestor();
            Long pessoaId = gestaoGestor.cadastrar(pessoa);

            if (pessoaId != null) {
                jsp = listar(request);
            } else {
                String erro = "Nao foi possível gravar esse registro!";
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
