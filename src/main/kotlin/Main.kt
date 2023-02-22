fun main() {
    names()
    cities()
    numbers()
    println(namesArrays("Ann","Manu" ,"Luke"))






}
fun names(){
    var name= arrayOf("Bridgit","Mercy","Nandy","June")
    println(name.contentToString())
}
fun cities(){
    var list= arrayOf("harare","mumbai","dodoma","jakarta")
    for (y in list){
       println(y.capitalize())




    }

}
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sumElements= arrayOf(17,78)
    println(sumElements.sum())

    println(numbers.indexOf(158))


    println(numbers.sortedArray().contentToString())



}
fun namesArrays(name1: String, name2: String, name3: String):String{
    var names= arrayOf(name1,name2,name3)
    return names.contentToString()







}


