package org.example.dataclass

fun main() {
    val people = listOf(
        Person("Alice", 25, "alice@example.com"),
        Person("Bob", 35, "bob@example.com"),
        Person("Charlie", 28, "charlie@example.com"),
        Person("David", 40, "david@example.com")
    )

    val personsOlderThan30 = people.filter { it.age > 30 }

    println("Persons older than 30:")
    personsOlderThan30.forEach { println(it) }

    val convertedPeople = people.map { p-> p.copy() }

    println("Converting People to another object using DTO copy method")
    convertedPeople.forEach { println(it) }
}
