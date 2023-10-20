package T1

fun main() {
    val clave = "1234"

    for (intentos in 3 downTo 1) {
        print("Introduce la clave: ")
        if (readln() == clave) {
            println("Has acertado")
            return
        } else {
            println("Has fallado, te quedan ${intentos -1} intentos")
        }
    }
    println("Te has quedado sin intentos")
}