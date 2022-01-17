<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
    <header>
        <div id="pagina-inicial">
            <a href="../menu.jsp" title="Página Inicial">
                Biblioteca
            </a>
        </div>
        <div id="logo-topo">
            <a href="http://www.cefetmg.br/" target="_blank" title="Centro Federal de Educação Tecnológica de Minas Gerais">
                <img src="/sgab/images/logo_topo.png" alt="Centro Federal de Educação Tecnológica de Minas Gerais">
            </a>
        </div>
    </header>
    <main>
        <section id="nome-form">
            <h1>Cadastrar</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <h1>Cadastrar Biblioteca</h1>
                <form method="POST" name="cadastro">
                    <input type="hidden" name="table" value="Biblioteca">
                    <input type="hidden" name="acao" value="gravar">
                    <label for="adicionarUnidadeOrgInput">Adicionar UnidadeOrg</label>
                    <input type="text" id="adicionarUnidadeOrgInput" name="adicionarUnidadeOrgInput" placeholder="Adicione uma UnidadeOrg">
                    <label for="adicionarNomeInput">Adicionar Nome</label>
                    <input type="text" id="adicionarNomeInput" name="adicionarNomeInput" placeholder="Adicione um Nome">
                    <button type="button" onclick="gravarAlteracao(document.cadastro)">Adicionar</button>
                </form>
            </div>
        </section>
    </main>
    <footer>

    </footer>
    <script src="../../js/helper.js"></script>
</body>
</html>
