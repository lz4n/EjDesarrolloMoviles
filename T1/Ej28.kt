package T1

fun main() {
    val frase: String
    val mayusculas: Boolean

    print("Introduce una frase: ")
    frase = readln()

    print("Mayúsculas o minúsculas (U/L): ")
    mayusculas = readln().uppercase().equals("U")

    println(if (mayusculas) frase.uppercase() else frase.lowercase())
}