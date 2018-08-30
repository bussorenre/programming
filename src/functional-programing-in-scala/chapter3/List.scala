sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = 
    foldRight(ints, 0)(_ + _)

  def product(ds: List[Double]): Double =
    foldRight(ds, 1.0)(_ * _)

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => f(x, foldRight(xs, z)(f))
  }

  // Excersice 3.10
  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => foldLeft(xs, f(z, x))(f)
  }

  // Excersice 3.11
  def sum2(ints: List[Int]): Int = 
    foldLeft(ints, 0)(_ + _)

  def product2(ds: List[Double]): Double =
    foldLeft(ds, 1.0)(_ * _)

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
  case Cons(x, l) if f(x) => dropWhile(l, f)
  case _ => list
}

// Exercise 3.7 無理じゃね？？
// Exercise 3.8 どうすればええねん？？？
// Exercise 3.9
def length[A](as: List[A]): Int = as match{
  case Nil => 0
  case Cons(_, xs) => 1 + length(xs)
}

// Exercise 3.12 これ結構難しい
// 最初はこれで組んだ
def reverse[A](as: List[A]): List[A] = {
  def loop(as: List[A], bs: List[A]): List[A] = as match {
    case Nil => bs
    case Cons(x, xs) => loop(xs, Cons(x, bs))
  }
  loop(as, Nil)
}

// foldLeft(foldRight) を使うように変更
def reverse2[A](as: List[A]): List[A] = List.foldLeft(as, List[A]())((a, b) => Cons(b, a))

// Exercise 3.14
def append[A](x: List[A], y: List[A]) = List.foldRight(x, y)((a, b) => Cons(a, b))
def append2[A](x: List[A], y: List[A]) = List.foldRight(x, y)(Cons(_,_))

// Exsercise 3.15 concat
// 複数のリストを受け取って一つのリストに連結する関数を作る
def concat[A](x: List[List[A]]) = List.foldRight(x, List[A]())(append)

// Exercise 3.16 
def add1(x: List[Int]): List[Int] = List.foldRight(x, Nil:List[Int])((a, b) => Cons(a+1, b))

// Exercise 3.17
def toString(x: List[Double]): List[String] = List.foldRight(x, Nil:List[String])((a, b) => Cons(a.toString, b))

// Exercise 3.18 map
def map[A, B](as: List[A])(f:A => B): List[B] = foldRight(as, Nil:List[B])((a, b) => Cons(f(a), b))

// Excercise 3.19  filter
def filter[A](as: List[A])(f: A => Boolean): List[A] = foldRight(as, Nil:List[A])((a, b) => if(f(a)) Cons(a, b) else b)

// Excercise 3.20 flatmap
def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] = concat(map(as)(f))

// Exercise 3.21 filter Via flatMap
def filterViaFlatmap[A](as: List[A])(f: A => Boolean): List[A] = flatMap(as)((a) => if(f(a)) List(a) else Nil)

// Exercise 3.22 & 3.23 zipWidth 
def zipWidth[A, B, C](as: List[A], bs:List[B])(f: (A, B) => C): List[C] = (as, bs) match {
  case (Nil, _) => Nil
  case (_, Nil) => Nil
  case (Cons(a1, b1), Cons(a2, b2)) => Cons(f(a1, a2), zipWidth(b1, b2)(f))
}


