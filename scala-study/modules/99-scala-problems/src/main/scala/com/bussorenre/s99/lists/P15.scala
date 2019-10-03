package com.bussorenre.s99.lists

import scala.annotation.tailrec

object P15 {
  def duplicateN[A](n: Int, list: List[A]): List[A] = {
    // Its too easy using List.fill
    // list.flatMap(e => List.fill(n)(e))

    // make similar to List.fill by self
    def fill[A](n: Int, e: A): List[A] = n match {
      case 0 => List[A]()
      case n if n > 0 => e :: fill(n-1, e)
      case _ => sys.error("fill: n could not be below 0")
    }

    // other implementation (tailrec)
    def fillTailrec[A](n: Int, e: A): List[A] = {
      @tailrec
      def innerFill[A](result: List[A], n: Int, e: A): List[A] = n match {
        case 0 => result
        case n if n > 0 => innerFill(e :: result, n - 1 , e)
        case _ => sys.error("fill: n could not be below 0")
      }
      innerFill(Nil, n, e)
    }

    list.flatMap(e => fill(n, e))
  }
}
