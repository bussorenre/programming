package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P07Spec extends AbstractProblemSpec {
  val sut = P07

  "flatten" should {
    "Flatten a nested list structure" in {
      sut.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) must be(List(1, 1, 2, 3, 5, 8))
    }
  }
}
