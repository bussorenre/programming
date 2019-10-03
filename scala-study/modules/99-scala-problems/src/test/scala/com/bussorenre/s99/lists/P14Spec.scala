package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P14Spec extends AbstractProblemSpec {
  val sut = P14

  "duplicate" should {
    "Duplicate the elements of a list." in {
      val arg = List('a, 'b, 'c, 'c, 'd)
      val expected = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

      sut.duplicate(arg) must be(expected)
    }
  }
}
