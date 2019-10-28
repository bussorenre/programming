package com.bussorenre.s99.lists

/**
  * Group the elements of a set into disjoint subsets.
  */
object P27 {
  import P26.combination

  // a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
  // Write a function that generates all the possibilities.
  def group3[T](list: List[T]): List[List[List[T]]] = {
    for {
      groupA <- combination(2, list)
      restA = list.filterNot(groupA.contains)
      groupB <- combination(3, restA)
      restB = list.filterNot(groupB.contains)
    } yield List(groupA, groupB, restB)
  }

  // b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.
  def group[T](cond: List[Int], list: List[T]): List[List[List[T]]] = cond match {
    case Nil => List(Nil)
    case n :: ns =>
      combination(n, list) flatMap { c =>
        group(ns, list.filterNot(c.contains)).map(c :: _)
      }
  }
}
