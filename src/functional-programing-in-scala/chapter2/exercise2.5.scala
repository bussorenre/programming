def compose[A, B, C](f: B => C, g: A => B): A => C = {
  (a: A) => f(g(a))
}

// 別解
def compose2[A, B, C](f: B => C, g: A => B): A => C = {
  f compose g
}
