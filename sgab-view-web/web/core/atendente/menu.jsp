<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="">
<html>
<head>
  <meta charset="utf-8">
  <title>SGAB | P�gina do Leitor</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta property="og:title" content="">
  <meta property="og:type" content="">
  <meta property="og:url" content="">
  <meta property="og:image" content="">

  <link rel="manifest" href="site.webmanifest">
  <link rel="apple-touch-icon" href="icon.png">


  <link rel="stylesheet" href="../../css/normalize.css">
  <link rel="stylesheet" href="../../css/modal.css">
  <link rel="stylesheet" href="../../css/styles.css">

  <meta name="theme-color" content="#fafafa">
</head>

<body>
  <header>
    <div id="pagina-inicial">
      <a href="" title="P�gina Inicial">SGAB</a>
    </div>
    <div id="logo-topo">
      <a href="https://www.cefetmg.br/" target="_blank" title="Centro Federal de Educa��o Tecnol�gica de Minas Gerais">
        <img src="../../images/logo_topo.png" alt="Centro Federal de Educa��o Tecnol�gica de Minas Gerais">
      </a>
    </div>
  </header>

  <main>
    <section id="nome-form">
      <h1>Gestão de Atendentes</h1>
    </section>
    <section>
      <div class="caixa-gestao">
        <h2>Operações com Atendentes</h2>
        <button class="button-gestao" onclick="abreModal('formCadastroLeitor')">Cadastrar</button>
        <button class="button-gestao" onclick="abreModal('formEdicaoLeitor')">Editar</button>
        <button class="button-gestao" onclick="abreModal('formDesativarLeitor')">Desativar</button>
        <button class="button-gestao" onclick="abreModal('formListarLeitor')">Listar</button>
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
          <label>Nome do atendente: <input type="text" placeholder="Nome do atendente:" name="login" required></label>
          <label>CPF do atendente: <input type="text" placeholder="CPF do(a) atendente:" name="cpf" required></label>
          <label>Email do atendente: <input type="email" placeholder="Email do(a) atendente:" name="email" required></label>
          <label>Senha do atendente: <input type="password" placeholder="Senha do(a) atendente:" name="senha" required></label>
          <label>Confirmação: <input type="password" placeholder="Senha do(a) Gestor" name="adminpsw" required></label>
          <button type="button" class="button-form" onclick="gravarAlteracao(document.GravarLeitor)">Enviar</button>
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
          <label>ID do atendente: <input type="email" placeholder="Nome ou Email do(a) atendente" name="login" required></label>
          <button type="button" class="button-form" onclick="gravarAlteracao(document.EdicaoAtendente)">Enviar</button>
        </div>
      </form>
    </div>

    <!-- Caso consiga encontrar o id do atendente, abrir esse pop up -->
    <div class="form-popup" id="formEdicaoConfirmada">
      <div class="close-btn" onclick="fechaFormEdicaoConfirmada()">&times;</div>
      <form class="form-container">
        <h2> Edição de Atendente</h2>
        <div>
          <label>Nome: <input type="text" placeholder="Nome do Atendente" name="nome"></label>
          <label>ID: <input type="number" placeholder="Identificação do Atendente" name="ID"></label>
          <label>CPF: <input type="number" placeholder="CPF do Atendente" name="cpf"></label>
          <label>Email: <input type="email" placeholder="Email do Atendente" name="email"></label>
          <label>Telefone: <input type="tel" name="tel"></label>
          <label>Senha: <input type="password" placeholder="Senha do Atendente" name="psw"></label>
          <button type="submit" class="button-form">Enviar</button>
        </div>
      </form>
    </div>

    <!-- Form de desativar atendente -->
    <div class="form-popup" id="formDesativacao">
      <div class="close-btn" onclick="fechaFormDesativar()">&times;</div>
      <form class="form-container">
        <h2> Desativar Atendente</h2>
        <div>
          <label>ID: <input type="number" placeholder="Identificação do Atendente" name="ID" required></label>
          <label>CPF: <input type="number" placeholder="CPF do Atendente" name="cpf"></label>
          <label>Confirmação: <input type="password" placeholder="Senha do Gestor" name="gespsw" required></label>
          <button type="submit" class="button-form">Enviar</button>
        </div>
      </form>
    </div>

    <!-- Form de listar atendente -->
    <div class="form-popup" id="formListarAtendente">
      <div class="close-btn" onclick="fechaModal('formListarAtendente')">&times;</div>
      <form class="form-container" method="POST" name="login">

        <input type="hidden" name="table" value="Atendente">
        <input type="hidden" name="acao" value="pesquisarPorLogin">
        
        <label>Nome do atendente: <input type="text" placeholder="Nome de usu�rio do(a) atendente:" name="login" required></label>
        <button type="button" class="button-form" onclick="gravarAlteracao(document.login)">Enviar</button>
      </form>
    </div>

    <div id="mask" onclick="fechaModalAll()"></div>
  </main>

  <!-- JS -->
  <script src="../../js/abreModal.js"></script>
  <script src="../../js/helper.js"></script>
</body>
<footer>
  <p>SGAB - Sistema de Gest�o de Acervo Bibliogr�fico</p>
</footer>
</html>
