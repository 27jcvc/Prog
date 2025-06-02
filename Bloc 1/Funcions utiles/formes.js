/*
--------------------------------------------------------------
-------------           FORMES                 ---------------
--------------------------------------------------------------
*/
function ferCreu(_array_){
    let arrayCreu = []
    arrayCreu = _array_.map(fila => [...fila]);
    //  copiar array bidimensional ya que con push(..._array_)
    // no se copia y se modifica el array original
    // map genera un nuevo array con lo que llama la funcion
    //  en este caso la funcion llama a las filas y las copia en un array
    //  el qual se añade a uno nuevo

let files = arrayCreu.length
let columnes = arrayCreu[0].length


    for(let i = 0; i <  files; ++i){
        // Part Esquerra
        arrayCreu[i][i] = "*"
        // Part Dreta
        // si es més llarg el alto
        if (columnes > files)
            arrayCreu[i][(files-1)-i] = "*"; 
        else 
        arrayCreu[i][(columnes-1)-i] = "*"; 
    }

    return arrayCreu
}

function ferQuadrat(_array_){
    let arrayQuadrat = []
    arrayQuadrat = _array_.map(fila => [...fila]);
    //  copiar array bidimensional ya que con push(..._array_)
    // no se copia y se modifica el array original
    // map genera un nuevo array con lo que llama la funcion
    //  en este caso la funcion llama a las filas y las copia en un array
    //  el qual se añade a uno nuevo

    let files = arrayQuadrat.length
    let columnes = arrayQuadrat[0].length
    
        for(let i = 0; i < files; ++i){
            // Part esquerra i part dreta
            arrayQuadrat[i][columnes-1] = "*"
            arrayQuadrat[i][0] = "*"
        }

        for(let i = 0; i < columnes; ++i){
            // Part de arriba i part de abaix
            arrayQuadrat[0][i] = "*"
            arrayQuadrat[files-1][i] = "*"
        }
        return arrayQuadrat
}

function ferFletxa(_array_){
    let arrayFletxa = []
    arrayFletxa = _array_.map(fila => [...fila]);
    //  copiar array bidimensional ya que con push(..._array_)
    // no se copia y se modifica el array original
    // map genera un nuevo array con lo que llama la funcion
    //  en este caso la funcion llama a las filas y las copia en un array
    //  el qual se añade a uno nuevo

    let files = arrayFletxa.length
    let columnes = arrayFletxa[0].length

        let diagonal = Math.min(files, columnes); // Per a la diagonal
    
        // diagonal
        for (let i = 0; i < diagonal; ++i) {
            arrayFletxa[i][i] = "*";
        }
    
        // fila de la dreta
        for (let i = 0; i < files - 1; ++i) {
            arrayFletxa[i][columnes - 1] = "*";
        }
    
        // fila de abaix
        for (let j = 0; j < columnes; ++j) {
            arrayFletxa[files - 1][j] = "*";
        }
        return arrayFletxa
    }

function ferFletxaInversa(_array_){
    let arrayFletxa = []
    arrayFletxa = _array_.map(fila => [...fila]);
    //  copiar array bidimensional ya que con push(..._array_)
    // no se copia y se modifica el array original
    // map genera un nuevo array con lo que llama la funcion
    //  en este caso la funcion llama a las filas y las copia en un array
    //  el qual se añade a uno nuevo

    let files = arrayFletxa.length
    let columnes = arrayFletxa[0].length

        let diagonal = Math.min(files, columnes); // Per a la diagonal
    
        // diagonal
        for (let i = 0; i < diagonal; ++i) {
            arrayFletxa[i][columnes - 1 - i] = "*";
        }
    
        // fila de la esquerra
        for (let i = 0; i < files - 1; ++i) {
            arrayFletxa[i][0] = "*";
        }
    
        // fila de abaix
        for (let j = 0; j < columnes; ++j) {
            arrayFletxa[files - 1][j] = "*";
        }
        return arrayFletxa
    }



let arrayNou = inicialitzarArrayBi(15, 15, ".")
terminal.innerHTML += mostrarArrayBi(ferCreu(arrayNou), "terminal")
terminal.innerHTML += mostrarArrayBi(arrayNou)


function executar(){

}
// console.log(mostrarArrayBi(arrayNou, "consola"))
// terminal.innerHTML = mostrarArrayBi(ferCreu(arrayNou), "text")
// console.log(mostrarArrayBi(ferFletxaInversa(arrayNou), "consola"));
// console.log(arrayNou)