package com.bussorenre.s99.lists

/**
  * Decode a run-length encoded list.
  */
object P12 {

  def decode[A](list: List[(Int, A)]): List[A] = {
    list.flatMap(e => List.fill(e._1)(e._2))
  }
}
