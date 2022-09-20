object Q2 {
  
    def GCD(a: Int, b: Int): Int = b match {
        case 0 => a
        case x if x > a => GCD(x, a)
        case x => GCD(x, a%x)
    }

    def prime(p: Int, n: Int = 2): Boolean = n match {
        case x if (x == p) => true
        case x if GCD(p, x) > 1 => false
        case x => prime(p, x + 1)
    }

    def primeSeq(n:Int): Unit = for (i <- 2 to n) if (prime(i)) println(i)// get the prime number sequence

    def main(args: Array[String]): Unit = {
        println(primeSeq(10))
    }
}