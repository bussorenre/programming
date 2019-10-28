package com.bussorenre.s99.lists

/**
  * Generate the combinations of K distinct objects chosen from the N elements of a list.
  */
object P26 {

  import com.bussorenre.s99.Utils._

  def combination[T](n: Int, list: List[T]): List[List[T]] = {

    def innerCombination(n: Int, prev: List[T], rest: List[T]): List[List[T]] = rest match {
      case Nil if n == 0 => List(reverse(prev))
      case x :: xs       => append(innerCombination(n - 1, x :: prev, xs), innerCombination(n, prev, xs))
      case _             => Nil
    }

    innerCombination(n, Nil, list)
  }
}
