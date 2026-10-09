package com.github.apermar1301

class Person(val name: String?) {

    fun getName() : String?{
        return name
    }
}

fun getNameLength(person : Person?) : Int {
    return person?.getName()?.length ?: 0
}

fun main(){
    val person = Person("Juan")
    println(getNameLength(person))
}