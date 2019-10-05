package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P25Spec extends AbstractProblemSpec {

  val sut = P25

  "lotto" should {
    "Generate a random permutation of the elements of a list." in {
      sut.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)) must be(List('c, 'd, 'f, 'b, 'e, 'a))
    }
  }

}
