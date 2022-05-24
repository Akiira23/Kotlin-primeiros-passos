fun main() {
//    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
//    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
//    //val assistiramAmbos = mutableListOf<String>()
//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
//    //assistiramAmbos.addAll(assistiramCursoAndroid)
//    println(assistiramAmbos)
//    //assistiramAmbos.addAll(assistiramCursoKotlin)
//    println(assistiramAmbos.distinct())

    val assistiramSetCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramSetCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    println("android: $assistiramSetCursoAndroid")
    println("kotlin: $assistiramSetCursoKotlin")
//    val assistiramSetAmbos = assistiramSetCursoAndroid + assistiramSetCursoKotlin
    val assistiramSetAmbos = mutableSetOf<String>()
    assistiramSetAmbos.addAll(assistiramSetCursoAndroid)
    assistiramSetAmbos.addAll(assistiramSetCursoKotlin)
    assistiramSetAmbos.add("Ana")
    println(assistiramSetAmbos)

    println(assistiramSetCursoAndroid + assistiramSetCursoKotlin)       // une qualuqer tipo de collections
    println(assistiramSetCursoAndroid union assistiramSetCursoKotlin)  //union une apenas set's

    println(assistiramSetCursoKotlin - assistiramSetCursoAndroid)
    println(assistiramSetCursoAndroid subtract  assistiramSetCursoKotlin)

    println(assistiramSetCursoAndroid intersect assistiramSetCursoKotlin)

    val assistiramList = assistiramSetAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())

}



