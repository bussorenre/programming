def isSorted[A](as: Array[A], orderd: (A, A) => Boolean): Boolean = {
  def loop(n: Int): Boolean = {
    if (n + 1 >= as.length) true 
    else if (orderd(as(n), as(n+1))) loop(n + 1)
    else false
  }

  loop(0)
}
