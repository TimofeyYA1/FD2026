package seminar4

/**
 * 1. Подготовь имя для списка участников.
 * Убери пробелы по краям. Если имени нет или оно пустое, верни «Гость».
 * Примеры: "  Аня  " → "Аня", null → "Гость", "   " → "Гость".
 * Попробуй использовать безопасный вызов ?. и оператор Элвиса ?:, без !!.
 */
fun displayName(name: String?): String {
    val new_name=name?.trim()
    if (new_name.isNullOrBlank()){
        return "Гость"
    }
    return new_name
}
fun displayName(name: String?): String = error("Задача 1 пока не решена")
