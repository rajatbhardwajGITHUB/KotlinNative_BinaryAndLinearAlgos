package main

import kotlin.system.exitProcess

class Model(private var list: List<Int>, private var requiredElement: Int) {
    fun calculations(choice: Int) {
        when (choice) {
            1 -> {
                fun calLinear(list: List<Int>, requiredElement: Int): Int {
                    for (i in list.indices) {
                        if (list[i] == requiredElement) {
                            return i
                        } else {
                            println(2)
                            continue
                        }
                    }
                    return -1
                }
                val linear = Linear(requiredElement, list, ::calLinear)
                linear.calc()
            }
            2 -> {
                fun calBinary(list: List<Int>, requiredElement: Int): Int {
                    //var firstElement = list[0]
                    val lastElement = list.size - 1
                    for (i in 0..lastElement) {
                        var mid = list.size / 2
                        if (list[mid] == requiredElement) {
                            return mid
                        } else if (list[mid] > requiredElement) {
                            mid -= 1
                        } else {
                            mid += 1
                        }
                    }
                    return -1
                }
                val binary = Binary(requiredElement, list, ::calBinary)
                binary.calc()
            }
            else -> {
                println("wrong Choice ")
                exitProcess(1)
            }
        }
    }
}