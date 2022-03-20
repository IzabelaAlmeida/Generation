var nome = window.document.querySelector('#nome')
var email = window.document.querySelector('#email')
var assunto = window.document.querySelector('#assunto')

var okNome = false
var okEmail = false
var okAssunto = false

nome.style.width = '90%'
email.style.width = '90%'
assunto.style.width = '90%'

function validarNome(){
    let txtNome = document.getElementById('txtNome')
    if(nome.value.length < 3){
        txtNome.innerHTML = 'nome invalido'
        txtNome.style.color = 'red'
        okNome = false 
        
    }else{
        txtNome.innerHTML = 'deu bom'
        txtNome.style.color = 'green'
        okNome = true 
    }

}
function validarEmail(){
    let txtEmail = document.getElementById('txtEmail')
    if(email.value.length < 3){
        txtEmail.innerHTML = 'email invalido'
        txtEmail.style.color = 'red'
        okEmail = false 
        
    }else{
        txtEmail.innerHTML = 'deu bom'
        txtEmail.style.color = 'green'
        okEmail = true 
    }

}
function validarAssunto(){
    let txtAssunto = document.getElementById('txtAssunto')
    if(assunto.value.length >= 100){
        txtAssunto.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
        txtAssunto.style.color = 'red'
        okAssunto = false 
        
    }else{
        txtAssunto.innerHTML = 'deu bom'
        txtAssunto.style.color = 'green'
        okAssunto = true 
    }

}

function enviar(){
    if(okNome == true){
        alert('mensagem enviada com sucesso!!')
    }else{
    alert('preencha corretamente')
}
    }
    function enviar(){
        if(okEmail == true){
            alert('mensagem enviada com sucesso!!')
        }else{
        alert('preencha corretamente')
    }
        }
        function enviar(){
            if(okAssunto == true){
                alert('mensagem enviada com sucesso!!')
            }else{
            alert('preencha corretamente')
        }
            }
   
    

        

