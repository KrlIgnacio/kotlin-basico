fun main(){
    var dado: Int
    var tentativas = 0

        while(true){
            dado = (1..6).random()
            tentativas++

            println("Tentativa $tentativas: Resultado do dado -> $dado")

            if(dado == 6){
                println("Parabéns! Você conseguiu um 6 após $tentativas tentativas.")
                break
            }
        }
}