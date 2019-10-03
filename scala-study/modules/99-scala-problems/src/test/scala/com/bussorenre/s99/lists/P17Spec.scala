package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P17Spec extends AbstractProblemSpec {
  val sut = P17

  "split" should {
    "Split a list into two parts." in {
      val expected = (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      sut.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be(expected)
    }
  }
}
