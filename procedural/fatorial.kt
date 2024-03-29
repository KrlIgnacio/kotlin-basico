
fun calcularFatorial(numero: Int): Int{
    if(numero == 0){
        return 1
    }else{
        return numero * calcularFatorial(numero - 1)
    }
}

fun main(){
    val num = 8
    val resultado = calcularFatorial(num)
    println("O fatorial de $num é $resultado")
}