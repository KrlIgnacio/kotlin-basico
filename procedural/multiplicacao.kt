
fun multiplicaNum(num1: Int, num2 :Int): Int{
    if(num1 == 0 || num2 == 0){
        return 0
    }else{
        return num1 * num2
    }
}

fun main(){
    var numero1 = 5
    var numero2 = 31
    val resultado = multiplicaNum(numero1, numero2)
    println(resultado)
}