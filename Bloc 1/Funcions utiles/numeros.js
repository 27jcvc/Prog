// Posicio  return pos / -1
// filtrat
// existeix (a, e) return true / false


// un unic ejerici o varios entra todo fins a arrays i funcions
// condicionals bucles, regex muy simple



// Expresions regulars
// Qualsevol separador /s (tabulador, espai, salt de linia)
// /\s*,\s*/
// * 0 a N
// + 1 a N
// 

function ordenarArrayAmbSort(){
    // aO = a.filter((a,b) => a-b);
    // min = a.filter((a,b) => a<b);
    aO = a.sort((a,b) => a-b);
}


function calcularMaxMin(array){
    let max = array[0];
    let min = array[0];
    
    // min = Math.min(...array);
    // max = Math.max(...array);
    
    for(let element of array){
        max = Math.max(max, element);
        min = Math.min(min, element);
    };
    

    // for(let i = 0; i < array.length; ++i){
    //     if (array[i] < min) min = array[i];
    //     else if (array[i] > max) max = array[i];
    // }
}


// Convertir de string a array
function strAarrToNumArr(_array_){
    let NouArray = []
    for(let i = 0; i < _array_.length; ++i){
        NouArray.push(parseInt(_array_[i]))
    }
    return NouArray;
}
