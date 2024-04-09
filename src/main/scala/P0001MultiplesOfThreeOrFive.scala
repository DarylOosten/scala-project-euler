object P0001MultiplesOfThreeOrFive {
  def main(args: Array[String]): Unit = {
    def recursive(x: Int, y: Int, z: Int): Long = {
      z match {
        case n if n == 0 => z
        case n if n % x == 0 || n % y == 0 => z + recursive(x, y, z - 1)
        case _ => recursive(x, y, z - 1)
      }
    }
    println(recursive(3, 5, 1000))

    def iterative(x: Int, y: Int, z: Int): Long = {
      var sum = 0
      for(i <- 0 until z) {
        if(i % x == 0 || i % y == 0) {
          sum = sum + i
        }
      }
      sum
    }
    println(iterative(3, 5, 1000))
  }
}