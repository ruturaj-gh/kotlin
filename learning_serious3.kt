abstract class Animal(
    val name:String ,
    val age:Int

)
{
    init{
        println("hello my name is $name")
        println("$name age is $age")
    }
    abstract fun sounds()

}
class dog:Animal("dog",13){
    override fun sounds() {
        println("woof!!")
        
    }

}
class cat:Animal("cat",9){
    override fun sounds(){
        println("the $name sound is meow ")
        println("the $name's age is $age ")
    }
    
}

fun main(){
    val bear=object :Animal("bear",20){
        override fun sounds(){
            println("rooooar!!!!")
        }

    }
    bear.sounds()

    

    


    val dog=dog()
    dog.sounds()

    val instance =cat()
    instance.sounds()
    
    
}
