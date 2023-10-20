package T1

import java.text.DecimalFormat

fun main() {
    var totalVentas = 0.0
    var entradaUsuario: String

    while (true) {
        print("Introduce el precio de la venta (* para salir): ")
        entradaUsuario = readln();
        if (entradaUsuario == "*") {
            break
        }
        totalVentas += entradaUsuario.toDouble()
    }

    println("El total de ventas es de ${DecimalFormat("#.##").format(totalVentas)}€")
}