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
    let cotxe = {
        marca: iMarca.value,
        model: iModel.value,
        potencia: iPotencia.value,
        preu: iPreu.value
};

for(let e of cotxes){
    if(cotxe.model == e.model || cotxe.marca == e.marca){
        missatge += "Marca: " + e.marca +" <br>" +
        "Model: " + e.model +" <br>" +
        "Potencia: " + e.potencia +" <br>" +
        "Preu: " + e.preu +" <br>" +" <br>"; 
    };

    terminal.innerHTML = missatge;
}
};

function buscarPos(){
    let missatge = "";
    let cotxe = {
        marca: iMarca.value,
        model: iModel.value,
        potencia: iPotencia.value,
        preu: iPreu.value
};
    let pos = -1;

    for(let i = 0; i < cotxes.length; ++i){
        pos = ((cotxe.marca).includes(cotxes[i])) || cotxe.model.includes(cotxes[i]) ? i : pos;
    }
    return pos

}


function filtrar(marca){

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
        missatge += "Marca: " + e.marca +" <br>" +
                    "Model: " + e.model +" <br>" +
                    "Potencia: " + e.potencia +" <br>" +
                    "Preu: " + e.preu +" <br>" +" <br>"; 
    }

    
    terminal.innerHTML = missatge

}; 

function esborrar(){
    terminal.innerHTML = buscarPos()


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
