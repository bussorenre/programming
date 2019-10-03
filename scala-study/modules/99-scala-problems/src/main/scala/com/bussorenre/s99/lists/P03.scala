package com.bussorenre.s99.lists

object P03 {
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (0, x :: _)  => x
    case (n, _ :: xs) => nth(n - 1, xs)
    case (_, Nil)     => throw new NoSuchElementException
  }
}
