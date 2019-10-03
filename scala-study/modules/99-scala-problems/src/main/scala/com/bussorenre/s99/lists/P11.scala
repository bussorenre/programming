package com.bussorenre.s99.lists

/**
  * Modified run-length encoding.
  */
object P11 {
  import P09.pack

  // I dont like this signiture using `Any`
  def encodeModified[A](list: List[A]): List[Any] = {
    pack(list) map { e =>
      if (e.length == 1) e.head
      else (e.length, e.head)
    }
  }
}
