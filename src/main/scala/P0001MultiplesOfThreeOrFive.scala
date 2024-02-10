object P0001MultiplesOfThreeOrFive {
  def main(args: Array[String]): Unit = {
    def multiple(x: Int, y: Int, z: Int): Long = {
      z match {
        case n if n == 0 => z
        case n if n % x == 0 || n % y == 0 => z + multiple(x, y, z - 1)
        case _ => multiple(x, y, z - 1)
      }
    }
    println(multiple(3, 5, 1000))
  }
}