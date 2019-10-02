package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P08Spec extends AbstractProblemSpec {
  val sut = P08

  "compress" should {
    "Eliminate consecutive duplicates of list elements" in {
      val arg = List(1,1,2,3,4,5,5,5,6,6,7,7,8,8,8,10)
      sut.compress(arg) must be(List(1,2,3,4,5,6,7,8,10))
    }
  }

  "compress2" should {
    "Eliminate consecutive duplicates of list elements" in {
      val arg = List(1,1,2,3,4,5,5,5,6,6,7,7,8,8,8,10)
      sut.compress2(arg) must be(List(1,2,3,4,5,6,7,8,10))
    }
  }

  "compress3" should {
    "Eliminate consecutive duplicates of list elements" in {
      val arg = List(1,1,2,3,4,5,5,5,6,6,7,7,8,8,8,10)
      sut.compress3(arg) must be(List(1,2,3,4,5,6,7,8,10))
    }
  }

  "compress4" should {
    "Eliminate consecutive duplicates of list elements" in {
      val arg = List(1,1,2,3,4,5,5,5,6,6,7,7,8,8,8,10)
      sut.compress4(arg) must be(List(1,2,3,4,5,6,7,8,10))
    }
  }

  "compress5" should {
    "Eliminate consecutive duplicates of list elements" in {
      val arg = List(1,1,2,3,4,5,5,5,6,6,7,7,8,8,8,10)
      sut.compress5(arg) must be(List(1,2,3,4,5,6,7,8,10))
    }
  }
}
