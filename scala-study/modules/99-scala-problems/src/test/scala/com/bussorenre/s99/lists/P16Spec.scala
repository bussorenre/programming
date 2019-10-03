package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P16Spec extends AbstractProblemSpec {

  val sut = P16

  "drop" should {
    "Drop every Nth element from a list." in {
      sut.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    }
  }

  "drop2" should {
    "Drop every Nth element from a list." in {
      sut.drop2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    }
  }

}
