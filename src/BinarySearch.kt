fun main(){
    var array: Array<Int> = arrayOf(1, 3, 5, 7, 9, 12, 14, 15, 19, 25, 36, 124, 234, 333, 432, 564, 1000)
    var lowerBound: Int = 0
    var upperBound: Int = array.size-1
    val findingValue: Int = 1000
    var mid: Int = 0
    while(lowerBound<=upperBound){
        mid = (lowerBound+upperBound)/2
        if(findingValue==array[mid]){
            break
        }else if(findingValue>array[mid]){
            lowerBound = mid+1
        }else{
            upperBound = mid-1
        }

    }
    if(lowerBound<=upperBound){
        println("$findingValue found in $mid index")
    }else{
        println("$findingValue not found in the list")
    }

}