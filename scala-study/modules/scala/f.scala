

object Main {
  def hoge[F[_]](xs: F[_]): Unit = {
    println(xs.getClass.getName)
  }

  def main(args: Array[String]) {
    val x = Seq(1,2,3,4)
    hoge(x)
  }
}
