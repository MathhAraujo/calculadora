fun main(){

}

fun soma(n: Int, n2: Int): Int{
    return n+n2
}
fun sub(n: Int, n2: Int): Int{
    return n-n2
}
fun mult(n: Int, n2: Int): Int{
    return n*n2
}
fun divs(n: Int, n2: Int): Int{
    return if(n2 != 0){
        n / n2
    }else {
        0
    }
}