sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
  }
}

// Exercicse 3.1
val x = List(1,2,3,4,5) match {
  case Cons(x, Cons(2, Cons(4, _))) => x
  case Nil => 42
  case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
  case Cons(h, t) => h + List.sum(t)
  case _ => 101
}

// Exercicse 3.2
def tail[A](list: List[A]): List[A] = list match {
  case Nil => Nil
  case Cons(_, x) => x
}

// Exercicse 3.3
def setHead[A](list: List[A], value: A): List[A] = list match {
  case Nil => Cons(value, Nil)
  case x => Cons(value, x)
}

// Exercise 3.4
def drop[A](list: List[A], n: Int): List[A] = list match {
  case Nil => Nil
  case Cons(_, x) => {
    if(n > 0) drop(x, n-1)
    else list
  }
}

// Exercise 3.5
def dropWhile[A](list: List[A], f: A => Boolean): List[A] = list match {
  case Nil => Nil
  case Cons(x, l) if f(x) => dropWhile(l)
  case _ => list
  }
}
