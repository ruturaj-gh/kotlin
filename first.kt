// fun main(args:Array<String>) {
//      var mylambdavar:(Int) -> Unit={i ->println(i)}
//      mylambda(10,23,mylambdavar)

//      var function:(String,String) -> Unit={a,b -> println("$a will develop $b")}
//      high("ios ","new products",function)
//      var a:String="lold"

//      myFunction({println("hello $a is not a word")},{println("okay it works")})
//      var bst:Array<String>={"a","b"}
//      bst.set(3, "string")
//      bst.set(1, "value")
//      bst.set(2, "value")

//      return b
    
//}
fun mylambda(num:Int,num2:Int,mylambdavar:(Int) -> Unit){

    val product=num*num2
    mylambdavar(product)

}

class MultiInit(name: String) {

    init {
        println("First initializer block that prints ${name}")
    }

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    var multiInit = MultiInit("Kotlin")
    multiInit.toString()

    val list=listOf(1,2,3,4,5,6)
    println("list of numbers is $list ")

    val list2=mutableMapOf<String,Int>("ruturaj" to 20,"sumedh" to 16)
    list2.put("niranjan", 16)
    println(list2.filter {it.key.length<7})
    
    println("list of string and age is ${list2}")


    var lambda:(Int)->Int={ a:Int -> a*4}
    println(lambda(34))
}
fun high(a:String,b:String,function:(String,String)->Unit){
    function(a,b)
}

inline fun myFunction(fn:() -> Unit,fxn:() ->Unit){
    fn()
    fxn()
    println("code inside the inline function")
}

