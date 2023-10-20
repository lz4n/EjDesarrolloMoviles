package T1

fun main() {
    val texto: String

    print("Introduce una frase: ")
    texto = readln()

    println("La frase sin espacios es: ${texto.replace(" ", "")}")
}