package  example.myapp

//fun buildAquarium() {
//    val myAquarium = Aquarium()
//}
fun main() {
    buildAquarium()
}
fun printSize(width: String, length: String, height: String) {
    println("Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm ")
}
fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}
