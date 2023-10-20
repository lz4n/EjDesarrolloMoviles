package T1

fun main() {
    var num = -1

    do {
        print("Introduce un numero (mayor o igual a 0): ")
        try {
            num = readln().toInt()
        } catch (x: NumberFormatException) {
            print("No es un número.")
        }
    } while (num < 0)
    println("Gracias!")
}