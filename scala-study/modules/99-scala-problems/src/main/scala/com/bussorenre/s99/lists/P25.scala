package com.bussorenre.s99.lists

/**
  * Generate a random permutation of the elements of a list.
  */
object P25 {
  import P04.length
  import P23.randomSelect

  def randomPermute(list: List[_]): List[_] = randomSelect(length(list), list)
}
