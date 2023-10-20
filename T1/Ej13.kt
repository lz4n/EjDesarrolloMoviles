package T1

fun main() {
    print("Introduce un día de la semana: ")
    print("${when (readln().lowercase()) {
        "lunes", "martes", "miercoles", "jueves", "viernes" -> "SI"
        "sábado", "domingo" -> "NO"
        else -> "*día desconocido*"
    }} es laborable")
}