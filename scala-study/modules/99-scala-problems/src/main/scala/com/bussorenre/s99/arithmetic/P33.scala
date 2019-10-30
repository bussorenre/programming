package com.bussorenre.s99.arithmetic

/**
  * Determine whether two positive integer numbers are coprime.
  */
object P33 {
  import P32.gcd

  implicit class P33(val self: Int) {
    def isCoprimeTo(n: Int): Boolean = gcd(self, n) == 1
  }
}
