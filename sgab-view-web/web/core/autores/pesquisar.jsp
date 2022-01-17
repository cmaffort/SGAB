<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Pesquisa Autor</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="/sgab/css/styles.css">
</head>

<body>
    <header>
        <div id="pagina-inicial">
            <a href="" title="Página Inicial">
                Biblioteca
            </a>
        </div>
        <div id="logo-topo">
            <a href="http://www.cefetmg.br/" target="_blank"
                title="Centro Federal de Educação Tecnológica de Minas Gerais">
                <img src="/sgab/images/logo_topo.png" alt="Centro Federal de Educação Tecnológica de Minas Gerais">
            </a>
        </div>
    </header>
    <main>
        <section id="nome-form">
            <h1>Pesquisa do autor</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <h2>Pesquisa por ID</h2>
                <form action="/sgab/PesquisarAutor" method="POST">
                    <label for="idAutor">Digite o ID</label>
                    <input type="text" id="idAutor" name="idAutor" placeholder="Adicione um id">
                    <button type="submit">Pesquisar</button>
                </form>
                <h2>Pesquisa por Nome</h2>
                <form action="/sgab/PesquisarAutor" method="POST">
                    <label for="nomeAutor">Digite o nome</label>
                    <input type="text" id="nomeAutor" name="nomeAutor" placeholder="Adicione um Nome">
                    <button type="submit">Pesquisar</button>
                </form>
            </div>
        </section>
    </main>
    <footer>

    </footer>
</body>

</html>