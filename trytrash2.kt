/*class animal{
    var legs:Int=0

    var name=""
    var age:Int=0

}*/
open class animal(var legs:Int,var categoryanimal:String,var age:Int){
    open fun arandonfun(){
        println("a random function has been created")
    }
}

interface men{
    fun arandonfun(){
        println("men do fun")
    }
    
}
class human:animal(2,"human",50),men{
    override fun arandonfun(){
        println("overriden has been done succesfully. is it? ")
        super<men>.arandonfun()
        super<animal>.arandonfun()
    }
    
}

fun main(){
    var obj=animal(4, "lion", 10)
    println("the category of the animal is ${obj.categoryanimal} and the age of that animal is ${obj.age} and the poor lad is of ${obj.legs} legs")
    obj.arandonfun()
    var obj2=human()
    obj2.arandonfun()
    obj2.arandonfun()

    
    
    
}
