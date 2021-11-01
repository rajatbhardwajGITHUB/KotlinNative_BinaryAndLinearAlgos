package main

//takes a function as a constructor parameter that will compute the main output for this file
class Binary(req : Int, list : List<Int>, compute: (List<Int>, Int) -> Int) : Algos(req,list, compute){
    override fun calc() {

        //passing the list for checking to the CHECK FUNCTION
        val check = checkSorted(list)
        if(!check){
            println("NEED A SORTED ARRAY")
        }else{
            //capturing the result from the function
            val resultOfBinarySearch = compute(list,req)
            if(resultOfBinarySearch == -1){
                println("element not present on the list")
            }else {
                println("The required element is on the : $resultOfBinarySearch Index")
            }
        }

    }

    //CHECK THAT THE GIVEN LIST IS SORTED AS IT IS A BINARY SEARCH
    private fun checkSorted(list: List<Int>):Boolean{
        for (i in list.indices){
            if(i == list.size-1){ //MAKE SURES THAT THE INDEX DON'T GO OUT OF BOUNDS
                break
            }
            else{
                if( list[i] > list[i+1]){ //If the previous element in the list is bigger then the later then it is unsorted
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
