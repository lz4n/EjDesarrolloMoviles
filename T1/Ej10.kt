package T1

fun main() {
    var num: Int

    do {
        print("Introduce un numero (mayor o igual a 0): ")
        num = readln().toInt()
    } while (num < 0)
    println("Gracias!")
}