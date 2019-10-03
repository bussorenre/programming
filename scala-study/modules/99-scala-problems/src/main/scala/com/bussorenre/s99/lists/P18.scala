package com.bussorenre.s99.lists

/**
  * Extract a slice from a list.
  */
object P18 {
  import P17.split
  def slice[_](begin: Int, end: Int, list: List[_]): List[_] = {
    val (_, rest) = split(begin, list)
    split(end - begin, rest)._1
  }
}
