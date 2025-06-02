/**
 * Minutos a horas:
 * Dividir los minutos entre 60 para conseguir las horas completas (división entera).
 * Usar el módulo (%) para obtener los minutos restantes.
 * @param {*} _MINUTOS_ minutos que convertiremos
 */
function min_A_horas(_MINUTOS_){
    let minutos = _MINUTOS_;
    let minutosRestantes = minutos % 60;

    console.log(minutos + " minutos equivalen a " + Math.floor(minutos / 60) + " horas con " + minutosRestantes +" minutos.");
}

min_A_horas(3600);
min_A_horas(500);
min_A_horas(760);

console.log("---");

/**
 * Horas a minutos:
 * Multiplicar las horas por 60.
 * @param {*} _HORAS_ 
 */
function horas_A_min(_HORAS_){
    let horas = _HORAS_;
    let minutos = horas * 60
    // Math.floor(horas / 60)
    console.log(horas + " horas equivalen a " + minutos + ".");
}

horas_A_min(1);
horas_A_min(2);
horas_A_min(3);
horas_A_min(4);
horas_A_min(5);
horas_A_min(2.5);




