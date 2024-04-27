package Basic

fun main() {
    val name = mutableSetOf("Abc", "Def", "Ghi", "Jkl")
    name.add("Mno")
    name.add("Pqr")
    name.remove("Jkl")
    println(name)
}