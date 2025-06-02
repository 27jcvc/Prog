"use strict";

// Inputs per introduir el nom i l'edat
// const iNom = document.getElementById("nom");
const iEdat = document.getElementById("edat");
const ivalor1 = document.getElementById("valor1");
const ivalor2 = document.getElementById("valor2");

// Botó per executar l'aplicació
const bExec = document.getElementById("exec");
const botonCon = document.getElementById("buttonCon");
const botonVoc = document.getElementById("buttonVoc");
const botonSim = document.getElementById("buttonSim");
// Element on mostrar el resultat
const terminal = document.getElementById("terminal");

// Quan es fa clic en el botó 'exec' es crida la funció 'executar()'
bExec.addEventListener("click", executar);
botonCon.addEventListener("click", comptarConstants);
botonVoc.addEventListener("click", comptarVocals);
botonSim.addEventListener("click", comptarSimbols);

function ex1(){
    let valor1 = parseInt((ivalor1.value).trim());
    let valor2 = parseInt((ivalor2.value).trim());
    let missatge = "";
    let min =  Math.min(valor1, valor2);
    let max =  Math.max(valor1, valor2);


    if(valor1 < valor2){
        missatge += "Ordre descendent:<br>"
        for(let i = max; i >= min; --i){
            missatge += i + " "
        }
    }else{
        missatge += "Ordre ascendent:<br>"
        for(let i = min; i <= max; ++i){
            missatge += i + " "
        }
}
    terminal.innerHTML = missatge
}

function ex2(){
    let valor1 = parseInt((ivalor1.value).trim());
    let valor2 = parseInt((ivalor2.value).trim());
    let missatge = "";
    let min =  Math.min(valor1, valor2);
    let max =  Math.max(valor1, valor2);
    let suma = 0

    missatge = min + " i " +  max + " ---> "
    for(let i = min + 1; i <= max - 1; ++i){
        missatge += i + " + "
        suma += i
        terminal.innerHTML += "Suma " + suma + "<br>"
    }
    
    terminal.innerHTML += missatge.substring(0, missatge.length-3) + " = " + suma + "<br>"
}

/**
 * CUENTA LOS ESPACIOS EN BLANCOAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
 */
function executar(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme...".toUpperCase()
    let missatge
    let vocals = 0
    let consonants = 0
    let simbols = 0

    for(let i = 0; i < FRASE.length; ++i){
        // Vocals
            // if(FRASE.charAt(i) == 'A' || FRASE.charAt(i) == 'E' || FRASE.charAt(i) == 'I' || FRASE.charAt(i) == 'O' || FRASE.charAt(i) == 'U'){
        if(("AEIOU").includes(FRASE[i])){
            ++vocals
        } 
        else if (FRASE.charAt(i) >= 'A' && FRASE.charAt(i) <= 'Z') {
            // else if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".includes(FRASE[i])){
            ++consonants
        }else{
            ++simbols
        }
    }
    missatge = "Consonants: " + consonants
    missatge +="<br>Vocals: "     + vocals
    missatge +="<br>Simbols: "    + simbols

    terminal.innerHTML = missatge 
}

function comptarConstants(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme...".toUpperCase()
    let missatge
    let consonants = 0

    for(let i = 0; i < FRASE.length; ++i){
        if (!(("AEIOU").includes(FRASE[i])) && FRASE.charAt(i) >= 'A' && FRASE.charAt(i) <= 'Z') {
            // else if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".includes(FRASE[i])){
            ++consonants
    }
}
    missatge = "Consonants: " + consonants
    terminal.innerHTML = missatge 
}

function comptarVocals(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme...".toUpperCase()
    let missatge = ""
    let vocals = 0

    for(let i = 0; i < FRASE.length; ++i){
        // Vocals
            // if(FRASE.charAt(i) == 'A' || FRASE.charAt(i) == 'E' || FRASE.charAt(i) == 'I' || FRASE.charAt(i) == 'O' || FRASE.charAt(i) == 'U'){
        if(("AEIOU").includes(FRASE[i])){
            ++vocals
        } 
    }
    missatge +="Vocals: "     + vocals

    terminal.innerHTML = missatge 
}

function comptarSimbols(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme...".toUpperCase()
    let missatge = ""
    let simbols = 0

    for(let i = 0; i < FRASE.length; ++i){
        // Vocals
            // if(FRASE.charAt(i) == 'A' || FRASE.charAt(i) == 'E' || FRASE.charAt(i) == 'I' || FRASE.charAt(i) == 'O' || FRASE.charAt(i) == 'U'){
        if(!("AEIOU").includes(FRASE[i]) && !(FRASE.charAt(i) >= 'A' && FRASE.charAt(i) <= 'Z')){
            ++simbols
        } 
    }
    missatge +="Simbols: "    + simbols

    terminal.innerHTML = missatge 
}



// function executar(){
//     let num = prompt("---------------");
//     num = parseInt(num)


//     switch(num){
//         case 0:
//             "Has sortit";
//             break;
//         case 1:
//             ex1()

//     }

//     do{

//     }while(num != 0);
// }