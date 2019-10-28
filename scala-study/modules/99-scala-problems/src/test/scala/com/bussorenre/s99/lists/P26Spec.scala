package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P26Spec extends AbstractProblemSpec {

  val sut = P26

  "conbinations" should {
    "Generate the combinations of K distinct objects chosen from the N elements of a list." in {
      val args = List(1, 2, 3, 4, 5)
      val expected = List(
        List(1, 2, 3),
        List(1, 2, 4),
        List(1, 2, 5),
        List(1, 3, 4),
        List(1, 3, 5),
        List(1, 4, 5),
        List(2, 3, 4),
        List(2, 3, 5),
        List(2, 4, 5),
        List(3, 4, 5)
      )
      sut.combination(3, args) must be(expected)
    }
  }

}
