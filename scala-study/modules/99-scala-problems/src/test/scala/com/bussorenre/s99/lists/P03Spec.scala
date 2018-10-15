package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P03Spec extends AbstractProblemSpec {

  val sut = P03

  "nth" should {
    "find the Kth element of list" in {
      sut.nth(2, List(1, 1, 2, 3, 5, 8)) must be(2)
    }

    "return NoSuchElementException when list is Empty" in {
      an [NoSuchElementException] must be thrownBy(sut.nth(10, List()))
    }

    "return NoSuchElementException when index is over list length" in {
      an [NoSuchElementException] must be thrownBy(sut.nth(10, List(1,2,3,4,5,8)))
    }
  }
}
