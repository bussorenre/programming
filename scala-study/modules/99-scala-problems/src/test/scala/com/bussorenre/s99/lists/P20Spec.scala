package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P20Spec extends AbstractProblemSpec {

  val sut = P20

  "removeAt" should {
    "Remove the Kth element from a list." in {
      val expected = (List('a, 'c, 'd), 'b)
      sut.removeAt(1, List('a, 'b, 'c, 'd)) must be(expected)
    }
  }
}
