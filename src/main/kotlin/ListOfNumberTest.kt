fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Filter even numbers, map to their squares, and then calculate the sum using reduce
    val sumOfSquaresOfEvenNumbers = numbers
        .filter { it % 2 == 0 }         // Filter even numbers
        .map { it * it }                // Map to squares
        .reduceOrNull { acc, value -> acc + value } // Calculate the sum using reduce

    // Print the result
    println("Sum of squares of even numbers: $sumOfSquaresOfEvenNumbers")
}