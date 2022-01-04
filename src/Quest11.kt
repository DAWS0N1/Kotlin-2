val workTable = mapOf(1 to "Карпов И.И.", 2 to "Смирнов В.А.", 3 to "Соболев Н.С.", 4 to "Калабекьянц Н.Э.")

fun main() {
    getName(2)
}

fun getName(number: Int) {
    println(workTable[number])
}
