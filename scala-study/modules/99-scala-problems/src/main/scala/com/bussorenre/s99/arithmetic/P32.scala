package com.bussorenre.s99.arithmetic

/**
  * Determine the greatest common divisor of two positive integer numbers.
  */
object P32 {
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}
