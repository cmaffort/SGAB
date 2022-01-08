<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>SGAB | Gestão de Unidades Organizacionais</title>
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="css/styles.css">
  <script src="js/helper.js"></script>
</head>
<body>
<header>
  <div id="pagina-inicial">
    <a href="" title="Página Inicial">
      SGAB
    </a>
  </div>
  <div id="logo-topo">
    <a href="https://www.cefetmg.br/" target="_blank" title="Centro Federal de Educação Tecnológica de Minas Gerais">
      <img src="img/logo_topo.png" alt="Centro Federal de Educação Tecnológica de Minas Gerais">
    </a>
  </div>
</header>
<main>
  <section id="nome-form">
    <h1>Gestão de Unidades Organizacionais</h1>
  </section>
  <section id="form">
    <div id="caixa-form">
      <form>
        <div>
          <label for="nomeUnidade">Nome:</label> <input type="text" id="nomeUnidade" name="nome" placeholder="Nome da unidade" required>
        </div>
        <div>
          <label for="cnpj">CNPJ:</label> <input type="text" id="cnpj" name="cnpj" placeholder="ID" required>
        </div>
        <div id="caixa-form-footer">
          <button type="submit" id="botaoProximo"  onclick="cnpj()" >Acessar</button>
          <button type="submit" id="dados" onclick="document.getElementById('caixa-dados').style.visibility = 'visible'"  onclick="email()">Cadastrar</button>
          <button type="submit" id="dados" onclick="document.getElementById('caixa-dados').style.visibility = 'visible'"  onclick="email()">Editar Unidade</button>
          <button type="submit" id="deletar" onclick="cnpj()">Desativar Unidade</button>
        </div>
        <span id="erro"></span>
      </form>
      <form>
        <div id="caixa-dados">
          <div>
            <label for="nomeUnidade"> Nome: </label> <input type="text" id="nomeUnidade" name="nome" placeholder="Nome da Unidade Organizacional">
          </div>
          <div>
            <label for="idemail">E-Mail:</label> <input type="text" id="idemail" name="email" placeholder="Email">
          </div>
          <div>
            <label for="idcep">CEP:</label> <input type="text" id="idcep" name="cep" placeholder="CEP">
          </div>
          <div>
             <label for="idcep">Endereço:</label><input type="text" id="idcep" name="cep" placeholder="Endereço">
          </div>
          <div id="caixa-form-footer">
            <button type="submit" id="finalizar">Finalizar</button>
          </div>
        </div>
      </form>
    </div>
  </section>
</main>
<footer>
  <p>SGAB - Sistema de Gestão de Acervo Bibliográfico</p>
</footer>
</body>
</html>
