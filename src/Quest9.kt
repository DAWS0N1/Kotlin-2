fun main() {
    val countries = Array(3) {Array(3) {""}}
    countries[0] = arrayOf("Russia", "USA", "Armenia")
    countries[1] = arrayOf("Moscow", "Washington DC", "Yerevan")
    countries[2] = arrayOf("RUB", "USD", "AMD")
    for (i in 0..2) {
        for (country in countries) {
            print("${country[i]} \t\t")
        }
        println()
    }
}