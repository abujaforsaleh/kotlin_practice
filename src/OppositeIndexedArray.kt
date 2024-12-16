fun main(){
    val arr1: Array<Int> = arrayOf(1,2,3,4,5, 6,7,8,9,10)

    var mid: Int = arr1.size/2
    var j: Int = arr1.size-1
    for(i in 0..mid-1){
        var temp = arr1[i]
        arr1[i] = arr1[j]
        arr1[j--] = temp
    }
    println(arr1.contentToString())
}