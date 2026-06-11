package LogicaDeProgramação
//Conversor de moeda
fun convMoeda () {
    println("digite o valor em dolar")
    var dollar = readLine()!!.toFloat()
    var  real = 5.10
    var valor = dollar * real

    println("você possui $valor")
}
