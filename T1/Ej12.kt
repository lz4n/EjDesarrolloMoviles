package T1

fun main() {
    print("Introduce un mes: ")
    print("Tiene ${when (readln().lowercase()) {
        "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre" -> 31
        "abril", "junio", "septiembre", "noviembre" -> 30
        "febrero" -> 29
        else -> "*mes desconocido*"
    }} días")
}