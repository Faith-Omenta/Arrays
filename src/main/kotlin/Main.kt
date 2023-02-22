fun main() {
     family("Melvine","Glenah","Phylis","Darlene")
     cities()
     numbers()
     var t =students("Lindsay","Kourtney","Garvey")
     println(t)
}
fun family (name1:String,name2:String,name3:String,name4:String){
     var w = arrayOf(name1,name2,name3,name4)
     println(w.contentToString())
}
fun cities() {
var cities = arrayOf("harare","mumbai","dodoma","jakarta")
      for (city in cities) {
           println(city.capitalize())
           } }
fun numbers(){
     var numbers = arrayOf(32,17,4,213,78,43,90,31,37,3,73,11,158,62)
     var sum=numbers[1]+numbers[4]
     println(sum)
     println(numbers.indexOf(158))
     println(numbers.sortedArray().contentToString())
}
fun students(name5:String,name6:String,name7:String):String{
     var names= arrayOf(name5,name6,name7)
     return names.contentToString()

}
