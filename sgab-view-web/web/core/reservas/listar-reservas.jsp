<%@page contentType="text/html" pageEncoding="UTF-8"%>

 
<%@page import="sgab.model.dto.Exemplar" %> 
<%@page import="sgab.model.dto.Autor" %>
<%@page import="sgab.model.dto.Reserva" %>
<%@page import="java.util.List" %>


<%@include file="/core/header.jsp" %>
<style>
        .hpesquisa{
            flex: 0.5;
        }
        .pesquisa{
            cursor: pointer;
            flex: 0.5;
        }
    </style> 
      <center>
          <h3>Reservas - Acervo de Exemplares</h3>
          <div class="acoes">
              <span></span>
              <form class="pesquisa-container" name="frmPesquisa" method="post">
                  <input type="hidden" value="ExemplarPesquisar" name="acao">
                  <select name="tipo">
                      <option value="null" selected>[Pesquisar por]</option>
                      <option value="titulo">Título</option>
                      <option value="leitor">Login do Leitor</option>
                  </select>
                  <input type="text" name="nome" placeholder="Escolha o tipo.">
                  <input type="button" class="button" onclick="validarPesquisaReservas(document.frmPesquisa)" value="Pesquisar">
              </form>
          </div>
          <form name="frmReserva" method="post">
                <input type="hidden" name="table" value="Reserva">
                <input type="hidden" name="reservaId" value="">
                <table style="width: 100%;">
                    <tr>
                      <th>LEITOR</th>  
                      <th>EXEMPLAR</th>
                      <th>DATA</th>
                    </tr>
                    <% 
                    List<Reserva> lista = (List<Reserva>) request.getAttribute("listReservas");
                    for(Reserva reserva : lista){
                    %>
                    
                    <tr>
                      <td><%= reserva.getId()%></td>
                      <td><%= reserva.getPessoa().getNome()%></td>
                      <td><%= reserva.getExemplar().getObra().getTitulo()%></td>
                      <td><%= reserva.getHorario()%></td>
                      <td><input type="button" style="
                                display: block; 
                                margin-left: auto;
                                margin-right: auto; 
                                padding: 4px 4px; 
                                height: 26px; 
                                border-color: #aaaaaa; 
                                background-color: #aaaaaa;
                                color: black;
                                width: 100%;
                                border-radius: 0;
                            " class="button" value="Finalizar" onclick="finalizar(<%= reserva.getId()%>, document.frmPesquisa)"></td>
                    </tr> 
                    <% } %> 
        </table>
        </form>
        
    </center>
        
    <script>
        function finalizar(id, frm){
            frm.reservaId.value = id;
            frm.action = "/sgab/main?acao=FinalizarReserva";
            frm.submit();
        }
    </script>    
    <%@include file="/core/footer.jsp" %>