package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Run-length encoding of a list (direct solution).
  * dont use P09.pack
  */
object P13 {

  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, rest) = list.span(_ == list.head)
      (packed.length, packed.head) :: encodeDirect(rest)
    }
  }

  def encodeDirect2[A](list: List[A]): List[(Int, A)] = {
    import P05.reverse

    @tailrec
    def innerEncodeDirect[A](result: List[(Int, A)], ls: List[A]): List[(Int, A)] = {
      if (ls.isEmpty) result
      else {
        val (packed, rest) = ls.span(_ == ls.head)
        innerEncodeDirect((packed.length, packed.head) :: result, rest)
      }
    }

    reverse(innerEncodeDirect(Nil, list))
  }

}
