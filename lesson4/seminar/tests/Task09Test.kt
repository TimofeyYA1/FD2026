package seminar4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task09Test {
    // Проверяем объявления по имени, чтобы тесты компилировались до решения.
    private fun book(available: Int): Any {
        val resultType = try {
            Class.forName("seminar4.BookingResult")
        } catch (e: ClassNotFoundException) {
            throw AssertionError("Объяви sealed interface BookingResult в Task09.kt", e)
        }
        val function = try {
            Class.forName("seminar4.Task09Kt").getMethod("bookTicket", Int::class.javaPrimitiveType)
        } catch (e: NoSuchMethodException) {
            throw AssertionError("Напиши bookTicket(available: Int): BookingResult", e)
        }
        assertEquals(resultType, function.returnType)
        return function.invoke(null, available)
    }

    private fun booked(available: Int, remaining: Int) {
        val result = book(available)
        assertEquals("seminar4.BookingResult\$Booked", result.javaClass.name)
        assertEquals(remaining, result.javaClass.getMethod("getRemaining").invoke(result))
    }

    @Test fun `бронируем одно место`() = booked(4, 3)
    @Test fun `последний билет достался нам`() = booked(1, 0)
    @Test fun `все билеты уже разобрали`() {
        assertEquals("seminar4.BookingResult\$SoldOut", book(0).javaClass.name)
    }
}
