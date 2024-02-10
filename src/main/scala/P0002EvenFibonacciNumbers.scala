object P0002EvenFibonacciNumbers {
  def main(args: Array[String]): Unit = {
    lazy val fibs: Stream[BigInt] =
      BigInt(0) #::
        BigInt(1) #::
        fibs.zip(fibs.tail).map { n => n._1 + n._2 }

    println(fibs.filter(n => n % 2 == 0).takeWhile(n => n < 4000000).sum)
  }
}
