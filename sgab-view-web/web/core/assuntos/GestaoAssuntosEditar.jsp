<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>SGAB | Gestão de Assuntos</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="..\..\css\styles.css">
</head>
<body>
    <% String assuntoAntigo = request.getAttribute("tagAssuntoAntigo"); 
        String assuntoEditado = request.getAttribute("tagAssuntoNovo"); %>
    <header>
        <div id="pagina-inicial">
            <a href=""title="Página Inicial">
                SGAB
            </a>
        </div>
        <div id="logo-topo">
            <a href="http://www.cefetmg.br/" target="_blank" title="Centro Federal de Educação Tecnológica de Minas Gerais">
                <img src="..\..\images/logo_topo.png" alt="Centro Federal de Educação Tecnológica de Minas Gerais">
            </a>
        </div>
    </header>
    <main>
        <section id="nome-form">
            <h1>Edição de Assuntos</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <form action="/sgab/editarController" method="post"> <!-- verificar caminho do action (./editarController) -->
                    <div>
                        <label for="tag">Informe o assunto a ser editado <span class="input-obrigatorio">*</span></label>
                        <input type="text" id="assunto" name="assuntoAntigo" placeholder="Assunto a ser editado" required>
                        <small>Digite um assunto válido.</small>
                    </div>
                    <div>
                        <label for="tag">Informe o novo assunto <span class="input-obrigatorio">*</span></label>
                        <input type="text" id="assunto" name="assuntoNovo" placeholder="Novo assunto" required>
                        <small>Digite um assunto válido.</small>
                    </div>
                    <div class="caixa-form-footer">
                        <button type="submit">Editar</button>
                    </div>
                    <h2>Assunto <%= assuntoAntigo%> foi alterado para <%= assuntoEditado%>!</h2>
                </form>
            </div>
        </section>
    </main>
    <footer>
        <p>SGAB - Sistema de Gestão de Acervo Bibliográfico</p>
    </footer>
</body>
</html>