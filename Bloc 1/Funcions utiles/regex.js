 // 8 dígits + 1 lletra majúscula

let regex1 = /^\d{8}[A-Z]$/

// 2. Especial (K, L, M, X, Y, Z + 7 dígits + 1 lletra majúscula no I, O, U):

let regex2 = /^[KLMXYZ]\d{7}[A-HJ-NP-TV-Z]$/

// 🔹 Matrícula de cotxe

// 1. Format actual (4 dígits - 3 lletres majúscules):

let regex3 = /^\d{4}-[A-Z]{3}$/

// 2. Format antic (1-2 lletres - 4 dígits - 1-2 lletres):

let regex4 = /^[A-Z]{1,2}-\d{4}-[A-Z]{1,2}$/

// 🔹 Correu electrònic

// 1. Professors (minúscules, opcionalment números al final):

let regex5 = /^[a-z]+\d*@sapa\.cat$/

// 2. Alumnes (minúscula + punt + minúscules + opcionalment números):

let regex6 = /^[a-z]\.[a-z]+\d*@sapa\.cat$/

// 3. Qualsevol correu:

let regex7 = /^[\w.-]+@[\w.-]+\.\w{2,}$/

// 🔹 Número

// 1. Enter (positiu o negatiu):

let regex8 =/^-?\d+$/

// 2. Amb o sense decimals (positiu o negatiu):

let regex9 = /^-?\d+(\.\d+)?$/

// 🔹 Data

// 1. dd-mm-aaaa o d-m-aa:

let regex10 =/^[0-3]?\d-[01]?\d-(\d{2}|\d{4})$/

// 2. Separat per \:

let regex11 = /^[0-3]?\d\\[01]?\d\\(\d{2}|\d{4})$/

// 3. Format "Dilluns, 7 de abril de 2025":

let regex12 = /^(Dilluns|Dimarts|Dimecres|Dijous|Divendres|Dissabte|Diumenge),\s[0-3]?\d\sde\s(gener|febrer|març|abril|maig|juny|juliol|agost|setembre|octubre|novembre|desembre)\sde\s\d{4}$/

// 🔹 Bucle for

// let regex13 = /^for\s*\(.*;.*;.*\)\s*\{.*\}$/

// 🔹 Array de Java (enter, real o text)

let regex14 = /^(int|float|double|String)\[\]\s[_a-zA-Z][_a-zA-Z0-9]*\s=\snew\s\1\[\d+\];$/

// 🔹 Text

// 1. Comença amb "ABC" i acaba amb "789":

let regex15 = /^ABC.*789$/

// 2. Comença amb A, B o C i acaba amb 7, 8 o 9:

let regex16 = /^[ABC].*[789]$/

// 🔹 Graduació d'escalada

// 1. Francesa:

let regex17 = /^(4\+?|5[abc]\+?|6[abc]\+?|7[abc]\+?|8[abc]\+?|9[abc]\+?)$/

// 2. Estatunidenca:

let regex18 = /^5\.(9|1[0-5](a|b|c|d)?)$/

// 3. Una sola expressió que valida qualsevol de les dues:

let regex19 = /^(4\+?|5[abc]\+?|6[abc]\+?|7[abc]\+?|8[abc]\+?|9[abc]\+?|5\.(9|1[0-5](a|b|c|d)?))$/