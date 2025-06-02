"use strict";

// Inputs per introduir el nom i l'edat
// const iNom = document.getElementById("nom");
const iEdat = document.getElementById("edat");
const ivalor1 = document.getElementById("valor1");
const ivalor2 = document.getElementById("valor2");

// Botó per executar l'aplicació
// const bExec = document.getElementById("exec");
const bAfegir = document.getElementById("afegir");
const bLlistar = document.getElementById("llistar");

// Element on mostrar el resultat
const terminal = document.getElementById("terminal");

// Quan es fa clic en el botó 'exec' es crida la funció 'executar()'
// bExec.addEventListener("click", executar);
bAfegir.addEventListener("click", afegir);
bLlistar.addEventListener("click", llistar);


let array = [];

function afegir(){
    let valor = ivalor1.value.trim();
    let missatge = ""
    if(valor == ""){
        missatge = "Has de introduir alguna paraula"
        terminal.innerHTML = missatge
        return
    }

    array.push(valor);
    ivalor1.value = ""
    missatge = "S'ha afegit un nou element";
    terminal.innerHTML = missatge

}

function llistar(){
    let missatge = "";
    let resultat;
    if(array.length == 0){
        missatge += "No has afegit cap paraula"
        terminal.innerHTML = missatge
        return
    };

    resultat = array.join(", ");
    missatge = resultat;
    terminal.innerHTML = missatge

};