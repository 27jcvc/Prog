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

// Expresions regulars
// Qualsevol separador /s (tabulador, espai, salt de linia)
// /\s*,\s*/
// * 0 a N
// + 1 a N
// 


// function furula(){
//     let a = ["1", "2", "3", "4", "5"];
//     let missatge = "";
//     missatge = strAarrToNumArr(a);
//     console.log(strAarrToNumArr(a));
//     terminal.innerHTML = missatge;
// }

function ex2(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme..."
    ivalor1.value = FRASE; 
    let array = FRASE.split(" ")
    let missatge = ""
    missatge += array
    terminal.innerHTML = missatge;
}

function ex3(){
    let valor = ivalor1.value.trim();
    let array = [];
    let missatge = "";

    function afegir(array, paraula){
        array.push(paraula);
    }
    function llistar(array){
        let resultat = array.join(", ");
        return resultat;
    };
}

function ex4(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme".toUpperCase();
    let paraula = (ivalor1.value).trim().toUpperCase() //.split(Expresion); Es mejor no reutilizar variables... resposta...
    let missatge = "";
    let array= []
    let idx = -1

    if(paraula == ""){
        alert("Introdueix un valor");
        return;
    }

    missatge += "Introdueix alguna paraula d'aquesta frase <br>"
    missatge += "Frase: "+ FRASE[0].toUpperCase() + FRASE.substring(1,FRASE.length).toLowerCase() + "<br>"
    terminal.innerHTML = missatge
    array = FRASE.split(" ");

    idx = array.indexOf(paraula);

    if(idx > -1) idx+=1;
    missatge += "Posició: " + idx;

    // missatge += (paraula.includes(array)) ? ((array.indexOf(paraula))+1) : array.indexOf(paraula);
    terminal.innerHTML = missatge;
}

function strAarrToNumArr(_array_){
    let _element_ = []
    for(let i = 0; i < _array_.length; ++i){
        _element_.push(parseInt(_array_[i]))
    }
    return _element_
}

function calcularMaxMin(){
    let max = _array_[0];
    let min = _array_[0];
    
    min = Math.min(..._array_);
    max = Math.max(..._array_);
    
    for(let element of _array_){
        max = Math.max(max, element);
        min = Math.min(min, element);
    };
    

    for(let i = 0; i < _array_.length; ++i){
        if (_array_[i] < min) min = _array_[i];
        if (_array_[i] > max) max = _array_[i];
    }

}

function ex5(){
    ivalor1.value = "1, 2, 3, 4, 5, 6, 7, 8, 9, 140, "
    let num = ivalor1.value.trim();
    let arrayNumeric = []
    let missatge = "";



    arrayNumeric = strAarrToNumArr(num.split(", "));
    
    let max = arrayNumeric[0];
    let min = arrayNumeric[0];

    for(let i = 0; i < arrayNumeric.length; ++i){
        if (arrayNumeric[i] < min) min = arrayNumeric[i];
        else if (arrayNumeric[i] > max) max = arrayNumeric[i];
    }
    

    missatge += max + "<br>"
    missatge += min + "<br>"


    missatge += "Array: " + arrayNumeric.sort((a, b) => (a - b))

    
    terminal.innerHTML = missatge
    console.log(arrayNumeric)
    // 5 - Introduir un conjunt de números enters separats amb comes. Crear un array amb aquests valors.
    // Mostrar el número més gran i el més petit.
}

function ex6(){
    ivalor1.value = "9, 2, 5, 4, 3, 80, 7, 6, 127, "
    let num = ivalor1.value.trim();
    let arrayNumeric = []
    let arrayNumericOrdenat;
    let missatge = "";

    arrayNumeric = strAarrToNumArr(num.split(", "));
    arrayNumericOrdenat = arrayNumeric.sort((a, b) => (a - b))

    missatge += "Array: " + arrayNumeric
    missatge += "<br>Array reverse: " + arrayNumeric.reverse()

    terminal.innerHTML = missatge
    console.log(arrayNumeric)
    // 5 - Introduir un conjunt de números enters separats amb comes. Crear un array amb aquests valors.
    // Mostrar el número més gran i el més petit.


}

function ex7(){
    // ivalor1.value = "9, 2, 5, 4, 3, 8, 7, 6, 1, "
    let num = ivalor1.value.trim();
    num = parseInt(num);
    if (isNaN(num)){
        terminal.innerHTML = "S'ha de introduir un numero";
        return;
    };

    let arrayNumeric = []
    let missatge = "";

    arrayNumeric = strAarrToNumArr(num.split(", "));
    let parells = []
    let imparells = []
    
    for(let element of arrayNumeric){
        if((element % 2) == 0) parells.push(element);
        else imparells.push(element);
    }

    missatge += "Array: " + arrayNumeric + "<br>"
    missatge += "Parells: " + parells + "<br>"
    missatge += "Imparells: " + imparells + "<br>"

    terminal.innerHTML = missatge

}

function ex8(){
    // fet
}

function executar(){
    // No funciona si estan desordenados
    ivalor1.value = "1, 8, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 9"
    let num = ivalor1.value.trim();
    let numArray = num.split(", ")
    
    let arrayNumeric = [];
    let missatge = "";
    let pos = 1
    
    for(let i = 0; i < numArray.length; ++i){
        numArray[i] = parseInt(numArray[i]);
        if (isNaN(numArray[i])){
            terminal.innerHTML = "Error...";
            return;
        };
    }
    

    // files = a.lenght
    // columnes =a[0].lenght

    // for(let element of arrayNumeric){
    //     if(num == element)
    //         arrayNumeric.push(num);
    // };

    for(let i = 0; i < numArray.length; ++i){
        if(numArray[pos] != numArray[i])
            arrayNumeric.push(numArray[i]);
        ++pos
    }
    
    // for(let i = 0; i < arrayNumeric.length; ++i){
    //     arrayNumeric[i] = (num == )
    //     if(num == arrayNumeric[i]){
    //         arrayNumeric[i].pop();
    //     }
    // }
    missatge += "Numeros: " + num + "<br>";
    missatge += "Array: " + arrayNumeric + "<br>";
    missatge += "Array: " + numArray + "<br>";
    console.log(numArray)

    terminal.innerHTML = missatge
    
    
    
}
