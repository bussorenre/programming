package com.bussorenre.s99

import scala.annotation.tailrec

/**
  * Reverse a List
  */
object P05 {
  def reverse[T](list: List[T]): List[T] = {
    list match {
      case Nil => Nil
      case x :: xs => reverse(xs) ::: List(x)
    }
  }

  def reverseTailRec[T](list: List[T]): List[T] = {
    @tailrec
    def reverseTailRec[T](list: List[T], res: List[T]): List[T] = {
      list match {
        case Nil => res
        case x :: xs => reverseTailRec(xs, List(x) ::: res)
      }
    }
    reverseTailRec(list, Nil)
  }
}
