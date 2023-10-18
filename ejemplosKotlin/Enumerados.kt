package ejemplosKotlin

enum class Enumerados {
    VALOR1,
    VALOR2,
    VALOR3
}

fun main() {
    print("Inserta un valor del enumerado: ")
    val valorEnumerado = Enumerados.valueOf(readln())

    val respuesta = when (valorEnumerado) {
        Enumerados.VALOR1 -> "Valor 1"
        Enumerados.VALOR2 -> "Valor 2"
        Enumerados.VALOR3 -> "Valor 3"
    }
    println("$valorEnumerado = $respuesta")
}