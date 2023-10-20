package T1

fun main() {
    var cantidadNumeros = 0

    print("""
        Introduce valor numérico + Enter. Valor numérico + Enter...
        Cuando quieras terminar, teclea -1 + Enter.
        
    """.trimIndent())
    while (true) {
        if (readln().toInt() == -1) {
            break
        } else {
            cantidadNumeros++
        }
    }
    print("Fin, has introducido $cantidadNumeros números")
}