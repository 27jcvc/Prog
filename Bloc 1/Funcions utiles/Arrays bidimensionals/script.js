"use strict"


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



let arrayNou = inicialitzarArrayBi(15, 15, ".")
terminal.innerHTML += mostrarArrayBi(ferCreu(arrayNou), "terminal")
terminal.innerHTML += mostrarArrayBi(arrayNou)


function executar(){

}
// console.log(mostrarArrayBi(arrayNou, "consola"))
// terminal.innerHTML = mostrarArrayBi(ferCreu(arrayNou), "text")
// console.log(mostrarArrayBi(ferFletxaInversa(arrayNou), "consola"));
// console.log(arrayNou)