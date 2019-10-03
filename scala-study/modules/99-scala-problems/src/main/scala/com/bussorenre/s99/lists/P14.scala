package com.bussorenre.s99.lists

/**
  * Duplicate the elements of a list.
  */
object P14 {
  def duplicate[_](list: List[_]): List[_] = {
    list.flatMap(e => List.fill(2)(e))
  }
}
