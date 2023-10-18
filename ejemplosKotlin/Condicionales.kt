package ejemplosKotlin

fun main() {
    print("Ingrese un número: ")
    val num: Int = readln().toInt()
    if (num < 0) {
        println("El número es negativo")
    } else if (num == 0) {
        println("El número es 0")
    } else {
        println("El número es positivo")
    }

    separador()

    val array: MutableList<Int> = ArrayList();
    var num2: Int
    do {
        print("Ingrese un número (0 para dejar de insertar): ")
        num2 = readln().toInt()
        if (num2 != 0) {
            array.add(num2)
        }
    } while (num2 != 0)
    print("Ingrese un número para buscar en el array: ")
    num2 = readln().toInt()
    if (num2 in array) {
        println("$num2 está contenido en $array")
    } else {
        println("$num2 no está contenido en $array")
    }

    separador()

    val operador1 = 2
    val operador2 = 3
    print("Introduce la operacion (+, -, *, /): ")
    val operacion: String = readln()
    val resultado = when (operacion) {
        "+" -> operador1 + operador2
        "-" -> operador1 - operador2
        "*" -> operador1 * operador2
        "/" -> operador1 / operador2
        else -> "Operador '$operacion' desconocido."
    }
    println("$operador1 $operacion $operador2 = $resultado")
}

fun separador() {
    println("\n----------------------------------------------------------\n")
}