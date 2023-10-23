package app

import kotlin.random.Random

const val MAX_NUMBER_OF_TASKS = 6

fun line() = println("---------------")

fun randomNumberOfTasks() = Random.nextInt(MAX_NUMBER_OF_TASKS)

/**
 * Let's assume that probability of rollback necessity is 2 of 10
 */
fun weShouldRollBack() = Random.nextInt(10) >= 8