<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="sgab.model.dto.Atendente" %>

<%@include file="/core/header.jsp" %>

        <% Atendente atendente = (Atendente) request.getAttribute("Atendente"); %>

        <center>
            <h3>Alterar Atendente</h3>
            <form name="frmAltAtendentes" method="post">                
                <input type="hidden" name="table" value="Atendentes">
                <input type="hidden" name="acao" value="alterar">
                <table>
                    <tr>
                        <td>
                            Código:
                        </td>
                        <td>
                            <input type="text" name="uOrgId" value="<%=atendente.getId()%>" readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Nome:
                        </td>
                        <td>
                            <input type="text" name="nome" value="<%=atendente.getNome()%>">
                        </td>
                    </tr>
                    <tr>
                       <td colspan="2" aling="center">
                            <input type="button" value="Gravar" onclick="gravarAlteracao(document.frmAltAtendente)">
                            <input type="button" value="Excluir" onclick="excluir(<%=atendente.getId()%>, document.frmAltAtendente)">
                            <a href="/sgab/core/usuario/inserir.jsp">Inserir Atendente</a>    
                        </td>
                    </tr>
                </table>
            </form>
        </center> 
        <%@include file="/core/footer.jsp" %>