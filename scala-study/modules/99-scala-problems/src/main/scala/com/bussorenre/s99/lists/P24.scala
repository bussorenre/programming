package com.bussorenre.s99.lists

/**
  * Lotto: Draw N different random numbers from the set 1..M.
  */
object P24 {
  import P22.range
  import P23.randomSelect

  def Lotto(n: Int, m: Int) = randomSelect(n, range(1, m))
}
