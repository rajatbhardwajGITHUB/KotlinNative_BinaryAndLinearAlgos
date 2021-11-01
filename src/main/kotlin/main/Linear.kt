package main

class Linear(req: Int, list: List<Int>, var compute : (List<Int>,Int) -> Int):Algos(req,list){
    override fun calc() {
        println("linear search is started P : 2")
        val resultOfLinearSearch = compute(list,req)
        if(resultOfLinearSearch == -1){
            println("Required Element is not on the List")
        }
        else{
            println("Required Element is present on the $resultOfLinearSearch th index")
        }
    }
}