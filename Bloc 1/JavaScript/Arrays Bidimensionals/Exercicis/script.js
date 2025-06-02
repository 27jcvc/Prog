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

function ex(){
    let a = []
    let missatge = ""
for(let i = 0; i <  5; ++i){
    a[i] = [] 
        for(let j = 0; j <  5; ++j){
        a[i][j] = "*"
        }
}

missatge += a
terminal.innerHTML = missatge

}

function ex1(){
    let a = []
    let missatge = ""
    let contador = 1
        for(let i = 0; i <  3; ++i){
            a[i] = []
                for(let j = 0; j <  3; ++j){
                    a[i][j] = contador
                    ++contador
                }
                missatge += a[i] + "<br>"
        }
    terminal.innerHTML = missatge
}

function ex3(){
    let a = []
    let missatge = ""
    let contador = 1
        for(let i = 0; i <  3; ++i){
            a[i] = []
                for(let j = 0; j <  3; ++j){
                    a[i][j] = contador
                    ++contador
                }
                missatge += a[i] + "<br>"
        }
        
    missatge +=   "- - -" + 
        "<br>" + ("- - " + a[1][2]) + 
        "<br>"  + "- - -"
    terminal.innerHTML = missatge
}

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
function inicialitzarArrayBi(columnes, files, tipus, separador){
    const C = columnes
    const F = files
    let contador = 1
    if (separador == undefined) separador = "-";

    let arrayNou = []

    for (let i = 0; i < F; ++i){
        arrayNou[i] = []
        for (let j = 0; j < C; ++j){
            if (tipus == "separador ") arrayNou[i][j] = `${separador}`;
            else if (tipus == "contador"){
                arrayNou[i][j] = contador
                ++contador
            };
        };
    };
    return arrayNou;
};



function ex4(){
    let missatge = ""
    let a = inicialitzarArrayBi(3, 3, "contador")
        
        for(let i = 0; i <  a.length; ++i){
            // a[i] = []
            let suma = 0
                for(let j = 0; j <  a[0].length; ++j){
                    suma += a[i][j]
                }
                missatge += a[i] + " "+ suma + "<br>"
                
                
        }
        
        // missatge = a + "<br>" + "Suma: " + suma
    // console.log(missatge)
    terminal.innerHTML = missatge + "<br>" 
}




function ex5(){
    let missatge = ""
    let a = inicialitzarArrayBi(3, 3, "contador")
        
    let  files = a.length;
    let columnes = a[0].length;
    let arraySumaColumnes = []
        for(let i = 0; i <  files; ++i){
            // a[i] = []
            let suma = 0;
            let sumafiles = 0;
                for(let j = 0; j <  columnes; ++j){
                    arraySumaColumnes.push(suma += a[j][i]);
                    sumafiles += a[i][j]
                }

                missatge += a[i] + " "+ sumafiles + "<br>"
        }
        // for(let i = 0; i < arraySuma.length; ++i){
        //     missatge += arraySuma[i] + " "
        // }
        missatge += arraySumaColumnes[2] + " " + arraySumaColumnes[5] + " " + arraySumaColumnes[8]
        // missatge = a + "<br>" + "Suma: " + suma
    // console.log(missatge)
    terminal.innerHTML = missatge + "<br>" 
}


function ex6(){
    let arrayNum = inicialitzarArrayBi(3,6,"contador")
    let missatge = "";
    // let max = arrayNum[0][0];
    let files = arrayNum.length;
    let columnes = arrayNum[0].length;
    let max;
    for(let i = 0; i <  files; ++i){
        max = Math.max(...arrayNum[i]);
            for(let j = 0; j <  columnes; ++j){
            }
            missatge += arrayNum[i] + "<br>"
            
    }
    missatge += max;
    terminal.innerHTML = missatge;
}

function ex7(){
    let arrayNum = inicialitzarArrayBi(3,6,"contador")
    let missatge = "";
    let files = arrayNum.length;
    let columnes = arrayNum[0].length;

    let num = 1;
    let superiors = 0;
    
    for(let i = 0; i <  files; ++i){
            for(let j = 0; j <  columnes; ++j){
                if (arrayNum[i][j] > num) ++superiors;
            }
            missatge += arrayNum[i] + "<br>"
            
    }
    missatge += superiors;
    terminal.innerHTML = missatge;
}

function ex8(){
    let arrayNum = inicialitzarArrayBi(3,3,"contador")
    let missatge = "";
    let files = arrayNum.length;
    let columnes = arrayNum[0].length;

    let t = [];
    
    for(let i = 0; i <  files; ++i){
            for(let j = 0; j <  columnes; ++j){
                t = arrayNum[i][j]
                arrayNum[i][j] = arrayNum[j][i]
                arrayNum[j][i] = t
                missatge += arrayNum[j][i] + " "
            }
            missatge += " " + "<br>"
            
    }
    console.log(arrayNum)
    // missatge += superiors;
    terminal.innerHTML = missatge;
}

// ex9
function executar(){
    let arrayNum = inicialitzarArrayBi(3,3,"contador")
    let missatge = "";
    let files = arrayNum.length;
    let columnes = arrayNum[0].length;

    
    for(let i = 0; i <  files; ++i){
            for(let j = 0; j <  columnes; ++j){
                arrayNum[i].reverse()
                missatge += arrayNum[i][j] + " "
            }
            missatge += " " + "<br>"
            
    }
    console.log(arrayNum)
    // missatge += superiors;
    terminal.innerHTML = missatge;
}



// 7 - Comptar elements més grans que X
// Donada una matriu i un número X, compta quants elements són més grans que X.

// 8 - Transposar una matriu quadrada
// Intercanvia files per columnes (és a dir, converteix una matriu [i][j] en [j][i]).

// 9 - Invertir els elements de les files de la matriu
// Donada una matriu, inverteix l’ordre dels elements de cada fila.








// j fins a i

// Invertir
// t = a[i][j]
// a[i][j] = a[i][col-j-1]