<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro</title>
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
            <h1>Cadastro de autores</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <h1>Cadastrar Autor</h1>
                <form action="/sgab/CadastrarAutor" method="POST">
                    <label for="cadastroNome">Adicionar Nome</label>
                    <input type="text" id="cadastroNome" name="cadastroNome" placeholder="Adicione um Nome">
                    <button type="submit">Cadastrar</button>
                 </div>
                </form>
            </div>
        </section>
    </main>
    <footer>

    </footer>
</body>

</html>