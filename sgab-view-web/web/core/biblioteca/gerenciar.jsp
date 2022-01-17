<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Gerenciamento Biblioteca</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
    <header>
        <div id="pagina-inicial">
            <a href="../menu.jsp" title="PÃ¡gina Inicial">
                Biblioteca
            </a>
        </div>
        <div id="logo-topo">
            <a href="http://www.cefetmg.br/" target="_blank" title="Centro Federal de EducaÃ§Ã£o TecnolÃ³gica de Minas Gerais">
                <img src="../../images/logo_topo.png" alt="Centro Federal de EducaÃ§Ã£o TecnolÃ³gica de Minas Gerais">
            </a>
        </div>
    </header>
    <main>
        <section id="nome-form">
            <h1>Gerenciamento</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <div id="alterarInfo" class="divInputs">
                    <h1>Alterar Informações</h1>
                    <form method="POST" name="gerencia">
                        <input type="hidden" name="table" value="Biblioteca">
                        <input type="hidden" name="acao" value="alterar">
                        <label for="id">Pesquisar por Id</label>
                        <input type="radio" name="inputsGerenciar" value="1" class="retirar"><br>
                        <label for="id">Pesquisar por Nome</label>
                        <input type="radio" name="inputsGerenciar" value="2" class="retirar"><br>
                        <label for="id">Alterar Nome</label>
                        <input type="radio" name="inputsGerenciar" value="3" class="pesquisar"><br>
                        <label for="id">Alterar ID</label>
                        <input type="radio" name="inputsGerenciar" value="4" class="pesquisar"><br>
                        <label for="id">Alterar Unidade Organizacional</label>
                        <input type="radio" name="inputsGerenciar" value="5" class="pesquisar">
                        <input id="biblioteca" style="display: none;" type="text" name="Biblioteca" placeholder="Coloque aqui o nome da Biblioteca que deseja alterar"><br>
                        <input type="text" name="dado" placeholder="Selecione uma opção e digite aqui"><br>
                        <button type="button" onclick="gravarAlteracao(document.gerencia)">Adicionar</button>
                    </form>
                </div>
            </div>
        </section>
    </main>
    <footer>
        
    </footer>
    <script>
        let pesquisar = document.querySelectorAll(".pesquisar");
        let retirar = document.querySelectorAll(".retirar");
        let biblioteca = document.querySelector("#biblioteca");
        
        for(pesquisa of pesquisar){
            pesquisa.addEventListener('click',()=>{
                biblioteca.style.display = "inline";
            })
        }
        
        for(retira of retirar){
            retira.addEventListener('click',()=>{
                biblioteca.style.display = "none";
            })
        }
    </script>
    <script src="../../js/helper.js"></script>
</body>
</html>
