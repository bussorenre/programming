package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Pack consecutive duplicates of list elements into sublists.
  */
object P09 {

  def pack[A](list: List[A]): List[List[A]] = {
    import P05.reverse
    @tailrec
    def InnerPack[A](result: List[List[A]], ls: List[A]): List[List[A]] = ls match {
      case Nil => result
      case x :: xs => {
        val (packed, rest) = xs.span(_ == x)
        InnerPack((x :: packed) :: result, rest)
      }
    }
    reverse(InnerPack(Nil, list))
  }

  // @tailrec
  // similar to Sample implementation but its not tailrec
  def pack2[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, rest) = list.span(_ == list.head)
      if (rest == Nil) List(packed)
      else packed :: pack2(rest)
    }
  }

}
