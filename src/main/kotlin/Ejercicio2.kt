package com.github.apermar1301

fun formatName(firstName: String, lastName: String? = "Pérez", nickName: String? = "arbarito"): String {

    return when {
        nickName != null -> "Nickname: <$nickName>"
        lastName != null -> "<$firstName> <$lastName>"
        else -> "<$firstName>"
    }

}

fun main(){
    print(formatName("alvaro"))
}