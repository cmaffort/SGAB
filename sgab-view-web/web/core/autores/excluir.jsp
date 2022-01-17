<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Excluir Autor</title>
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
            <h1>Exclusão de autores</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <form action="/sgab/ExcluirAutor" method="POST">
                    <label for="idAutor">Id do autor excluido: </label>
                    <input type="text" id="idAutor" name="idAutor" placeholder="Id">
                    <button type="submit">Excluir</button>
                </form>
            </div>
        </section>
    </main>
    <footer>

    </footer>
</body>

</html>