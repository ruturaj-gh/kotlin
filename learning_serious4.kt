
fun trycatch(){
    val number=readLine()?: "0"
    
    val parsednumber=try{
        number.toInt()
    }
    catch(e:Exception){
        "enter a number instead"

    }
    println(parsednumber)
}

fun main(){
    
    

    val list=listOf("kotlin","is","fun")
    val count=list.customcount(){
        currentstring ->
        currentstring.length>=3
  

    }
    println(count)

    println("do you want to perform try catch function enter 2 otherwise 0")
    val read=readLine()?: "0"
    val num=read.toInt()
    if(num==2){
        trycatch()
    }
    else{
        return 
    }

}

fun List<String>.customcount(function:(String)->Boolean):Int{
    var counter=0
    for( String in this ){
        if(function(String)){
            counter++

        }
    }
    return counter
    

    


}


