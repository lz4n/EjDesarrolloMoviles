package T1

fun main() {
    val  min: Double
    val max: Double

    print("Introduce el valor mínimo: ")
    min = readln().toDouble()

    print("Introduce el valor máximo: ")
    max = readln().toDouble();

    for (indice in 1..10) {
        println("Número aleatorio #$indice: ${Math.random() * (max - min) + min}")
    }
}