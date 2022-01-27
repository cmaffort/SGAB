<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="sgab.model.dto.Atendente" %>
<%@page import="java.util.List" %>

<%@include file="/core/header.jsp" %>
       
        <center>
            <h3>Lista de Atendentes</h3>
            <a href="/sgab/core/atendente/menu.jsp">Novo Atendente</a>
            <form name="listarAtendente" method="post">
                <input type="hidden" name="table" value="Pessoa">
                <input type="hidden" name="pessoaId" value="">

                <table id="pessoa">
                    <tr>
                        <th>
                            Código
                        </th>
                        <th>
                            Login
                        </th>
                        <th>
                            CPF
                        </th>
                        <th>
                            Nome Completo
                        </th>
                        <th>
                            Email
                        </th>
                        <th>
                            &nbsp; &nbsp;
                        </th>
                    </tr>
                    <%
                        List<Atendente> listAtendentes = (List<Atendente>) request.getAttribute("listAtendentes");
                        for (Atendente atendente: listAtendentes) {
                    %>
                        <tr>
                            <td>
                                <a href="/sgab/main?acao=AtendenteAlterar&atendenteId=<%=atendente.getId()%>"><%=atendente.getId()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=AtendenteAlterar&atendenteId=<%=atendente.getId()%>"><%=atendente.getLogin()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=AtendenteAlterar&atendenteId=<%=atendente.getId()%>"><%=atendente.getCpf()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=AtendenteAlterar&atendenteId=<%=atendente.getId()%>"><%=atendente.getNome()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=AtendenteAlterar&atendenteId=<%=atendente.getId()%>"><%=atendente.getEmail()%></a>
                            </td>
                            <td>
                                <input type="button" value="Excluir" onclick="excluir(<%=atendente.getId()%>,document.listarAtendente)">
                            </td>
                        </tr>
                    <%  } %>
                </table>
            </form>
        </center>
        <script type="text/javascript" language="JavaScript" src="/sgab/js/validacao.js"></script>
        <%@include file="/core/footer.jsp" %>    