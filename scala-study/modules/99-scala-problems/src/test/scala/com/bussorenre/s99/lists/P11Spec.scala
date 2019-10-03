package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P11Spec extends AbstractProblemSpec {
  val sut = P11

  "encodeModified" should {
    "Modified run-length encoding." in {
      val arg = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

      sut.encodeModified(arg) must be(expected)
    }
  }
}
