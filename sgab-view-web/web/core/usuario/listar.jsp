<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="sgab.model.dto.Usuario" %>
<%@page import="java.util.List" %>

<%@include file="/core/header.jsp" %>

        <center>
            <h3>Lista de Usuários</h3>
            <a href="/sgab/core/usuario/inserir.jsp">Novo Usuario</a>
            <form name="frmUsuario" method="post">
                <input type="hidden" name="table" value="Usuario">
                <input type="hidden" name="usuarioId" value="">
                
                <table id="usuario">
                    <tr>
                        <th>
                            Código
                        </th>
                        <th>
                            Login
                        </th>
                        <th>
                            Nome Completo
                        </th>
                        <th>
                            Email
                        </th>
                        <th>
                            Senha
                        </th>
                        <th>
                            &nbsp; &nbsp;
                        </th>
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
        <%@include file="/core/footer.jsp" %>