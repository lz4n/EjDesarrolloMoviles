package T1

fun main() {
    while (true) {
        print("""
            ¿Cuál es la capital de Colombia?
            a. La Paz
            b. Buenos Aires
            c. La Habana
            d. Bogotá
            Respuesta: 
        """.trimIndent())
        if (readln() == "d") {
            println("¡Felicitaciones!")
            break
        }
        println("Error")
    }
}