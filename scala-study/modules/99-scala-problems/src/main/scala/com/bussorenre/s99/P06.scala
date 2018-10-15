package com.bussorenre.s99

object P06 {
  def isPalindrome[_](list: List[_]): Boolean = {
    P05.reverseTailRec(list) == list
  }
}
