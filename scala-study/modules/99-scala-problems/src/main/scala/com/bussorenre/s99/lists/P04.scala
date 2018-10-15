package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Find the number of elements of List
  */
object P04 {
  def length[_](list: List[_]): Int = {
    @tailrec
    def length[_](list: List[_], n: Int): Int = {
      list match {
        case Nil => n
        case _ :: xs => length(xs, n + 1)
      }
    }
    length(list, 0)
  }
}
