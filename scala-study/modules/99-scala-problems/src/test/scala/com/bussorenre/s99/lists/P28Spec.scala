package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P28Spec extends AbstractProblemSpec {

  val sut = P28

  "lsort" should {
    "a" in {
      val actual = sut.lsort(
        List(
          List('a, 'b, 'c),
          List('d, 'e),
          List('f, 'g, 'h),
          List('d, 'e),
          List('i, 'j, 'k, 'l),
          List('m, 'n),
          List('o)
        )
      )
      val expected = List(
        List('o),
        List('d, 'e),
        List('d, 'e),
        List('m, 'n),
        List('a, 'b, 'c),
        List('f, 'g, 'h),
        List('i, 'j, 'k, 'l)
      )

      actual must be(expected)
    }

    "b" in {
      val args = List(
        List('a, 'b, 'c),
        List('d, 'e),
        List('f, 'g, 'h),
        List('d, 'e),
        List('i, 'j, 'k, 'l),
        List('m, 'n),
        List('o)
      )
      val expected = List(
        List('i, 'j, 'k, 'l),
        List('o),
        List('a, 'b, 'c),
        List('f, 'g, 'h),
        List('d, 'e),
        List('d, 'e),
        List('m, 'n)
      )

      sut.lsortFreq(args) must be(expected)
    }
  }
}
