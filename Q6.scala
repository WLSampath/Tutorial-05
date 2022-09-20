object Q6 {
    def fib(n:Int):Int= n match{//2 fibbonancii sequence
        case n if n==0 => 0 // nR
        case n if n==1 => 1 // nR
        case n => fib(n-1)+fib(n-2) // fib(1) + fib(0)
    }  

    def fibSeq(n: Int) : Unit = for (i <- 0 to n) println(fib(i))


    def main(args: Array[String]): Unit = {
        println(fibSeq(10))
    }
}