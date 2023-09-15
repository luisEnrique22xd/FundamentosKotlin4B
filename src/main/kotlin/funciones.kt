fun main(){
    println("Hello")
    sayHello()
    sayHelloTo(name = "Luis")
    sayHelloToFrom(name = "Luis", city = "Huamantla")
    println("El doble de 25 es ${duplicate(25)}")
    val result = divide(num1 = 99, num2 = 15.0)
    println("El resultado de 99/15 es $result")
    println(fullName("Luis", "Sanchez"))
    wellcomeToMexico()
    wellcomeToMexico("Kevin Parker from Tame Impala")
    sayHelloToFrom(name = "Rick Sanchez", city = "America")
    sayHelloToFrom(city = "Australia", name="Kevin Parker")


}
// functions without params and without return

fun sayHello(){
    println("Hello!")
}

//function with params and without return
fun sayHelloTo(name:String){
    println("Hello $name")
    println("Wellcome")
}

fun sayHelloToFrom(name: String,city:String){
    println("Hello $name from $city")
}

//fuctions with return
//We must specify the datatype

fun duplicate(num: Int): Int {
    return num * 2
}

fun divide(num1:Int, num2:Double):Double{
    return num1/num2
}

fun fullName(firstName:String, lastName:String):String{
    return "$firstName $lastName"
}

//functions with optional params

fun wellcomeToMexico(name: String = "Invitado"): Unit {
    println("Wellcome to Mexico $name")
}