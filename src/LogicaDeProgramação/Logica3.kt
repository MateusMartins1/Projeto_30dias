package LogicaDeProgramação
//Calculadora de IMC
fun calcImc () {
    println("digite sua altura")
    var altura = readLine()!!.toFloat()
    println("digite seu peso")
    var peso = readLine()!!.toFloat()
    var imc = peso / (altura * altura)
    println("seu IMmc é $imc")
}