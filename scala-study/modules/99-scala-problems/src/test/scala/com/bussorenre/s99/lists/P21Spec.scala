package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P21Spec extends AbstractProblemSpec {

  val sut = P21

  "insertAt" should {
    "Insert an element at a given position into a list." in {
      val expected = List('a, 'new, 'b, 'c, 'd)
      sut.insertAt('new, 1, List('a, 'b, 'c, 'd)) must be(expected)
    }
  }
}
