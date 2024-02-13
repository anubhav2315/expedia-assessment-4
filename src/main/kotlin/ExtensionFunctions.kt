package org.example



    fun main() {
        val numbers = listOf(1, 2, 3, 4, 5)
        val sum = numbers.sum()
        println("Sum of the list: $sum")
    }


    fun List<Int>.sum(): Int {
        var result = 0
        for (element in this) {
            result += element
        }
        return result
    }
