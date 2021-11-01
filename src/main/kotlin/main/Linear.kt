package main

//Subclass of the Algos
class Linear(req: Int, list: List<Int>,compute : (List<Int>,Int) -> Int):Algos(req,list,compute){
    override fun calc() {
        //capturing the return value from the function
        val resultOfLinearSearch = compute(list,req)
        if(resultOfLinearSearch == -1){
            println("Required Element is not on the List")
        }
        else{
            println("Required Element is present on the $resultOfLinearSearch th index")
        }
    }
}