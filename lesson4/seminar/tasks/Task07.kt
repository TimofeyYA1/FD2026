package seminar4

/*
 * Черновик заявки · 20–25 минут
 *
 *
 * Маша начала заполнять заявку и нажала «Отправить» без email. Она должна иметь возможность исправить тот же черновик. Но уже отправленную заявку менять нельзя.
 *
 * Допиши `RegistrationDraft`. Каждый экземпляр хранит свои имя, email и признак отправки. В начале оба поля пусты, черновик не отправлен.
 *
 * - `editName` и `editEmail` запоминают последний ввод, даже если это `null` или пока некорректная строка. Во время редактирования не проверяй формат.
 * - `submit()` получает имя через `displayName`, а email через `normalizeEmail`. Если email не годится, брось `IllegalArgumentException` и оставь черновик доступным для исправления.
 * - При успехе верни готовый `Registration`. С этого момента все три метода должны бросать `IllegalStateException`.
 *
 * Проверь одну историю: введи имя `"  Маша  "` → попробуй отправить без email → получи ошибку → введи `" m@b "` → отправь и получи `Registration("Маша", "m@b")` → попробуй ещё раз изменить имя: теперь это ошибка состояния.
 *
 * Обсудим: в какой момент можно менять признак «отправлено» и почему не раньше?
 */

data class Registration(val name: String, val email: String)

class RegistrationDraft {
    fun editName(value: String?): Unit = TODO()
    fun editEmail(value: String?): Unit = TODO()
    fun submit(): Registration = TODO()
}

fun main() {
    println("Задача 07: Kotlin запущен")
    // После решения раскомментируйте пример ниже.
    // val draft = RegistrationDraft()
    // draft.editName("Аня")
    // draft.editEmail("anya@example.test")
    // println(draft.submit())
}
