package com.bussorenre.s99.lists

/**
  * Run-length encoding of a list.
  */
object P10 {
  import P09.pack

  def encode[A](list: List[A]): List[(Int, A)] = {
    pack(list).map(e => (e.length, e.head))
  }
}
