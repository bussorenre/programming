package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Insert an element at a given position into a list.
  */
object P21 {
  import com.bussorenre.s99.Utils._

  def insertAt[T](e: T, n: Int, list: List[T]): List[T] = {
    @tailrec
    def innerInsertAt(n: Int, visit: List[T], rest: List[T]): List[T] = (n, rest) match {
      case (0, _)       => append(reverse(visit), e :: rest)
      case (_, x :: xs) => innerInsertAt(n - 1, x :: visit, xs)
      case _            => sys.error("insertAt: Out of bound exception")
    }
    innerInsertAt(n, List(), list)
  }
}
