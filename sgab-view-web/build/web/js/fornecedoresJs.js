function cnpj(){
    let botaoElcnpj = document.querySelector('#botaoProximo');
        let cnpjEscrito = document.querySelector('#cnpj');
        let verificaCnpj = /[0-9]{2}[.][0-9]{3}[.][0-9]{3}[.][/][0-9]{4}[-][0-9]{2}/
        if(verificaCnpj.test(cnpjEscrito.value) == false){
            document.getElementById("erro").innerHTML = "Cnpj escrito errado";
        }
}

    
        
