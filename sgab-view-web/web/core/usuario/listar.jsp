<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="sgab.model.dto.Usuario" %>
<%@page import="java.util.List" %>

<%@include file="/core/menu.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>SGAB</title>
        <script type="text/javascript" language="JavaScript" src="/sgab/js/helper.js"></script>
    </head>
    <body>
        <center>
            <h3>Lista de Usuarios</h3>
            <a href="/sgab/core/usuario/inserir.jsp">Novo Usuario</a>
            <form name="frmUsuario" method="post">
                <input type="hidden" name="table" value="Usuario">
                <input type="hidden" name="usuarioId" value="">
                
                <table>
                    <tr>
                        <td>
                            Código
                        </td>
                        <td>
                            Login
                        </td>
                        <td>
                            Nome Completo
                        </td>
                        <td>
                            Email
                        </td>
                        <td>
                            Senha
                        </td>
                        <td>
                            &nbsp; &nbsp;
                        </td>
                    </tr>
                    <%
                        List<Usuario> listUsuario = (List<Usuario>) request.getAttribute("listUsuario");
                        for (Usuario usuario: listUsuario) {
                    %>
                        <tr>
                            <td>
                                <a href="/sgab/main?acao=UsuarioAlterar&usuarioId=<%=usuario.getId()%>"><%=usuario.getId()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=UsuarioAlterar&usuarioId=<%=usuario.getId()%>"><%=usuario.getLogin()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=UsuarioAlterar&usuarioId=<%=usuario.getId()%>"><%=usuario.getNome()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=UsuarioAlterar&usuarioId=<%=usuario.getId()%>"><%=usuario.getEmail()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=UsuarioAlterar&usuarioId=<%=usuario.getId()%>"><%=usuario.getSenha()%></a>
                            </td>
                            <td>
                                <input type="button" value="Excluir" onclick="excluir(<%=usuario.getId()%>,document.frmUsuario)">
                            </td>
                        </tr>
                    <%  } %>
                </table>
            </form>
        </center> 
    </body>
</html>
