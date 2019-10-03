package com.bussorenre.s99.lists

/**
  * Split a list into two parts.
  */
object P17 {
  def split[_](n: Int, list: List[_]): (List[_], List[_]) = (n, list) match {
    case (_, Nil) => (Nil, Nil)
    case (0, _)   => (Nil, list)
    case (n, x :: xs) => {
      val (prev, next) = split(n - 1, xs)
      (x :: prev, next)
    }
  }
}
