package main

//class provides the main three elements required by both the binary and linear clases
abstract  class Algos(var req : Int, var list: List<Int>,var compute: (List<Int>, Int) -> Int){

    abstract fun calc()
}



