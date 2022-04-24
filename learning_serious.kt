fun main(){
    var number=readLine()?:"0"
    var number2=readLine()?:"0"
    val result=number.toInt()+ number2.toInt()
    println(result)

    val shoplist =mutableListOf<String>("Lamborgini","mercedes","bmw")
    println(shoplist[0])
    shoplist.add("rolls royce")
    println(shoplist[3])

    var i=0
    while(shoplist.size!=i){
        println(shoplist[i])
        i++
    }

    
    val x=readLine()?:"0"
    val a=x.toInt()

    when(a){
        in 1..2 ->println("x is between 1 and 2")
        in 3..10->println("x is between 3 to 10")
        else ->{
            println("number is greater than 10")
        }

    }
    print10numbers()
    val nx=iseven(45)
    println(nx)

    val y=3
    println(y.isOdd())


    


}
fun iseven(num: Int ):Boolean{
    return num%2==0

}

fun Int.isOdd():Boolean{
    return this%2 ==1
}

fun print10numbers(){
    for(i in 1..10){
       println(i) 
    }
}