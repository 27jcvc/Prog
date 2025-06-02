function ordenarArrayAmbSort(){
    // aO = a.filter((a,b) => a-b);
    // min = a.filter((a,b) => a<b);
    aO = a.sort((a,b) => a-b);
}

/**
 * Filtrar per primera lletra
 * @param {*} _array_ 
 * @param {*} _lletra_ 
 * @returns 
 */
function filtrarLletraPrimeraArray(_array_, _lletra_){
    let nouArray = [];
    for(e of _array_)
        if(e.toUpperCase().charAt(0) == _lletra_.toUpperCase()){
            nouArray.push(e);
        }
        return nouArray
};

// donde comienza la palabra mancha 
// donde acaba 
// substring con los dos valores
function encontrarParaula(_paraula_){
    let text = "En un lugar de la mancha de cuyo nombre no quiero acordarme..."

    let ini = text.indexOf(_paraula_)
    let fin = _paraula_.length + ini

    console.log(ini + " " + fin);
    console.log(text.substring(ini, fin));
}

encontrarParaula("mancha");

function numRandomEntreUnMargen(_min_, _max_, _vegades_){
    /**
 * Solo nos saldran numeros entre 1 y 6
 */
    // if(!(n >= _min_ && n <= _max_)){
    //     alert("num incorrecte")
    // }

for(let i = 0; i < _vegades_; ++i){
    let n = Math.floor((Math.random() * (_max_ - _min_ + 1) + _min_));
    console.log("num: " + n);
}
    console.log("veces que ha sortit: " + _vegades_);
}

numRandomEntreUnMargen(6, 10 , 20)

function vegadesNumRandom(_min_, _max_, _vegades_, _num_){

    // if(!(n >= _min_ && n <= _max_)){
    //     alert("num incorrecte")
    // }
    let contador = 0
for(let i = 0; i < _vegades_; ++i){
    let n = Math.floor((Math.random() * (_max_ - _min_ + 1) + _min_));
    console.log("num: " + n);
    if (n == _num_) ++contador;
}
    console.log("veces que ha sortit: " + contador);
}
vegadesNumRandom(0, 10, 10, 5)

function numMesSortit(_min_, _max_, _vegades_){

    let arrayNums = []
    let masSortit = []
    for(let i = 0; i < _vegades_; ++i){
        let n = Math.floor((Math.random() * (_max_ - _min_ + 1) + _min_));
        arrayNums.push(n);
    }
    // masSortit.push(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
    
    // math.max y el nuemero 
    // for let i y la posicion es donde se encuentra el numero mas grande
    
    // console.log("veces que han sortit: " + num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
    // console.log("num que més ha sortit: " + masSortit);
    
}
numMesSortit(0, 10, 10)






function comptarConsonatsVocalsiSimbols(){
    const FRASE = "En un lugar de la mancha de cuyo nombre no quiero acordarme...".toUpperCase()
    let missatge
    let vocals = 0
    let consonants = 0
    let simbols = 0

    for(let i = 0; i < FRASE.length; ++i){
        // Vocals
            // if(FRASE.charAt(i) == 'A' || FRASE.charAt(i) == 'E' || FRASE.charAt(i) == 'I' || FRASE.charAt(i) == 'O' || FRASE.charAt(i) == 'U'){
        if(("AEIOU").includes(FRASE[i])){
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