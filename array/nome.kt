fun main(){
    val nomes = arrayOf("João", "Maria Inês", "Roberto", "Cristian", "Alice", "Clara")
    println(nomes[1])
    nomes[1] = "Karla" //alterando valor pelo indice
    println(nomes[1]) 

    println(nomes.size) //tamanho array - 6 elementos

    //verificando um elemento
    if("Maria Inês" in nomes){
        println("Existe!")
    }else{
        println("Não existe!")
    }


    for(n in nomes){
        println(n)
    }
}
