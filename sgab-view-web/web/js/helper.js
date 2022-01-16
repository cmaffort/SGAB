/*---------------------------------------------------------------------
 * Funcao de validacao do CNPJ
 *---------------------------------------------------------------------*/
function cnpj() {
    let botaoElcnpj = document.querySelector('#botaoProximo');
    let cnpjEscrito = document.querySelector('#cnpj');
    let verificaCnpj = /[0-9]{2}[.][0-9]{3}[.][0-9]{3}[.][/][0-9]{4}[-][0-9]{2}/;
    if (verificaCnpj.test(cnpjEscrito.value) == false) {
        document.getElementById("erro").innerHTML = "Cnpj escrito errado";
    }
}


/*---------------------------------------------------------------------
 * Funcao de validacao dos campos formLogin
 * Utilizacao:  funcao ValidaLogin() 
 *---------------------------------------------------------------------*/
function validarCamposLogin(frm) {
    var login = frm.login.value;
    var senha = frm.senha.value;
    var result = false;

    if (login === "") {
        alert("Preencha o campo usuário!");
        frm.login.focus();
    } else if (senha === "") {
        alert("Preencha o campo senha!");
        frm.senha.focus();
    } else {
        frm.action = "/sgab/main?acao=Logar";
        frm.submit();
        result = true;
    }
    return result;
}


function validarUsuario(frm) {
    var result = false;
    
    if (frm.login.value === "") {
        alert("Informar o login!");
        frm.login.focus();
    } else if (frm.nome.value === "") {
        alert("Informar o nome!");
        frm.nome.focus();
    } else if (frm.senha.value === "") {
        alert("Informar a senha!");
        frm.senha.focus();
    } else if (frm.email.value === "") {
        alert("Informar o email!");
        frm.email.focus();
    } 
    else
        result = true;
        
    return result;

}

function gravarAlteracao(frm) {
    var table = frm.table.value;

    if (table === "Usuario") {
        if (validarUsuario(frm)) {
            if (frm.acao.value === "alterar")
                caminhourl = "/sgab/main?acao=UsuarioGravarAlteracao";
            else if (frm.acao.value === "gravar")
                caminhourl = "/sgab/main?acao=UsuarioGravarInsercao";
        }
    }

    frm.action = caminhourl;
    frm.submit();
}

function excluir(id, frm) {
    var table = frm.table.value;

    if (table === "Usuario") {
        if (confirm('Deseja excluir o Usuário com Id = ' + id + '?')) {
            frm.usuarioId.value = id;
            frm.action = "/sgab/main?acao=UsuarioExcluir";            
            frm.submit();
        }
    }
}