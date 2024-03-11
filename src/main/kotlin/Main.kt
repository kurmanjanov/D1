import kotlin.random.Random

fun main() {
    var  HelloWorld = "HiGeeks"

    val NUM = 23

    val word = "HiGeeks"

     HelloWorld = "$NUM $word"

    println(" HelloWorld: $HelloWorld, NUM: $NUM, word: $word")

    if (NUM < 0) {
        println("Вы сохранили отрицательное число")
    } else if (NUM > 0) {
        println("Вы  сохранили положительное число")
    } else {
        println(" Вы сохранили ноль")
    }
}
fun dz2() {
    println(canGoForAWalk(34, 20))
    println(canGoForAWalk(16, 25))
    println(canGoForAWalk(50, 32))
    println(canGoForAWalk(21, 35))
    println(canGoForAWalk(19, -15))

}

fun canGoForAWalk(age: Int, temperature: Int): String = when {

    (age in 20..45 && temperature in -20..30) -> "Можно идти гулять"

    (age < 20 && temperature in 0..28) -> "Можно идти гулять"

    (age > 45 && temperature in -10..25) -> "Можно идти гулять"

    else -> " Оставайтесь дома"

}


fun dz3() {
    val array = DoubleArray(15)
    for (i in array.indices) {
        array[i] = Random.nextDouble(-100.0, 100.0)
    }
    println("Массив доброных чисел:")
    println(array.joinToString(", "))
    var sun = 0.0
    var sunn = 0

    var HomeWork = false
    for (number in array) {
        if (number < 0) {
            HomeWork  = true
        } else if (HomeWork) {
            sun += number
            sunn++
        }
    }

    if (sunn > 0) {
        val HomeWorkLesson = sun / sunn
        println("Среднее арифметическое положительных чисел, после первого отрицательного: $HomeWorkLesson ")
    } else {
        println("После первого отрицательного числа не было найденно положительных чисел")
    }
}