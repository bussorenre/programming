package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P09Spec extends AbstractProblemSpec {
  val sut = P09

  "pack" should {
    "Pack consecutive duplicates of list elements into sublists" in {
      val arg = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      sut.pack(arg) must be(
        List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
      )
    }
  }
}
