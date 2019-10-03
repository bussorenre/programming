package com.bussorenre.s99.lists

/**
  * flatten a nested list structure
  */
object P07 {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => flatten(ms)
    case e           => List(e)
  }
}
