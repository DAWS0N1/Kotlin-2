fun main() {
    deposit(50000, 8, 7)
}

fun deposit(value: Int, month: Int, procent: Int) {
    println("Вклад $value на $month месяцев под $procent% ежемесячно")
    var total = value
    for(i in 1..month) {
        total += (total/100)*procent
        println("За $i-ый месяц вклад увеличиться на ${(value/100)*procent}, итоговая сумма $total")
    }
}