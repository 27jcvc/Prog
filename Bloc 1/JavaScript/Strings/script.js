function numRandomEntreUnMargen(){
        /**
     * Solo nos saldran numeros entre 1 y 6
     */
    let min = 1
    let max = 6

    

    let vegades = 10
    for(let i = 0; i < vegades; ++i){
        let n = Math.floor((Math.random() * (max - min + 1) + min));

        if(!(n >= min && n <= max)){
            alert("num incorrecte")
        }
        
        console.log("num: " + n);
    }
    console.log("vegades: " + vegades);

    console.info("---");
}

numRandomEntreUnMargen()



function conseguirValorDeUnText(){
    let text = "hola";

    let s = text.charAt(3);

    console.log(s + "\n");
    console.info("---");
}
conseguirValorDeUnText()


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



