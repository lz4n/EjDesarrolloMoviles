package T1

fun main() {
    var suma = 0
    var sumaPositivos = 0
    var sumaNegativos = 0
    var mayor = 0
    var menor = 0
    var num : Int

    do {
        print("Introduce un número: ")
        num = readln().toInt()
        if (num != -1) {
            if (suma == 0) {
                menor = num
                mayor = num
            } else {
                if (menor > num) menor = num
                if (num > mayor) mayor = num
            }
            suma += num;
            if (num >= 1) sumaPositivos += num
            if (num <= -1) sumaNegativos += num
        }
    } while (num != -1)

    print("""
        El menor es: $menor
        El mayor es: $mayor
        La suma es: $suma
        La suma de los positivos es $sumaPositivos
        La suma de los negativos es $sumaNegativos
    """.trimIndent())
}