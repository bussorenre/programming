package com.bussorenre.s99

/**
  * Find the last but one element of a list
  */
object P02 {
  def penultimate[T](list: List[T]): T = list match {
    case x :: _ :: Nil => x
    case x :: _ :: xs => penultimate(xs)
    case _ => sys.error("Not implemented")
  }
}
