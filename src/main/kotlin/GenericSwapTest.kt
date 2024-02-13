package org.example

fun <T> swapElements(list: MutableList<T>, index1: Int, index2: Int) {
    if (index1 in list.indices && index2 in list.indices) {
        val temp = list[index1]
        list[index1] = list[index2]
        list[index2] = temp
    } else {
        println("Invalid indices. Ensure both indices are within the list size.")
    }
}

fun main() {
    // Testing with a list of strings
    val stringList = mutableListOf("apple", "banana", "orange", "kiwi", "grape")
    println("Original String List: $stringList")

    swapElements(stringList, 1, 3) // Swap elements at indices 1 and 3
    println("String List after swapping: $stringList")

    // Testing with a list of integers
    val intList = mutableListOf(1, 2, 3, 4, 5)
    println("\nOriginal Integer List: $intList")

    swapElements(intList, 0, 4) // Swap elements at indices 0 and 4
    println("Integer List after swapping: $intList")
}
