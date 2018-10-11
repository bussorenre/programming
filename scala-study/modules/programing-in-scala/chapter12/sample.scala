class Point(val x: Int, val y: Int)

trait Rectangler {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangler {

}


object Main {
  def main(Args: Array[String]): Unit = {
    val rect = new Rectangle(new Point(1,1), new Point(10,10))
    println(rect.width)
  }
}