package class_obj

class Person() {
    var x: Int = 0
        set(value)  = setval(value)
        get(){
            return field
        }
    fun setval(value: Int){
        x = value
    }
}