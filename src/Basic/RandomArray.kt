package Basic

import java.util.Random
fun main() {
    val personName = arrayOf("A", "B", "C", "D", "e", "f")

    val selectPerson = mutableSetOf<String>()
    val Random = Random();
    while (selectPerson.size < personName.size){
        val randomPerson = mutableSetOf<String>()
        while (randomPerson.size < 2){
            val randomIndex = Random.nextInt(personName.size)
            val personName = personName[randomIndex]
            if (!selectPerson.contains(personName)){
                randomPerson.add(personName)
                selectPerson.add(personName)
            }
        }
        println("Randomly selected a person: $randomPerson" )
    }
}