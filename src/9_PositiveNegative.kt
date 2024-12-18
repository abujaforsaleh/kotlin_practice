fun main(){

    val arr: Array<Int> = arrayOf(1,2,3,4,5, -12, 14, -23, -12, 0, 12)
    var count: Array<Int> = arrayOf(0, 0)

    for(i in arr){
        if(i>=0){
            count[0]++
        }else{
            count[1]++
        }
    }
    println(count.contentToString())

}