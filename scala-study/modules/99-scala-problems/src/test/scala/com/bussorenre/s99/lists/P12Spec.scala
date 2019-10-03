package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P12Spec extends AbstractProblemSpec {
  val sut = P12

  "decode" should {
    "Decode a run-length encoded list." in {
      val arg      = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

      sut.decode(arg) must be(expected)
    }
  }
}
