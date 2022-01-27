<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <%@include file="/core/header.jsp" %>
  <link rel="manifest" href="site.webmanifest">
  <link rel="apple-touch-icon" href="icon.png">


  <link rel="stylesheet" href="../../css/normalize.css">
  <link rel="stylesheet" href="../../css/modal.css">
  <link rel="stylesheet" href="../../css/styles.css">

  <main>
    <section id="nome-form">
      <h1>Gestão de Atendentes</h1>
    </section>
    <section>
      <div class="caixa-gestao">
        <h2>Operações com Atendentes</h2>
        <button class="button-gestao" onclick="abreModal('formCadastroAtendente')">Cadastrar</button>
        <a href="/sgab/main?acao=AtendenteListar"><button class="button-gestao">Listar</button></a></a>
      </div>
      <br>
    </section>

    <!-- Formulários Pop-up -->


    <!-- Form de cadastro -->
    <div class="form-popup" id="formCadastroAtendente">
      <div class="close-btn" onclick="fechaModal('formCadastroAtendente')">&times;</div>
      <form class="form-container" method="POST" name="GravarAtendente">
        <h2> Cadastrar</h2>
        <div>
          
          <h3>Cadastrar</h3>
          <input type="hidden" name="table" value="Atendente">
          <input type="hidden" name="acao" value="gravar">
            
          <label for="login">Informe o seu Login <span class="input-obrigatorio">*</span></label>
          <input type="text" id="login" name="login" placeholder="Login" required>
          <small>Digite um Login valido.</small>
          
          <button type="button" class="button-form" onclick="gravarAlteracao(document.GravarAtendente)">Enviar</button>
        </div>
      </form>
    </div>

    <!-- Form de editar atendente -->
    <div class="form-popup" id="formEdicaoAtendente">
      <div class="close-btn" onclick="fechaModal('formEdicaoAtendente')">&times;</div>
      <form class="form-container" method="POST" name="EdicaoAtendente">
        <h2> Editar</h2>
        <div>
          <input type="hidden" name="table" value="Atendente">
          <input type="hidden" name="acao" value="alterar">
          <label>Nome de usuario: <input type="email" placeholder="Nome ou Email do(a) atendente" name="login" required></label>
          <button type="button" class="button-form" onclick="gravarAlteracao(document.EdicaoAtendente)">Enviar</button>
        </div>
      </form>
    </div>

    <div class="form-popup" id="formListarAtendente">
      <div class="close-btn" onclick="fechaModal('formListarAtendente')">&times;</div>
      <form class="form-container" method="POST" name="loginAtendente">
        <div>
        <input type="hidden" name="table" value="Atendente">
        <input type="hidden" name="acao" value="pesquisarPorLogin">
        
        <button type="button" class="button-form" onclick="pesquisar(document.loginAtendente)">Enviar</button>
        </div>
      </form>
    </div>

    <div id="mask" onclick="fechaModalAll()"></div>

  <%@include file="/core/footer.jsp" %>
  <!-- JS -->
  <script src="../../js/abreModal.js"></script>
  <link rel="stylesheet" href="../../css/normalize.css">
  <link rel="stylesheet" href="../../css/modal.css">
  <link rel="stylesheet" href="../../css/styles.css">