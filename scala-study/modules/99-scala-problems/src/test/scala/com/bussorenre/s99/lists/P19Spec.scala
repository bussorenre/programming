package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P19Spec extends AbstractProblemSpec {

  val sut = P19

  "rotate" should {
    "Rotate a list N places to the left. (N > 0)" in {
      val expected = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
      sut.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be(expected)
    }

    "Rotate a list N places to the left. (N == 0)" in {
      val expected = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      sut.rotate(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be(expected)
    }

    "Rotate a list N places to the left. (N < 0)" in {
      val expected = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
      sut.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be(expected)
    }
  }
}
