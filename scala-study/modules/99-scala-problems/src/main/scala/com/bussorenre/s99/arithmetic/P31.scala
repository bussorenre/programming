package com.bussorenre.s99.arithmetic

object P31 {
  implicit class P31(num: Int) {
    def isPrime: Boolean = (num > 1) && List.range(2, Math.sqrt(num).toInt).forall(num % _ != 0)
  }
}
