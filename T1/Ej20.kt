package T1

fun main() {
    val num: Int

    print("Introduce un número: ")
    num = readln().toInt()

    println("La suma desde 1 hasta $num es: ${sumaRecursiva(num)}")
}

fun sumaRecursiva(num: Int): Int {
    if (num == 1) return 1;
    return num + sumaRecursiva(num -1)
}