fun main() {
    println("Сумма вклада: ")
    val value = readLine()
    println("Срок вклада: ")
    val month = readLine()
    println("Ежемесячный процент вклада: ")
    val procent = readLine()
    deposit(value!!.toInt(), month!!.toInt(), procent!!.toInt())
}

fun deposit(value: Int, month: Int, procent: Int) {
    println("Вклад $value на $month месяцев под $procent% ежемесячно")
    var total = value
    for(i in 1..month) {
        val currency = (total/100)*procent
        total += currency
        println("За $i-ый месяц вклад увеличиться на $currency, итоговая сумма $total")
    }
}