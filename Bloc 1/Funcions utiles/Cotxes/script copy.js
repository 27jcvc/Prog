"use strict";

// Inputs per introduir el nom i l'edat
// const iNom = document.getElementById("nom");
const iMarca = document.getElementById("marca");
const iModel = document.getElementById("model");
const iPotencia = document.getElementById("potencia");
const iPreu = document.getElementById("preu");


// Botó per executar l'aplicació
const bAfegir = document.getElementById("afegir");
const bBuscar = document.getElementById("buscar");
const bFiltrar = document.getElementById("filtrar");
const bLlistar = document.getElementById("llistar");
const bEsborrar = document.getElementById("esborrar");
// Element on mostrar el resultat
const terminal = document.getElementById("terminal");

// Quan es fa clic en el botó 'exec' es crida la funció 'executar()'

bAfegir.addEventListener("click", afegir)
bBuscar.addEventListener("click", buscar)
bFiltrar.addEventListener("click", filtrar)
bLlistar.addEventListener("click", llistar)
bEsborrar.addEventListener("click", esborrar)

let cotxes = [];


console.log(cotxes)

function afegir(){
    let cotxe = {
        marca: iMarca.value,
        model: iModel.value,
        potencia: iPotencia.value,
        preu: iPreu.value
}
    cotxes.push(cotxe);
}

function buscar(marca, model){

    let missatge = "";
    let cotxe = crearObjecteAmbElsValors();

for(let e of cotxes){
    if(cotxe.model == e.model || cotxe.marca == e.marca){
                missatge += mostrarCotxe(e);
    };

    terminal.innerHTML = missatge;
}
};

function filtrar(marca){
    let missatge = "";
    let cotxe = crearObjecteAmbElsValors();

    for(let e of cotxes){
        if(cotxe.model == e.model){
            missatge += mostrarCotxe(e); 
        }
    };
    terminal.innerHTML = missatge
};
// array
// para borrar cosas de un array splice(pos, quantitat)


function llistar(){
    let missatge = "";
    if(cotxes[0] == undefined){
        missatge += "No has afegit cap cotxe!"
        terminal.innerHTML = missatge
        return
    };
    for(let e of cotxes){
        missatge += mostrarCotxe(e)
    }
    
    terminal.innerHTML = missatge

}; 

function esborrar(){
    let pos = buscarPos()
    
    if (pos != -1){
        cotxes.splice(pos, 1)
        terminal.innerHTML = "Eliminat correctament"
        return
    }
    
    terminal.innerHTML = "Error no s'ha trobat " + buscarPos()


    // con el for of queda la posicion vacia
}
/*
buscar(marca, model)
    retorna pos / null
filtrar(marca)
listar(array)
esborrar(marca, model)

cotxe{
    marca
    model
    potencia
    preu}
*/


// funcions
function mostrarCotxe(element){
    let missatge = ""
        missatge += "Marca: " + element.marca +" <br>" +
                    "Model: " + element.model +" <br>" +
                    "Potencia: " + element.potencia +" <br>" +
                    "Preu: " + element.preu +" <br>" +" <br>"; 
    return missatge
}


function buscarPos(){
    let cotxe = crearObjecteAmbElsValors();
    let pos = -1;

    for(let i = 0; i < cotxes.length; ++i){
        if((cotxe.marca == cotxes[i].marca)){
            pos = i
        }
    }
    return pos
}


function crearObjecteAmbElsValors(){
    let cotxe = {
        marca: iMarca.value,
        model: iModel.value,
        potencia: iPotencia.value,
        preu: iPreu.value
};
    return cotxe;
}