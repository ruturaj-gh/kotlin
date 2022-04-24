fun main() {
    // basic syntax
    println("hello world")
    print(" ")
    println(sum(5, 6))
    println(multiply(90, 8))
    println(multiply2(40, 7))
    println(concatenate("ruturaj ", "ghumkar"))
    printSum(78,89)
    
//instance and objects of classes and calling them

    var obj=Rectangle(3.4,5.6) 
    println("the value of the perimeter is ${obj.perimeter}")
    print(obj.length)
    var obj2=outerclass.nestedclass()
    var obj3=outerclass()
    obj3.avs="the name"
    println(obj3.avs)
    
    println(obj2.aritist)
//testing when keyword
    val cake=3
    val birthday=when(cake){
        1->"brown"
        2->"red"
        3->"black forest"
        else->"chalta hai life hai"

    }
    println(birthday)
    //loops
    var i=0
    while(i<10){
        if(i==5){
            i=10
            continue
        }
        
        i++
        println(i)
    }
    //printing the whole alphabet
    for(char in 'a'..'x'){
        print(char)
        print(" ")
        //println("")
    }
    var days=arrayOf("monday","tuesday","wednesday")
    if("monday" in days){
        println("it does exist")
    }

    



    

    
    

    
    
}
fun sum(a: Int,b: Int)=a+b
fun multiply(a: Int ,b: Int )=a*b
fun multiply2(a: Int ,b:Int):Int{
    return a*b
}
fun concatenate(a: String,b: String):String{
    return a+b
}
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2 

}
class outerclass{
    var avs=""
    //testing getter and setter
    get()=field
    set(value){field=value}
    class nestedclass{
        var aritist:String="ruturaj"
    }
}
    
