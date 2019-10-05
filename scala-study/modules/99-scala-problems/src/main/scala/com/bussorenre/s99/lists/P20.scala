package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Remove the Kth element from a list.
  */
object P20 {
  import com.bussorenre.s99.Utils._

  def removeAt[T](n: Int, list: List[T]): (List[T], T) = {
    @tailrec
    def innerRemoveAt[T](n: Int, visit: List[T], rest: List[T]): (List[T], T) = (n, rest) match {
      case (0, x :: xs) => (append(reverse(visit), xs), x)
      case (_, x :: xs) => innerRemoveAt(n - 1, x :: visit, xs)
      case _            => sys.error("removeAt: Out of bound exception")
    }
    innerRemoveAt(n, List(), list)
  }
}
