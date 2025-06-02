"use strict";

// Inputs per introduir el nom i l'edat
// const iNom = document.getElementById("nom");
const iEdat = document.getElementById("edat");
const ivalor1 = document.getElementById("valor1");
const ivalor2 = document.getElementById("valor2");

// Botó per executar l'aplicació
const bAfegirLlista1 = document.getElementById("llista1");
const bAfegirLlista2 = document.getElementById("llista2");
const bLlistar = document.getElementById("llistar");

// Element on mostrar el resultat
const terminal = document.getElementById("terminal");

// Quan es fa clic en el botó 'exec' es crida la funció 'executar()'
bAfegirLlista1.addEventListener("click", afegirLlista1);
bAfegirLlista2.addEventListener("click", afegirLlista2);
bLlistar.addEventListener("click", llistar);

// Expresions regulars
// Qualsevol separador /s (tabulador, espai, salt de linia)
// /\s*,\s*/
// * 0 a N
// + 1 a N


// 8 - Introduir una paraula i afegir-la a l'array 1 al prémer el botó "Afegir llista 1" o afegir-la a l'array 2 si es prem el botó "Afegir llista 2".
// Al prémer el botó "Llistar", ha de juntar els dos arrays en un i mostrar totes les paraules separades per una coma i un espai.
let array1 = [];
let array2 = [];
let regEx = /\s*,\s*/;

function afegirLlista1(){
    let resposta = ivalor1.value.trim();
    if(resposta == "") {
        terminal.innerHTML = "S'ha de introduir una paraula"
        return;
    }

    array1.push(resposta);
}

function afegirLlista2(){
    let resposta = ivalor1.value.trim();
    if(resposta == "") {
        terminal.innerHTML = "S'ha de introduir una paraula"
        return;
    }

    array2.push(resposta);
}

function llistar(){
    let missatge = "";
    let paraules = []
    // let arrayToText = (array1.join(", ")); 
    // arrayToText += (array2.join(", "));

    // paraules.push(...array1);
    // paraules.push(...array2);
    // paraules = array1.concat(array2)
    paraules.push(array1).push(...array2);

    
    // for(let e of array1)paraules.push(e.split(", "));
    // paraules += array2.split(", ")
    missatge += "Llistat 1: " + array1.join(", ") + "<br>"; 
    missatge += "Llistat 2: " + array2.join(", ") + "<br>"; 
    missatge += paraules.join(", ");
    terminal.innerHTML = missatge;
    console.log(paraules);
}