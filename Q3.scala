object Q3 {
    def sum(n : Int): Int = n match { // sum(3)
        case 0 => return 0 // not running until 0==0
        case x => return x + sum(x - 1) // 3 + 2 + 1 + 0
    }

    def main(args: Array[String]): Unit = {
        println(sum(10))
    }
}