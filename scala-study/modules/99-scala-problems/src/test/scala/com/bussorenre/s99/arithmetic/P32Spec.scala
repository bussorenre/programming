package com.bussorenre.s99.arithmetic

import com.bussorenre.s99.AbstractProblemSpec

class P32Spec extends AbstractProblemSpec {

  val sut = P32

  "gcd" should {
    "Determine the greatest common divisor of two positive integer numbers." in {
      sut.gcd(12, 4) must be(4)
      sut.gcd(24, 16) must be(8)
      sut.gcd(100, 1000) must be(100)
      sut.gcd(1, 8) must be(1)
      sut.gcd(29, 31) must be(1)
    }
  }
}
