package com.bussorenre.s99.lists

import scala.annotation.tailrec

/**
  * Eliminate consecutive duplicates of list elements.
  * "consecutive" means following each other continuously.
  */
object P08 {
  def compress[A](list: List[A]): List[A] = {
    list match {
      case x :: y :: xs => {
        if (x == y) compress(y :: xs)
        else x :: compress(y :: xs)
      }
      case _ => list
    }
  }

  def compress2[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case x :: xs => x :: compress2(xs.dropWhile(_ == x))
  }

  def compress3[A](list: List[A]): List[A] = {
    import P05.reverse
    @tailrec
    def innerCompress[A](ap: List[A], ls: List[A]): List[A] = ap match {
      case Nil => ls match {
        case Nil => Nil
        case x :: xs => innerCompress(List(x), xs)
      }
      case a :: _ => ls match {
        case Nil => ap
        case x :: xs => {
          if (a == x) innerCompress(ap, xs)
          else innerCompress(x :: ap, xs)
        }
      }
    }
    reverse(innerCompress(Nil, list))
  }

  def compress4[_](list: List[_]): List[_] = {
    import P05.reverse
    @tailrec
    def innerCompress[_](result: List[_], ls: List[_]): List[_] = ls match {
      case Nil => result
      case x :: _ => innerCompress(x :: result, ls.dropWhile(_ == x))
    }
    reverse(innerCompress(Nil, list))
  }

  def compress5[A](list: List[A]): List[A] = {
    list.foldRight(List[A]()) { (x, result) =>
      if(result.isEmpty || result.head != x) x :: result
      else result
    }
  }
}
