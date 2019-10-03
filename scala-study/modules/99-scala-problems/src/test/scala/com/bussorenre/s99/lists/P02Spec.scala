package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P02Spec extends AbstractProblemSpec {

  val sut = P02

  "penultimate" should {
    "return the last but one element" in {
      val args = List(1, 1, 2, 3, 5, 8)
      sut.penultimate(args) must be(5)
    }
  }
}
