fun main() {

    var names= arrayOf("linda","Chris","Marie","Diana")
    println(names.contentToString())
    var citiesArray =arrayOf("harare","mumbai","dodoma","jakarta")
    for (cities in citiesArray)
        println( cities.capitalize())

   //  println(citiesArray.sortedArray().contentToString())

    var numbers= arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1] .plus(numbers[4]))
    println(numbers.indexOf(158))
    println(numbers.sorted())

    val Names= arrayOf("Giselee","Claire","iShimwe")
    println(Names.contentToString())





}



fun names (nam1: String,nam2: String,nam3: String,nam4:String){


}
fun arrayof(cities:Array<String>){
}
fun arrayOf(numbers:Array<Int>){

}
fun identity (nam1:String,nam2:String,nam3:String): String{
     var  names= arrayOf(nam1,nam2,nam3)
   return names.contentToString()
   }






