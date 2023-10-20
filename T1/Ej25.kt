package T1

import kotlin.math.sqrt

fun main() {
    print("Introduce un número: ")
    print("${if (esPrimo(readln().toInt())) "ES" else "NO ES"} primo")
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