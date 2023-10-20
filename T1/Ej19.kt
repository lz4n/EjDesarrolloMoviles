package T1

import kotlin.math.pow

var operando1 = 0.0
var operando2 = 0.0
fun main() {
    pedirOperandos()

    while (true) {
        print("""
            Menú:
            1: suma los operandos.
            2: resta los operandos.
            3: multiplica los operandos.
            4: divide los operandos
            5: potencia (1º operando como base y 2º como exponente).
            6: módulo, resto de la división entre operando1 y operando2.
            7: pedir 2 operandos nuevos
            8: Salir
            ¿Qué quieres hacer? 
        """.trimIndent())

        when (readln()) {
            "1" -> println("$operando1 + $operando2 = ${operando1 + operando2}")
            "2" -> println("$operando1 - $operando2 = ${operando1 - operando2}")
            "3" -> println("$operando1 * $operando2 = ${operando1 * operando2}")
            "4" -> println("$operando1 / $operando2 = ${operando1 / operando2}")
            "5" -> println("$operando1 ^ $operando2 = ${operando1.pow(operando2)}")
            "6" -> println("$operando1 % $operando2 = ${operando1 % operando2}")
            "7" -> pedirOperandos()
            "8" -> break
            else -> println("Opción desconocida.")
        }
    }
}

fun pedirOperandos() {
    print("Introduce el operando1: ")
    operando1 = readln().toDouble()

    print("Introduce el operando2: ")
    operando2 = readln().toDouble()

}