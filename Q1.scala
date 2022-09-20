object Q1 {
    
    def GCD(a: Int, b: Int): Int = b match { //2 parameters are taken as input. 
        case 0 => a
        case x if x > a => GCD(x, a) // if b > a switch the parameter values
        case x => GCD(x, a%x)
    }

    def prime(p: Int, n: Int = 2): Boolean = n match { //return type of the function is boolean
        case x if (x == p) => true
        case x if GCD(p, x) > 1 => false
        case x => prime(p, x + 1)
    }

    def main(args: Array[String]): Unit = {
        println(prime(3))
    }
}