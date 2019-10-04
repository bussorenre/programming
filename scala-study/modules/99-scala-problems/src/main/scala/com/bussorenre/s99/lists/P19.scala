package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Rotate a list N places to the left.
  */
object P19 extends {
  import com.bussorenre.s99.Utils._

  def rotate[_](n: Int, list: List[_]): List[_] = {
    def innerRotate(n: Int, prev: List[_], rest: List[_]): List[_] = n match {
      case n if n > 0 =>
        rest match {
          case x :: xs => innerRotate(n - 1, x :: prev, xs)
          case _       => innerRotate(n, Nil, reverse(prev))
        }
      case n if n < 0 =>
        prev match {
          case x :: xs => innerRotate(n + 1, xs, x :: rest)
          case _       => innerRotate(n, reverse(rest), Nil)
        }
      case 0 => append(rest, reverse(prev))
    }
    innerRotate(n, Nil, list)
  }
}
