package com.bussorenre.s99.lists

/**
  * Sorting a list of lists according to length of sublists.
  */
object P28 {

  import P10.encode

  // a) We suppose that a list contains elements that are lists themselves.
  // The objective is to sort the elements of the list according to their length.
  // E.g. short lists first, longer lists later, or vice versa.
  def lsort[T](list: List[List[T]]) = {
    list.sortWith((a, b) => a.length < b.length)
  }

  // b) Again, we suppose that a list contains elements that are lists themselves.
  // But this time the objective is to sort the elements according to their length frequency;
  // i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed,
  // others with a more frequent length come later.
  def lsortFreq[T](list: List[List[T]]) = {
    val freqs = Map(encode(list.map { _.length } sortWith { _ < _ }).map { _.swap }: _*)
    list.sortWith { (e1, e2) =>
      freqs(e1.length) < freqs(e2.length)
    }
  }

}
