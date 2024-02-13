package org.example

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking




    fun main() = runBlocking {
        val task1 = async { // coroutine 1
            delay(2000) // simulating a delay of 2 seconds
            "Task 1 completed"
        }

        val task2 = async { // coroutine 2
            delay(2000) // simulating a delay of 2 seconds
            "Task 2 completed"
        }

        // Waiting for both tasks to complete concurrently
        val result1 = task1.await()
        val result2 = task2.await()

        // Printing the results
        println(result1)
        println(result2)
    }

