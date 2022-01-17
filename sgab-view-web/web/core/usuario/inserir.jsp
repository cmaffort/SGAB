<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="/core/menu.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <script type="text/javascript" language="JavaScript" src="/sgab/js/helper.js"></script>
        <title>SGAB</title>
    </head>
    <body>

        <center>
            <h3>Inserir Usuário</h3>
             <form name="frmInserirUsuario" method="post">
                <input type="hidden" name="table" value="Usuario">
                <input type="hidden" name="acao" value="gravar">
                <table>
                    <tr>
                        <td>
                            Login:
                        </td>
                        <td>
                            <input type="text" name="login" value="">
                        </td>
                    </tr>                   
                    <tr>
                        <td>
                            Nome:
                        </td>
                        <td>
                            <input type="text" name="nome" value="">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Email:
                        </td>
                        <td>
                            <input type="text" name="email" value="">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Senha:
                        </td>
                        <td>
                            <input type="password" name="senha" value="">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" aling="center">
                            <input type="button" value="Gravar" onclick="gravarAlteracao(document.frmInserirUsuario)">&nbsp;
                            <input type="reset" value="Redefinir">&nbsp;
                            <a href="/sgab/main?acao=UsuarioListar">Listar Usuários</a><br>
                        </td>
                    </tr>
                </table>
            </form>
        </center> 
    
    </body>
</html>
