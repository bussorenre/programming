package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P24Spec extends AbstractProblemSpec {

  val sut = P24

  "lotto" should {
    "Lotto: Draw N different random numbers from the set 1..M." in {
      sut.Lotto(6, 49) must be(List(15, 39, 14, 30, 29, 48))
      sut.Lotto(2, 100) must be(List(40, 92))
    }
  }

}
