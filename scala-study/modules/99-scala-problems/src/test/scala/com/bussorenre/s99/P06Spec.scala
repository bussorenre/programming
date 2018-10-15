package com.bussorenre.s99

import com.bussorenre.AbstractProblemSpec

class P06Spec extends AbstractProblemSpec {

  val sut = P06

  "isPalindrome" should {
    "be palindrome" in {
      sut.isPalindrome(List(1, 2, 3, 2, 1)) must be(true)
    }

    "not be palindrome" in {
      sut.isPalindrome(List(1, 2, 3, 2)) must be(false)
    }
  }
}
