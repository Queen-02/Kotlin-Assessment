fun main() {
    strings()

    //Question2
    var remainder = divide(12, 5)
    println(remainder)

    //Question3
    var credits = credentials("Quienzy", 23)
    println(credits)

    //Question4
    var string = length("Mesopotamia")
    println(string)
}
 fun strings(){
    var name = "codeHive"
    var char = name[4].toString() + name[5] + name[6] + name[7]
     println(char)
 }

fun divide (a: Int, b: Int): Int{
    var division = a%b
    return division
}

fun credentials(name: String, age: Int):String {
    var greet = "Hi my name is $name and I am $age years old"
    return greet
}

fun length(name2:String):Int{
    var size = name2.length
    return size

}