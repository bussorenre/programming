package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P27Spec extends AbstractProblemSpec {

  val sut = P27

  "group3" should {
    "a" in {
      val args   = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
      val actual = sut.group3(args)
      actual.length must be(1260)
    }

    "b" in {
      val actual   = sut.group(List(2, 1), List.range(0, 3))
      val expected = List(List(List(0, 1), List(2)), List(List(0, 2), List(1)), List(List(1, 2), List(0)))

      actual must be(expected)
    }
  }
}
