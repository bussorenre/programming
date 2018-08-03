object Main {
  def main(args: Array[String]): Unit = {


    val a = new Rational(1,3)
    println("a is " + a)

    val b = new Rational(1,4)
    println("b is " + b)

    val d = a + b 
    println(d)
    println(d + 1)
  }
}

class Rational(n: Int, d:Int) {
  // validation
  require(d != 0)

  // member definition
  private val g = gcd(n, d)
  val numer: Int = n / g
  val denom: Int = d / g

  // axiliary constructor
  def this(n: Int) = this(n, 1)
  
  // overwirdes
  override def toString() = numer + "/" + denom

  def add(that: Rational): Rational = 
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom  
    )
  
  def add(n: Int): Rational = 
    new Rational(
      numer + n * denom,
      denom  
    )

  def mul(that: Rational): Rational = 
    new Rational(
      this.numer * that.numer,
      this.denom * that.denom
    )

  def mul(n: Int): Rational = 
    new Rational(
      numer * n,
      denom
    )

  def lessThan(that: Rational): Boolean =
    this.numer * that.denom > that.numer * this.denom

  def max(that: Rational): Rational =
    if (this.lessThan(that)) that else this

  // alases (operator overloads)
  def + (that: Rational) = this.add(that)
  def + (n: Int) = this.add(n)
  def * (that: Rational) = this.mul(that)
  def * (n: Int) = this.mul(n)
  def > (that: Rational) = this.lessThan(that)

  // private methods
  private def gcd(a: Int, b: Int): Int = 
    if(b == 0) a else gcd(b, a % b)
}