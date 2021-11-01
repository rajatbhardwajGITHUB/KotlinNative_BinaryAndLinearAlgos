package main

import kotlin.system.exitProcess

class Model(private var list: List<Int>, private var requiredElement: Int) {

    fun calculations(choice: Int) {
        //Decide on the basis of the choice
        when (choice) {
            1 -> { //when linear
                //function that will be returned to the binary class
                //regular linear search algo
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
                //creating the instance of the linear class
                val linear = Linear(requiredElement, list, ::calLinear)
                //calling the calc() function
                linear.calc()
            }
            2 -> { //when binary
                fun calBinary(list: List<Int>, requiredElement: Int): Int {
                    //reg binary search
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
                //creating the insatance of the binary class
                val binary = Binary(requiredElement, list, ::calBinary)
                //calling the calc()
                binary.calc()
            }
            else -> {
                println("wrong Choice ")
                exitProcess(1)
            }
        }
    }
}