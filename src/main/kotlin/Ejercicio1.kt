package com.github.apermar1301

class Person(val name: String?) {

}

fun getNameLength(person: Person?): Int {
    return person?.name?.length ?: 0
}

fun main() {
    val person = Person("Juan")
    println(getNameLength(person))
}