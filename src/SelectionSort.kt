

fun main(){

    val arr: Array<Int> = arrayOf(45, 42, 7, -12, 87, 34, 35, 76, 234)
    for(i in 0 until arr.size-1){
        var minIndex = i
        for(j in i + 1 until arr.size){
            if(arr[minIndex]>arr[j]){
                minIndex = j
            }
        }
        if(arr[i]>arr[minIndex]){
            var temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
    println(arr.contentToString())
}