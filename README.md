# Запуск семинара 4

1. В IntelliJ IDEA выберите **File → Open** и откройте корень репозитория (папку с этим README), не отдельный `.kt`. Разрешите импорт проекта Gradle.
2. Используйте JDK 26. Если его нет: **File → Project Structure → Project → SDK → Download JDK**, выберите 26. В **Settings → Build Tools → Gradle → Gradle JVM** выберите тот же JDK. Дождитесь синхронизации; при первом открытии нужен интернет.
3. Откройте `lesson4/seminar/tasks/Main.kt`, нажмите зелёный треугольник возле `fun main()`. Чтобы проверить свою функцию, вызовите её внутри `main`. В файлах заданий без `main` отдельной кнопки запуска программы нет.

В терминале из корня на Windows: `.\gradlew.bat :seminar-4:run`; на macOS/Linux: `./gradlew :seminar-4:run`. Отдельный Gradle или компилятор Kotlin устанавливать не нужно. Для терминала команда `java -version` должна находить JDK 26 (или укажите его папку в `JAVA_HOME`).
