val workTable = mapOf(1 to "Карпов И.И.", 2 to "Смирнов В.А.", 3 to "Соболев Н.С.", 4 to "Калабекьянц Н.Э.")

fun main() {
    println("Введите номер рабочего места:")
    val num = readLine()
    getName(num!!.toInt())
}

fun getName(number: Int) {
    println(workTable[number])
}