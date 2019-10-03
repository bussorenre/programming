package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P10Spec extends AbstractProblemSpec {
  val sut = P10

  "encode" should {
    "Run-length encoding of a list." in {
      val arg = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected =  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
      sut.encode(arg) must be (expected)
    }
  }
}
