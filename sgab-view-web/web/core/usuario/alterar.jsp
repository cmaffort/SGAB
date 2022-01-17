<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="sgab.model.dto.Usuario" %>

<%@include file="/core/menu.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%  Usuario usuario = (Usuario) request.getAttribute("usuario"); %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <script type="text/javascript" language="JavaScript" src="/sgab/js/helper.js"></script>
        <title>SGAB</title>
    </head>
    <body>

        <center>
            <h3>Alterar Usuário</h3>
            <form name="frmAltUsuario" method="post">                
                <input type="hidden" name="table" value="Usuario">
                <input type="hidden" name="acao" value="alterar">
                <table>
                    <tr>
                        <td>
                            Código:
                        </td>
                        <td>
                            <input type="text" name="usuarioId" value="<%=usuario.getId()%>" readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Login:
                        </td>
                        <td>
                            <input type="text" name="login" value="<%=usuario.getLogin()%>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Nome:
                        </td>
                        <td>
                            <input type="text" name="nome" value="<%=usuario.getNome()%>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Email:
                        </td>
                        <td>
                            <input type="text" name="email" value="<%=usuario.getEmail()%>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Senha:
                        </td>
                        <td>
                            <input type="password" name="senha" value="<%=usuario.getSenha()%>">
                        </td>
                    </tr>
                    <tr>
                       <td colspan="2" aling="center">
                            <input type="button" value="Gravar" onclick="gravarAlteracao(document.frmAltUsuario)"> &nbsp;
                            <input type="reset" value="Redefinir">
                            <input type="button" value="Excluir" onclick="excluir(<%=usuario.getId()%>, document.frmAltUsuario)">    
                            <a href="/sgab/core/usuario/inserir.jsp">Inserir Usuario</a>    
                        </td>
                    </tr>
                </table>
            </form>
        </center> 
    
    </body>
</html>
