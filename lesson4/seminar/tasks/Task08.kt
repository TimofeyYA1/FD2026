package seminar4

/*
 * Сканер билетов · 20 минут
 *
 *
 * У входа сканируют билет. Если код не виден, билет можно показать ещё раз. Если устройство сломалось, сотрудник должен узнать о поломке. Не превращай эти два случая в один `null`.
 *
 * 1. Допиши свой класс исключения `TicketCheckException`: он наследуется от `RuntimeException` и сохраняет переданные `message` и `cause`. После создания исключения `cause` должен указывать на исходный объект, а не на новую ошибку с тем же текстом.
 * 2. Допиши `TicketInspector.inspect(reader)`. Прочитай код один раз. Убери пробелы по краям. Верни непустой код или `null`, если кода нет.
 * 3. Если `readCode()` бросил `ReaderException`, брось `TicketCheckException` с понятным сообщением и исходной причиной. Другие исключения пропускай без изменений.
 * 4. После попытки чтения вызови `close()` ровно один раз: и при успехе, и при любом исключении. Считай, что `close()` не бросает исключений.
 *
 * | Ответ сканера | Результат проверки |
 * |---|---|
 * | `"  A-17 "` | `"A-17"` |
 * | `null` или `"   "` | `null` |
 * | `ReaderException` | `TicketCheckException` с исходной причиной |
 * | `IllegalStateException` | То же исключение без обёртки |
 *
 * Обсудим: что увидит сотрудник, если вместо обработки поломки написать `catch (e: Exception) { return null }`?
 */

interface TicketReader {
    fun readCode(): String?
    fun close()
}
class ReaderException(message: String) : RuntimeException(message)

// Задача 1: допиши своё исключение. Сейчас оно теряет сообщение и причину.
class TicketCheckException(message: String, cause: Throwable) : RuntimeException()

// Задача 2: реализуй проверку. Сканер после чтения всегда нужно закрыть.
class TicketInspector {
    fun inspect(reader: TicketReader): String? = TODO()
}

fun main() {
    println("Задача 08: Kotlin запущен")
    // После решения раскомментируйте пример ниже.
    // val reader = object : TicketReader {
    // override fun readCode(): String = "  A-17  "
    // override fun close() {}
    // }
    // println(TicketInspector().inspect(reader))
}
