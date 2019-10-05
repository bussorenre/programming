package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P23Spec extends AbstractProblemSpec {

  val sut = P23

  "randomSelect" should {
    "Extract a given number of randomly selected elements from a list." in {
      sut.randomSelect(3, P22.range(1, 10)) must be(List(3, 9, 1))
      sut.randomSelect(5, P22.range(1, 10)) must be(List(6, 4, 3, 10, 8))
      sut.randomSelect(0, P22.range(1, 10)) must be(List())
    }
  }

}
