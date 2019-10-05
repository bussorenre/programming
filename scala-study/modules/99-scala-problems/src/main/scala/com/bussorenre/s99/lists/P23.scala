package com.bussorenre.s99.lists

/**
  * Extract a given number of randomly selected elements from a list.
  */
object P23 {

  import P04.length
  import P20.removeAt

  import util.Random

  Random.setSeed(0)

  // return random 0 to n - 1
  def random(n: Int): Int = Random.nextInt(n)

  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    def innerRandomSelect[T](n: Int, result: List[T], list: List[T]): List[T] = (n, list) match {
      case (0, _) => result
      case (n, _) => {
        val (xs, x) = removeAt(random(length(list)), list)
        innerRandomSelect(n - 1, x :: result, xs)
      }
    }
    innerRandomSelect(n, List(), list)

  }
}
