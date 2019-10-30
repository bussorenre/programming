package com.bussorenre.s99.arithmetic

import com.bussorenre.s99.AbstractProblemSpec

class P33Spec extends AbstractProblemSpec {
  import P33.P33

  "isCoprimeTo" should {
    "Determine whether two positive integer numbers are coprime." in {
      100.isCoprimeTo(101) must be(true)
      3.isCoprimeTo(7) must be(true)
      457.isCoprimeTo(303) must be(true)
      38.isCoprimeTo(14) must be(false)
      97.isCoprimeTo(291) must be(false)
    }
  }
}
