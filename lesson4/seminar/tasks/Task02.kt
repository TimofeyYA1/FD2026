package seminar4

/**
 * 2. Разбери количество мест. Ввод может быть Int, строкой или чем-то ещё.
 * Прими только положительный Int или строку с таким числом. У строки убери пробелы по краям.
 * Если число получить нельзя, верни null. Попробуй when, is и toIntOrNull().
 * Примеры: 3 → 3, " 2 " → 2, 2L → null, "0" → null, "пять" → null.
 */


fun parseSeats(raw: Any?): Int? {
    val s = when (raw){
        is Int -> raw
        is String -> raw.trim().toIntOrNull()
        else -> return null
    }
    return if (s>0) s else null
}

fun main() {
    println("Задача 02: Kotlin запущен")
    // После решения раскомментируйте пример ниже.
    // println(parseSeats(" 2 "))
}