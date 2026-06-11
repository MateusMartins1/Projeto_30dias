import LogicaDeProgramação.calcImc
import LogicaDeProgramação.convMoeda
import LogicaDeProgramação.conversor
import LogicaDeProgramação.soma

fun design() {
    println("Seja bem vindo ao projeto de 30 dias de logica com Mateus")
    println("Aqui temos projetos iniciais")
    println("Projeto 1: Calculadora de soma")
    println("Projeto 2: Conversor de Celsius para Fahrenheit")
    println("Projeto 3: Calculadora de IMC")
    println("Projeto 4: Conversor de moeda")

    println("Selecione o Projeto que deseje testar")
    var escolha = readLine()!!.toInt()

    if (escolha == 1) {
        soma()
    }
    if (escolha == 2) {
        conversor()
    }
    if (escolha == 3) {
        calcImc()
    }
    if (escolha == 4) {
        convMoeda()
    }
}