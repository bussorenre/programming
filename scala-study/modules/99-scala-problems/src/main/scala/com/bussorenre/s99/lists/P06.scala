package com.bussorenre.s99.lists

object P06 {
  def isPalindrome[_](list: List[_]): Boolean = {
    P05.reverseTailRec(list) == list
  }
}
