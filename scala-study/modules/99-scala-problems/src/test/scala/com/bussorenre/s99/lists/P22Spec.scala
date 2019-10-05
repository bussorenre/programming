package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P22Spec extends AbstractProblemSpec {

  val sut = P22

  "range" should {
    "Create a list containing all integers within a given range." in {
      sut.range(4, 9) must be(List(4, 5, 6, 7, 8, 9))
    }
  }
}
