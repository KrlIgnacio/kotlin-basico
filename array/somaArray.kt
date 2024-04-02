fun main(){
    val vetSoma = arrayOf(1, 2, 3, 4, 5)

    var soma = 0
    //loop para somar os elementos
    for(elemento in vetSoma){
        soma+= elemento
    }

    println("A soma dos elementos do array é: $soma")

}