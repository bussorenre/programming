package com.bussorenre.s99.lists

/**
  * Drop every Nth element from a list.
  */
object P16 {
  def drop[A](n: Int, list: List[A]): List[A] = {
    def innerDrop[A](i: Int, rest: List[A]): List[A] = rest match {
      case Nil => Nil
      case x :: xs =>
        i match {
          case 1          => innerDrop(n, xs)
          case i if i > 1 => x :: innerDrop(i - 1, xs)
          case _          => sys.error("drop: n could not be below 0")
        }
    }
    innerDrop(n, list)
  }

  // write more simple
  def drop2[_](n: Int, list: List[_]): List[_] = {
    def innerDrop(m: Int, list: List[_]): List[_] = (m, list) match {
      case (1, _ :: xs) => innerDrop(n, xs)
      case (_, x :: xs) => x :: innerDrop(m - 1, xs)
      case (_, _)       => Nil
    }
    if (n > 0) innerDrop(n, list)
    else sys.error("drop: n could not be below 0")
  }
}
