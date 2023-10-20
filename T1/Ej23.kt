package T1

fun main() {
    print("Escribe una frase: ")

    for (palabra in readln().split(" ")) {
        println(palabra)
    }
}