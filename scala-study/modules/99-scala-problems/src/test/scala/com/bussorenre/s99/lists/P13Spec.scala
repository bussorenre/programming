package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P13Spec extends AbstractProblemSpec {
  val sut = P13

  "encodeDirect" should {
    "Run-length encoding of a list." in {
      val arg = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected =  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
      sut.encodeDirect(arg) must be (expected)
    }
  }

  "encodeDirect2" should {
    "Run-length encoding of a list." in {
      val arg = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      val expected =  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
      sut.encodeDirect2(arg) must be (expected)
    }
  }
}
