package seminar4

/**
 * 4. Прочитай обязательный лимит мест. Убери пробелы по краям.
 * Если лимита нет или строка пустая, вызови готовую missingCapacity().
 * Разбери число через toInt(). Поймай NumberFormatException и брось
 * EventConfigException, передав исходное исключение вторым аргументом (cause).
 * Если число <= 0, брось EventConfigException без cause.
 * Примеры: " 5 " → 5, null → EventConfigException, "abc" → EventConfigException с cause.
 * Вопрос: почему missingCapacity() возвращает Nothing, а не Unit или Nothing?
 */
fun readCapacity(raw: String?): Int {
    val txt = raw?.trim() ?: missingCapacity()
    if(txt.isEmpty()) missingCapacity()
    val cap = try {
        txt.toInt()
    } catch (e:NumberFormatException) {
        throw EventConfigException("Лимит не целое число")
    }
    if (cap<=0) throw EventConfigException("Лимит должен быть+")
    return cap
}
// Готовые вспомогательные объявления для задачи 4. Менять их не нужно.
class EventConfigException(message: String, cause: Throwable? = null) : IllegalStateException(message, cause)

fun missingCapacity(): Nothing = throw EventConfigException("Лимит мест не указан")


/*
 * 4б. Что произойдёт в finally?
 * Разбери этот код после того, как решишь основную задачу:
 *
 * fun checkedCapacity(raw: String?, onFinish: () -> Unit): Int {
 *     try {
 *         return readCapacity(raw)
 *     } finally {
 *         onFinish() // Отмечает завершение проверки. Само действие не бросает исключений.
 *         return 0
 *     }
 * }
 *
 * 1. Не запуская код, предскажи результат для "25" и "abc". Дойдёт ли ошибка до вызывающего кода?
 * 2. Исправь одну строку: для "25" должно вернуться 25, для "abc" должно выйти EventConfigException
 *    с исходной NumberFormatException в cause. В обоих случаях onFinish() должен вызваться ровно один раз.
 */
