package T1

fun main() {
    val num: Int

    print("Introduce un número: ")
    num = readln().toInt()

    if (num % 2 == 0) {
        println("$num es divisible entre 2")
    } else {
        println("$num NO es divisible entre 2")
    }
}