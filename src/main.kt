fun main() {
    getOdds(1)
    var jina=namesArrays(arrayOf("virgyy","Njeri","Wanda","Happiness","vera"))
    print(jina)

    servinRobot(1)
    servinRobot(16)
    servinRobot(11)
    idadi()

}
fun getOdds(numbers:Int) {
    for (numbers in 1..100)//Create a function that prints out all the odd // numbers between 1 and 100 (2pts)
        if ((numbers % 2 !== 0))
            println(numbers)



}
fun namesArrays(names:Array<String>):Int{
    var jina= 0
    names.forEach {names->
        if (names. length >5){
            jina++
        }
    }
    return jina

}
fun servinRobot(age:Int){
    if (age<6){
        println("milk")
    }
    else if (age<15 &&age>6){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}
fun idadi() {
    for (num in 1..100) {
        if (num % 5 == 0) {
            println("Buzz")
            if (num % 3 == 0) {
                println("Fizz")
            }
            if (num % 3 == 0 && num % 5 == 0) {
                println("FizzBuzz")
            }
        }

    }
}