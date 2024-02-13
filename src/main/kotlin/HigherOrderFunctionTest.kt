package org.example

fun filterByLength(strings: List<String>, condition: (String) -> Boolean): List<String> {
    return strings.filter { condition(it) }
}

fun main() {
    val originalList = listOf("apple", "banana", "orange", "kiwi", "grape")

    // Example: Filter strings with length greater than 5
    val filteredList = filterByLength(originalList) { it.length > 5 }

    println("Original List: $originalList")
    println("Filtered List (length > 5): $filteredList")
}
