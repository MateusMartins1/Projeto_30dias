package LogicaDeProgramação
//Conversor de Celsius para Fahrenheit
//°F = (°C × 1,8) + 32

fun conversor() {
   println(" digite o valor em celcius")
    var celcius = readLine()!!.toFloat()

   var fahrenheit = (celcius * 1.8) + 32
    println("o valor de fahrenheit é $fahrenheit")

}