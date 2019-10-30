package com.bussorenre.s99.arithmetic

import com.bussorenre.s99.AbstractProblemSpec

class P31Spec extends AbstractProblemSpec {
  import P31._

  "isPrime" should {
    "Determine whether a given integer number is prime." in {
      val args     = List(0, 1, 2, 5, 10, 20, 67, 100, 113, 131071, 6700417)
      val expected = List(false, false, true, true, false, false, true, false, true, true, true)
      args.map(_.isPrime) must be(expected)
    }
  }
}
