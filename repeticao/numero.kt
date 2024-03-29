
import kotlin.io.readLine

fun main(){
    var numero: Int
    do{
        print("Digite um número maior que 10: ")
        numero = readLine()?.toIntOrNull() ?: 0
    } while(numero <= 10)

    println("Você digitou o número $numero, que é maior que 10.")
}