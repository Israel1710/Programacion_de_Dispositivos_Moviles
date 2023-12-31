fun main() {

    println("Hola UPIICSA")

    //Variables
    var myString = "Esto es una cadena de texto"
    myString = "Aqui cambia el valor de la cadena de texto"
    // myString = 6 Error
    println(myString)

    var myString2: String = "Esta es otra cadena de texto"
    println(myString2)

    var myInt = 7
    myInt = myInt + 4
    println(myInt)
    println(myInt - 1)
    println(myInt)

    var myInt2 : Int = 5
    println(myInt2)

    var myDouble = 6.5
    println(myDouble)

    myDouble = 6.0
    println(myDouble)

    var myDouble2: Double = 6.5
    var myFloat = 6.5f

    var myBool = false
    myBool = true
    println(myBool)

    //Constantes

    val myConst = "Mi propiedad constante"
    // myConst = "Mi nueva propiedad constante" Error

    //Control de flujo

    if (myInt == 10 && myString == "hola") {
        println("El valor es 10")
    } else if (myInt == 11 || myString == "hola") {
        println("El valor es 11")
    } else {
        println("El valor no es ni 10 ni 11")
    }

    // Lista

    val myList = mutableListOf("Israel", "Peña", "Valdez")
    println(myList[1])
    myList.add("Israel")
    println(myList)

    // Sets

    var mySet = setOf("Israel", "Peña", "Valdez", "Israel")
    println(mySet)

    // Mapas

    val myMap = mutableMapOf("Israel" to 19, "Grecia" to 15, "Asiel" to 13)
    myMap["Juan"] = 40
    println(myMap["Israel"])

    // Bucles

    for (value in myList) {
        println(value)
    }

    for (value in mySet) {
        println(value)
    }

    for (value in myMap) {
        println(value)
    }

    var myCounter = 0

    while (myCounter < myList.count()) {
        println(myList[myCounter])
        myCounter++
    }

    // Opcionales

    var myOptional: String? = null
    println(myOptional)
    myOptional = "Mi cadena de texto opcional"
    println(myOptional)

    // Funciones

    myFunction()

    // Clases

    var myClass = MyClass(name = "Israel", age = 19)
    println(myClass.age)
}

fun myFunction() {
    println("Esto es una funcion")
}

// Clases

class MyClass(val name: String, val age: Int) {

}