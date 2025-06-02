"use strict";

// Inputs per introduir el nom i l'edat
// const iNom = document.getElementById("nom");
const dom = document.getElementById("dom");

const bEx1 = document.getElementById("ex1");



const iEdat = document.getElementById("edat");
const ivalor1 = document.getElementById("valor1");
const ivalor2 = document.getElementById("valor2");

// Botó per executar l'aplicació
const bExec = document.getElementById("exec");
const bTrobarPos = document.getElementById("trobarPos");

// Element on mostrar el resultat
const terminal = document.getElementById("terminal");

// Quan es fa clic en el botó 'exec' es crida la funció 'executar()'
// bExec.addEventListener("click", executar);
// bTrobarPos.addEventListener("click", executar)
bEx1.addEventListener("click", afegirDOM);
function executar(){
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
function ex3(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme...".toUpperCase()
    let missatge
    let vocals = 0
    let consonants = 0
    let simbols = 0

    for(let i = 0; i < FRASE.length; ++i){
        // Vocals
            if(FRASE.charAt(i) == 'A' || FRASE.charAt(i) == 'E' || FRASE.charAt(i) == 'I' || FRASE.charAt(i) == 'O' || FRASE.charAt(i) == 'U'){
        // if(("AEIOU").includes(FRASE[i])){
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

function ex4(){
    let num = parseInt((ivalor1.value).trim());
    let missatge = "";
    for(let i = 1; i <= 10; ++i){
        missatge += num + " * " + i + " = " + (num*i) + "<br>" 
    };
    terminal.innerHTML = missatge;



}

function ex5(){
    let num = parseInt((ivalor1.value).trim());
    let missatge = "";
    while(true){
        if((num % 2) == 0){
            missatge += "Num parell dividint per 2<br>"
            missatge += "<strong>"+ num + "</strong>"+ "<br>"
            num = num / 2
        }else{
            missatge += "El num es imparell multiplicant per 3 i restandole 1<br>"
            missatge += "<strong>"+ num + "</strong>"+ "<br>"
            num = (num * 3) - 1
            break;
            }
        }
        
    
    terminal.innerHTML += missatge
}

function ex6(){
    let num = parseInt((ivalor1.value).trim());
    let missatge = "";
    // if(num === 1 || num === 2 || num === 3 || num === 4 || num === 5 || num === 6 || num === 7 || num === 8 || num === 9){
    // }
    // 100 0000 000
    for(let i = 0; i < 100; ++i){
        num *= num 
        missatge += num + "<br>";
    }
    terminal.innerHTML += missatge;
}

// Incomplet
function ex7(){
    let num = parseInt((ivalor1.value).trim());
    let missatge = "";
    let numAbinari = ""
    do{
        numAbinari += (num % 2);
        num = Math.floor(num / 2)
        missatge += numAbinari + "<br>" 
    }while(num == 0);

    terminal.innerHTML = missatge
}

function ex8(){
    const FRASE  = "En un lugar de la mancha de cuyo nombre no quiero acordarme...".toUpperCase();
    const LLETRA = "y".toUpperCase();
    let missatge = "";
    missatge += "<strong>Frase: </strong>" + FRASE + "<br>"
    for(let i = 0; i < FRASE.length; ++i){
        if(LLETRA.includes(FRASE)){
            missatge += "<strong>S'ha trobat a la posició: </strong>" + FRASE.search(LLETRA) + "<br>"
            break;
        }
        else{
            missatge += "<strong>S'ha trobat a la posició: </strong>" + FRASE.search(LLETRA) + "<br>"
            break;
        }
    };
    terminal.innerHTML = missatge;
}