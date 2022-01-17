<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="/sgab/css/styles.css">
    <style>
      #caixa-form{
        display: flex;
        flex-direction: column;
      }
      a{
        width: 100%;
        text-align: center;
        cursor: pointer;
      }
      button{
        width: 100%;
        padding: 0.5rem 0;
        cursor: pointer;
      }
    </style>
</head>
<body>
    <header>
        <div id="pagina-inicial">
            <a href="" title="Página Inicial">
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
            <h1>Cadastro de autores</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <h2>Gestão</h2>
                <a href="cadastrar.jsp"><button>Cadastrar um autor</button></a>
                <a href="excluir.jsp"><button>Excluir um autor</button></a>
                <a href="pesquisar.jsp"><button>Pesquisar um autor</button></a>
                <a href="pesquisar.jsp"><button>Alterar um autor</button></a>
            </div>
        </section>
    </main>
    <footer>

    </footer>
</body>
</html>