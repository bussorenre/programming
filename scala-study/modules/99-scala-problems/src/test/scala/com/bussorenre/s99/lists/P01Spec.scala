package com.bussorenre.s99.lists

import com.bussorenre.s99.AbstractProblemSpec

class P01Spec extends AbstractProblemSpec {
  val sut = P01

  "last" should {
    "リストの最後の値を返す" in {
      val args = List(1, 1, 2, 3, 5, 8)
      sut.last(args) must be(8)
    }

    "空リストが渡された時、 例外を返す" in {
      val args = List()
      an[Throwable] must be thrownBy (sut.last(args))
    }
  }
}
