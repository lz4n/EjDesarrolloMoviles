package T1

fun main() {
    var texto = ""
    var frase: String

    while (true) {
        println("Introduce un texto, cadena vacía pra terminar:")
        frase = readln();
        if (frase.isEmpty()) {
            break
        }
        texto += "\t$frase\n"
    }

    println("\nCadena resultante:\n-------------")
    println(texto)
}