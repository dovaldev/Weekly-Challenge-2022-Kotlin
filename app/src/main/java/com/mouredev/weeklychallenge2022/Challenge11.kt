package com.mouredev.weeklychallenge2022

/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

 /* Reto by dovaldev Semana #11 */
val str1: String = "weekly challenge 2022"
val str2: String = "reto semanal #11"
var out1: String = ""
var out2: String = ""

fun main() {
    val list_str1 = str1.replace(" ".toRegex(), "").toList().toSet()
    val list_str2 = str2.replace(" ".toRegex(), "").toList().toSet()


    list_str1.forEach{
        if(!list_str2.contains(it)) out1+=it
    }
    list_str2.forEach{
        if(!list_str1.contains(it)) out2+=it
    }
    println("out1: $out1")
    println("out2: $out2")
}
