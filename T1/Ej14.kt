package T1

import java.text.DecimalFormat

fun main() {
    var totalVentas = 0.0

    print("Introduce cuantas ventas ha tenido el comercial: ")
    for (indice in 1..readln().toInt()) {
        print("Introduce el precio de la venta #$indice: ")
        totalVentas += readln().toDouble()
    }

    println("El total de ventas es de ${DecimalFormat("#.##").format(totalVentas)}€")
}