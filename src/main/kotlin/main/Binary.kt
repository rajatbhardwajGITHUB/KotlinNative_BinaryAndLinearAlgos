package main

class Binary(req : Int, list : List<Int>,var compute: (List<Int>, Int) -> Int) : Algos(req,list){
    override fun calc() {

        val check = checkSorted(list)
        if(!check){
            println("NEED A SORTED ARRAY")
        }else{
            val resultOfBinarySearch = compute(list,req)
            if(resultOfBinarySearch == -1){
                println("element not present on the list")
            }else {
                println("The required element is on the : $resultOfBinarySearch Index")
            }
        }

    }

    private fun checkSorted(list: List<Int>):Boolean{
        for (i in list.indices){
            if(i == list.size-1){
                break
            }
            else{
                if( list[i] > list[i+1]){
                    return false
                }
                else{
                    continue
                }
            }
        }
        return true
    }
}
