package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Create a list containing all integers within a given range.
  */
object P22 {
  import com.bussorenre.s99.Utils._

  def range(n: Int, m: Int): List[Int] = {
    @tailrec
    def innerRange(m: Int, result: List[Int]): List[Int] = {
      if (n == m) m :: result
      else innerRange(m - 1, m :: result)
    }
    innerRange(m, List())
  }
}
