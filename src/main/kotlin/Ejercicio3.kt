package com.github.apermar1301

fun main(){
    print(sumIfAllIntegers("5", "5.5", 5.4))
}

fun sumIfAllIntegers(vararg args : Any) : Int?{

    var sum = 0
    for (arg in args) {
        sum += arg as? Int ?: return null
    }
    return sum
}
