var cities = mutableListOf<String>()

fun main() {
    var active = true
    println(""""Add" - Добавить город;
        "See" - отобразить список городов;
        "SeeDistinct" - отобразить уникальные названия городов;
        "Exit" - выйти из программы;
    """)
    while (active) {
        when (readLine()?.toLowerCase()) {
            "add" -> {
                addCity()
            }
            "see" -> {
                seeList()
            }
            "seedistinct" -> {
                seeUnicalList()
            }
            "exit" -> { active = false
            }
        }
    }
}


fun addCity() {
    println("Введите название города:")
    cities.add(readLine().toString())
    println("Успешно!")
}

fun seeList() {
    cities.forEach {
        println(it)
    }
}

fun seeUnicalList() {
    cities.stream().distinct().forEach {
        println(it)
    }
}