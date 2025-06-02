"use strict";


const iNom = document.getElementById("nom");
const iPlataforma = document.getElementById("plataforma");
const iAny = document.getElementById("any");
const iDescripcio = document.getElementById("descripcio");


// Botó per executar l'aplicació
const bAfegir = document.getElementById("afegir");
const bBuscar = document.getElementById("buscar");
const bEsborrar = document.getElementById("esborrar");
const bLlistar = document.getElementById("llistar");
// Element on mostrar el resultat
const terminal = document.getElementById("terminal");


bAfegir.addEventListener("click", afegir)
bBuscar.addEventListener("click", buscar)
bEsborrar.addEventListener("click", esborrar)
bLlistar.addEventListener("click", llistar)


// No s'han de tenir en compte majúscules ni minúscules 
// ni espais addicionals al principi o al final.

const videojocs = [
	{
		nom: "The Legend of Zelda",
		plataforma: "Nintendo Switch",
		any: 2017,
		genere: "Aventures"
	},
	{
		nom: "DOOM",
		plataforma: "PC",
		any: 2020,
		genere: "Shooter"
	},
	{
		nom: "The Witcher",
		plataforma: "PS4",
		any: 2015,
		genere: "Rol"
	},
	{
		nom: "The Witcher 2",
		plataforma: "PS4",
		any: 2015,
		genere: "Rol"
	}
];

function llistar(){
	let missatge = "";
	missatge += mostrarVideojocs()
	terminal.innerHTML = missatge
}	

function afegir(){
	let missatge = "";
	missatge += ""

	let videojoc = fomatarDadesIntroduides();
	if(isNaN(videojoc.any) || videojoc.any > 2025 || videojoc.nom == null || videojoc.genere == null){ // || videojoc.any.length != 4
		alert("El any no es correcte o falta alguna dada")
		return
	}
		videojocs.push(videojoc)
		missatge += "Videojoc afegit correctament"
	terminal.innerHTML = missatge
}

function buscar(){
	let missatge = "";
	let dades = fomatarDadesIntroduides();
	let trobat = false;
	for(let e of videojocs){
		if(e.any == dades.any || e.plataforma == dades.plataforma || e.genere == dades.genere){
			trobat = true;
			missatge += "Nom: " + e.nom +" <br>" +
			"Plataforma: " + e.plataforma +" <br>" +
			"Any: " + e.any +" <br>" +
			"Genere: " + e.genere +" <br>" +" <br>"; 
		}
	}
	if(!trobat){
		missatge += "No s'ha trobat cap que coïncideixi amb les dades introduïdes."
	}
	terminal.innerHTML = missatge
}

function esborrar(){
	let videojoc = fomatarDadesIntroduides();
	let missatge = "";
	for(let i = 0; i < videojocs.length; ++i){
		if (videojoc.nom == videojocs[i].nom){
			videojocs.splice(i, 1)
			missatge += "Videojoc eliminat correctament"
		}
	}
	missatge = (missatge == "") ? "No s'ha trobat el videojoc" : missatge;
	terminal.innerHTML = missatge
}




function fomatarDadesIntroduides(){
	let dades = 	{
		nom: iNom.value.trim().toUpperCase(),
		plataforma: iPlataforma.value.trim().toUpperCase(),
		any: parseInt(iAny.value.trim()),
		genere: iDescripcio.value.trim().toUpperCase()
	}

	return dades
}

function mostrarVideojocs(){
	let missatge = "";
	for(let e of videojocs){
        missatge += "Nom: " + e.nom +" <br>" +
                    "Plataforma: " + e.plataforma +" <br>" +
                    "Any: " + e.any +" <br>" +
                    "Genere: " + e.genere +" <br>" +" <br>"; 
    }
	return missatge
}