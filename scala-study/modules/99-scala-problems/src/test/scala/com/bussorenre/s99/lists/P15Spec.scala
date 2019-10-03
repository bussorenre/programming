package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P15Spec extends AbstractProblemSpec {
  val sut = P15

  "duplicateN" should {
    "Duplicate the elements of a list." in {
      val expected = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

      sut.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) must be(expected)
    }
  }
}
