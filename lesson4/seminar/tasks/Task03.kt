package seminar4

/**
 * 3. Проверь обязательный email. Убери пробелы по краям.
 * Для семинара формат такой: ровно один @, с непустым текстом слева и справа,
 * без пробелов и других пробельных символов внутри. Регистр не меняй.
 * Если email не задан или не подходит, верни null.
 * Примеры: "  Anna@demo.test " → "Anna@demo.test", "anna" → null, null → null.
 * Подсказка: начать можно с `val email = raw?.trim() ?: return null`.
 */
fun normalizeEmail(raw: String?): String? {
    if (raw is null) {
        return null
    } else {
        val res = raw!!.toString().trim()
        if (!res.contains('@')) {
            return null
        } else if (res.length() == 1) {
            return null
        }
        return res
    }
}
