fun main (){
    println("Hello word")
//variables
// val para declarar constantes (solo lectura)
// var para variables
    val pi=3.1416
    var x = 34

    println(pi)
    x = 24
    x = x+1
    x ++
    x --
    x +=10
    x -=2
    x *=2
    x /=5
    println(x)

    val firstName="Luis"
    val lastName:String = "Sanchez"
    val fullName = firstName + " " + lastName
    println(fullName)
    val  age: Int = 18
    val  height: Double = 1.68
    var stars = 10

    //String Templates
    //$ para imprimir variables
    //${} para procesar antes de imprimir

    println("I'm $age years old")
    println("I'm $height de altura")
    println("Obtendre un ${stars + 1} de 10")


}