package com.bussorenre.s99

import com.bussorenre.AbstractProblemSpec

class P05Spec extends AbstractProblemSpec {

  val sut = P05

  "reverse" should {
    "reverse the list" in {
      sut.reverse(List(1, 1, 2, 3, 5, 8)) must be(List(8, 5, 3, 2, 1, 1))
    }
  }

  "reverseTailRec" should {
    "reverse the list" in {
      sut.reverseTailRec(List(1, 1, 2, 3, 5, 8)) must be(List(8, 5, 3, 2, 1, 1))
    }
  }
}
