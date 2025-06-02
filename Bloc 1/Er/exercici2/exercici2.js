"use strict";
const iFilesiColumnes = document.getElementById("fc");

const terminal = document.getElementById("terminal");
const bMostrar = document.getElementById("mostrar");


bMostrar.addEventListener("click", mostrar)

/**
 * Funcion para inicializar un Array Bidimensional
 * 
 * Hay que indicar las columnes y las filas que queremos que sea el array
 * Ademas, hay que podemos especificar el separador que queremos
 * 
 * let arrayInicialitzat = inicialitzarArrayBi(9, 9, ".")
 * 
 * @param {*} columnes 
 * @param {*} files 
 * @param {*} separador por defecto "-"
 * @returns 
 */
function inicialitzarArrayBi(columnes, files, separador){
    const C = columnes
    const F = files
    if (separador == undefined) separador = "-";

    let arrayNou = []

    for (let i = 0; i < F; ++i){
        arrayNou[i] = []
        for (let j = 0; j < C; ++j){
            arrayNou[i][j] = `${separador}`
        };
    };
    return arrayNou;
};

/**
 * Funcion para mostrar un array bidimensional introduciendo el metodo que utilizaremos
 * "consola" con separador '\n' o "terminal" con separador '<br>'
 * Esta funcion retorna un mensaje...
 * 
 * Tendremos que introducir el array una vez inicializado
 * 
 * mostrarArrayBi(array, "consola"))
 * 
 * @param {*} _array_ 
 * @param {*} _metodo_ 
 * @returns 
 */
function mostrarArrayBi(_array_, _metodo_){

    const F = _array_.length;
    const C = _array_[0].length;
    let missatge = "";

    for (let i = 0; i < F; ++i){
        for (let j = 0; j < C; ++j){
            missatge += _array_[i][j] + " "
        };

        if (_metodo_ == "consola")  missatge += "\n";
        else if (_metodo_ == "terminal") missatge += "<br>";
        else missatge += "<br>";
    }
        return missatge;
};

iFilesiColumnes.value = "8, 6"
let dadesIntroduides = iFilesiColumnes.value.split(", ")

function mostrar(){
    let missatge = "";
    const N = parseInt(dadesIntroduides[1]) // Files
    const M = parseInt(dadesIntroduides[0]) // Columnes

        if(iFilesiColumnes.value == ""){
            missatge = "Introdueix dades"
            terminal.innerHTML = missatge
            return
        }

    let nouArray = inicialitzarArrayBi(M, N, ".");

        for (let i = 0; i < N; ++i){
            nouArray[i] = []
            for (let j = 0; j < M; ++j){
                if(((i+j) % 2) == 0)nouArray[i][j] = "$";
                else if(((i+j) % 3) == 0) nouArray[i][j] = "&";
                else if(((i+j) % 2) == 0 && ((i+j) % 3) == 0) nouArray[i][j] = "#";
                else nouArray[i][j] = ".";
            };
        };
    

    // missatge += M + "," +  N
    missatge += mostrarArrayBi(nouArray, "terminal")
    terminal.innerHTML = missatge
}


