object Q5 {
    
    def sum(n : Int): Int = n match { // "add all even numbers from 0 to n" : 3
        case 0 => return 0 // nR
        case x if(x % 2 == 0) => return x + sum(x - 2) // nR
        case x if(x % 2 == 1) => sum(n - 1) // sum(3-1 = 2)
    }

    def main(args: Array[String]): Unit = {
        println(sum(11))
    }
}