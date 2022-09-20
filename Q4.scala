object Q4 {
    def oddOREven(n : Int): Unit = n match {//example 3
        case 0 => println("Number is even") // nR -> nR
        case 1 => println("Number is odd")//nR -> running out>print
        case x if (x < 0) => oddOREven(-1 * n)// false
        case _ => oddOREven(n - 2) // 1
    }

    def main(args: Array[String]): Unit = {
        println(oddOREven(11))
    }
}