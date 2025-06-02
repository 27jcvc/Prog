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

// // Funció que executa l'aplicació
// function executar() {
//     // Obtenir els 'inputs' del document i guardar-los en variables
//     let nom = iNom.value;
//     let edat = iEdat.value;

//     // Processar les dades
//     nom = nom.trim().toUpperCase();
//     edat = parseInt(edat);

//     // Mostrar el resultat
//     terminal.innerHTML = "Hola " + nom + " tens " + edat + " anys";
// }



// // Solucio 1
// function executar() {
//     // Obtenir els 'inputs' del document i guardar-los en variables
//     let preu = iEdat.value;
//         preu = parseInt(preu);
//     let transport = 0
//     let dte = preu * 0.10
//     let preuTotal = 0

//     if (isNaN(preu))terminal.innerHTML = "Error NaN";
//     transport = (preu > 100) ? 10 : 0;
    
//     // Lo mejor seria usar un if para calcular solo cuando es mayor que 250
//     // dte = (preu > 250) ? preu * 0.10 : 0;  // Si preu > 250, se calcula el descuento, si no, dte es 0

//     preu = (preu > 250) ? preu - dte : preu; // Si preu > 250, se resta el descuento

//     preuTotal = preu + transport

//     terminal.innerHTML = "El total es: " + preuTotal;
// }

// Solucio 2
// function executar() {
//     // Obtenir els 'inputs' del document i guardar-los en variables
//     let preu = iEdat.value;
//         preu = parseInt(preu);
//     let transport = false
//     let dte = false
//     let preuTotal = 0

//     if (!isNaN(preu)){
//         if (preu > 100) transport = true;
//         if (preu > 250) dte = true;
//         preu += (transport) ? 10 : 0;
//         preu -= (dte) ? preu * 0.10 : 0;
//         preuTotal = preu 
//         terminal.innerHTML = "El total es: " + preuTotal;
        
//     }else{
//         terminal.innerHTML = "Error NaN";
//     }
// }

function ex1() {
    // Obtenir els 'inputs' del document i guardar-los en variables
    let edat = ivalor.value;
        edat = parseInt(edat);

    if (isNaN(edat))terminal.innerHTML = "Error NaN";
    else if (edat <= 0)terminal.innerHTML = "Error edat menor o igual a 0";
    else if (edat >= 120)terminal.innerHTML = "Error edat major o igual a 120";
    else if (edat < 10)terminal.innerHTML = "Nen";
    else if (edat < 18)terminal.innerHTML = "Adolescent";
    else if (edat < 65)terminal.innerHTML = "Adult";
    else if (edat >= 65)terminal.innerHTML = "Major";
    // <!-- si la edad es negativa NaN (error Nan) edat menor a 0, error si es mayor a 120 -->

}


function ex2(){
    let lletra = ivalor.value.toUpperCase();

    if (lletra == "") terminal.innerHTML = "Introdueix un valor!!";
    else if (lletra.length > 1) terminal.innerHTML = "Introdueix sol un valor!!";
    else if (!isNaN(parseInt(lletra)))terminal.innerHTML = "Introdueix una lletra!!";
    else{
        if (lletra == "A" || lletra == "E" || lletra == "I" || lletra == "O" || lletra == "U")terminal.innerHTML = "Vocal";
        else terminal.innerHTML = "Consonant";
    }
}

function ex3(){
    let num1 = ivalor1.value;
    let num2 = ivalor2.value;
    num1 = parseInt(num1);
    num2 = parseInt(num2);
    let resultado = 0;

    if (isNaN(num1) || isNaN(num2))terminal.innerHTML = "Algun dels valors no son un numero";
    else{
        resultado = num1 % num2
        if (num1 < num2){
            terminal.innerHTML = "Error el segon numero es més gran<br>"
            resultado = num2 % num1
        // error
        }
            if(resultado == 0)terminal.innerHTML += "Son multiplos<br>";
            else terminal.innerHTML += "No son multiplos<br>";
    }
}

function ex4(){
    let text1 = ivalor1.value
    let text2 = ivalor2.value

    terminal.innerHTML = text1 + text2;
}

function ex5(){

    let text1 = ivalor1.value
    let text2 = ivalor2.value

    let textComplet = text1 + text2
    let lletra = ""
    terminal.innerHTML = textComplet + "<br>";

    for(let i = 0; i < textComplet.length; ++i){
        lletra = textComplet.charAt(textComplet.length - i - 1)
        terminal.innerHTML += lletra;
    }

}


function executar(){

    let paraula = ivalor1.value;
    let lletra = ""
    let lletraA = false
    let lletraE = false
    let lletraI = false
    let lletraO = false
    let lletraU = false

    terminal.innerHTML  = '<h3 style="color: gray;">Lletres: <h3>';
    for(let i = 0; i < paraula.length; ++i){
        let lletra = paraula.charAt(i).toUpperCase();
        terminal.innerHTML  += lletra +  " " ;
        switch(lletra){
            case "A":
                lletraA = true;
                break;
            case "E":
                lletraE = true;
                break;
            case "I":
                lletraI = true;
                break;
            case "O":
                lletraO = true;
                break;
            case "U":
                lletraU = true;
                break;
        };
    }

    
    terminal.innerHTML  += "<br>El text conté: A: " + lletraA + "<br>";
    terminal.innerHTML += "El text conté: E: " + lletraE + "<br>";
    terminal.innerHTML += "El text conté: I: " + lletraI + "<br>";
    terminal.innerHTML += "El text conté: O: " + lletraO + "<br>";
    terminal.innerHTML += "El text conté: U: " + lletraU + "<br>";


}







// let num = prompt("Introdueix un numero: ");

// do{
    // 
    // switch(num){
        // case 1:
            // ex1();
            // break;
            // 
    // }
// }while();


