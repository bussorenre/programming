package com.bussorenre.s99

import scala.annotation.tailrec

object Utils {

  @tailrec
  def foldLeft[A, B](list: List[A], zero: B)(f: (B, A) => B): B = list match {
    case Nil     => zero
    case x :: xs => foldLeft(xs, f(zero, x))(f)
  }

  // foldRight is not tail recursive
  def foldRight[A, B](list: List[A], zero: B)(f: (A, B) => B): B = list match {
    case Nil     => zero
    case x :: xs => f(x, foldRight(xs, zero)(f))
  }

  def append[T](a: List[T], b: List[T]): List[T] = {
    foldRight(a, b)((x, list) => x :: list)
  }

  // reverse using foldLeft
  def reverse[T](list: List[T]): List[T] = foldLeft(list, List[T]())((xs, x) => x :: xs)

  // map using foldLeft and reverse
  // O(N) + O(N)
  def map[A, B](list: List[A])(f: A => B): List[B] =
    reverse(foldLeft(list, List[B]()) { (xs, x) =>
      f(x) :: xs
    })
}
