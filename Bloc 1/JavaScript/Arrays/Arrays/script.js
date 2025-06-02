"use strict";

// Inputs per introduir el nom i l'edat
// const iNom = document.getElementById("nom");
const iEdat = document.getElementById("edat");
const ivalor1 = document.getElementById("valor1");
const ivalor2 = document.getElementById("valor2");

// Botó per executar l'aplicació
const bExec = document.getElementById("exec");

// Element on mostrar el resultat
const terminal = document.getElementById("terminal");

// Quan es fa clic en el botó 'exec' es crida la funció 'executar()'
bExec.addEventListener("click", executar);

function strAarrToNumArr(array){
    let e = []
    for(let i = 0; i < array.length; ++i){
        e.push(parseInt(...array[i]))
    }
    return e
}

function furula(){
    let a = ["1", "2", "3", "4", "5"];
    let missatge = "";
    missatge = strAarrToNumArr(a);
    console.log(strAarrToNumArr(a));
    terminal.innerHTML = missatge;
}

function ex2(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme..."
    ivalor1.value = FRASE; 
    let array = FRASE.split(" ")
    let missatge = ""
    missatge += array
    terminal.innerHTML = missatge;
}

function ex2(){
    let valor = ivalor1.value.trim();
    let array = [];
    let missatge = "";

    function afegir(array, paraula){
        array.push(paraula);
    }
    function llistar(array){
        let resultat = array.join(", ");
        return resultat;
    };
}