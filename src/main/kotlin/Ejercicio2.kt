package com.github.apermar1301

fun formatName(firstName: String, lastName: String?, nickName: String?): String {

    return nickName?.let { "Nickname: <$it>" }
        ?: lastName?.let { "<$firstName> <$it>" }
        ?: firstName

}

fun main() {
    print(formatName("alvaro", null, null))
}