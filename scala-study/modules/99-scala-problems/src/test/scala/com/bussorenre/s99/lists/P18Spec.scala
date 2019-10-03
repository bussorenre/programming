package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P18Spec extends AbstractProblemSpec {

  "slice" should {
    "Extract a slice from a list." in {
      val expected = List('d, 'e, 'f, 'g)
      P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) must be(expected)
    }
  }
}
