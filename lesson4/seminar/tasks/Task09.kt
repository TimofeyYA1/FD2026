package seminar4

/*
 * 9. Забронируйте один билет.
 * Объявите sealed interface BookingResult и внутри него два типа результата:
 * Booked(val remaining: Int) хранит остаток мест; SoldOut означает, что билетов нет.
 * Используйте data class для Booked и data object для SoldOut.
 * Напишите bookTicket(available: Int): BookingResult. На вход подают число ≥ 0.
 * Если места есть, верните Booked с остатком после брони. Иначе верните SoldOut.
 * Примеры: 3 → Booked(2), 1 → Booked(0), 0 → SoldOut.
 */

fun main() {
    println("Задача 09: Kotlin запущен")
    // После решения раскомментируйте пример ниже.
    // println(bookTicket(1))
}
