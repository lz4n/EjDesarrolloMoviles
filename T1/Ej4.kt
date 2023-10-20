package T1

fun main() {
    val num1: Int
    val num2: Int

    print("Introduce el número 1: ")
    num1 = readln().toInt()

    print("Introduce el número 2: ")
    num2 = readln().toInt()

    if (num1 > num2) {
        println("$num1 > $num2")
    } else if (num1 < num2) {
        println("$num1 < $num2")
    } else {
        println("$num1 = $num2")
    }
}