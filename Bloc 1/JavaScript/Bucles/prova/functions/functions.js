function afegirDOM(){
    let contingut = ""
    bExec.addEventListener("click", executar)
    // Boton executar
    contingut += '<button id="exec">Executar</button>'
        
    dom.innerHTML = contingut;
}