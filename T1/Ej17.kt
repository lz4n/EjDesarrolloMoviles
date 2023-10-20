package T1

import java.util.Arrays

fun main() {
    val texto: String
    var numVocales = 0
    var numConsonantes = 0
    var numEspacios = 0
    var numNumeros = 0

    print("Introduce una cadena de texto: ")
    texto = readln().lowercase();

    for (caracter in texto.toCharArray()) {
        if (caracter in arrayOf('a', 'e', 'i', 'o', 'u')) {
            numVocales++
        } else if (caracter.isDigit()) {
            numNumeros++
        } else if (caracter.isLetter()) {
            numConsonantes++
        } else if (caracter == ' ') {
            numEspacios++
        }
    }

    print("El texto tiene $numVocales vocales, " +
            "$numConsonantes consonantes, " +
            "$numNumeros numeros " +
            "y $numEspacios espacios")
}