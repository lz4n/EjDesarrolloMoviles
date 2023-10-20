package T1

import kotlin.math.sqrt

fun main() {
    val valorMin : Int

    print("Introduce el valor mínimo: ")
    valorMin = readln().toInt()
    print("Introduce el valor máximo: ")

    for (num in valorMin..readln().toInt() step if (valorMin % 2 == 0) 1 else 2) {
        if (esPrimo(num)) {
            println(num)
        }
    }

    fun esPrimo(num: Int): Boolean {
        if (num <= 1) return true
        if (num == 2) return true
        if (num % 2 == 0) return false

        var raiz = sqrt(num.toDouble()).toInt()
        for (indice in 3..raiz) {
            if (num % indice == 0) return false
        }
        return true
    }
}