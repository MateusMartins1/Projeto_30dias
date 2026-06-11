package LogicaDeProgramação

//Calculadora de soma

fun soma(){
    println("digite o primero numero")
    val a = readLine()!!.toInt()
    println("Digite o Segundo numero")
    val b = readLine()!!.toInt()

    val c = a + b
    println("A soma dos numeros foi $c")
}

