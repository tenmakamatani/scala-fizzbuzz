object FizzBuzz extends App {
    
    private def fizzBuzz(max: Int) = {
        for (i <- 1 to max) {
            if (i % 15 == 0) {
                println(s"${i} FizzBuzz")
            } else if (i % 3 == 0) {
                println(s"${i} Fizz")
            } else if (i % 5 == 0) {
                println(s"${i} Buzz")
            } else {
                println(s"${i}")
            }
        }
    }

    fizzBuzz(args(0).toInt)

}