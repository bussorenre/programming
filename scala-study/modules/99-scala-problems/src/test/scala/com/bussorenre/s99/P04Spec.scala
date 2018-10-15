package com.bussorenre.s99

import com.bussorenre.AbstractProblemSpec

class P04Spec extends AbstractProblemSpec {

  val sut = P04

  "length" should {
    "find the number of elements of a list" in {
      sut.length(List(1,1,2,3,5,8)) must be(6)
    }

    "empty list should be 0" in {
      sut.length(List()) must be(0)
    }
  }
}

