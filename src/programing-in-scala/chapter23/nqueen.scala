
/* for式

for ( seq ) yield expr

seq には以下の内容を連続して指定する。連続した要素は; で区切る
 - generator  ( name <- Listable)
 - definition ( name = ???)
 - filter     ( if (expr)  )

*/

/*
  N女王問題
  任意のNについて、N*Nの盤面にN個の女王を並べる。それぞれ互いに取られないようにする
*/

type Pos = (Int, Int)
type Result = List[List[Pos]]

def queens(n: Int): Result = {
  def placeQueen(k: Int): Result = {
    if (k == 0)
      List(List())
    else {
      for {
        queens <- placeQueen(k - 1)
        column <- 1 to n
        queen = (k, column)
        if isSafe(queen, queens)
      } yield queen :: queens
    }
  }

  def isSafe(queen: Pos, queens: List[Pos]): Boolean = {
    // 同列、同行、同斜じゃないか確認する
    def attackable(a: Pos, b: Pos): Boolean = {
      if (a._1 == b._1) false
      else if (a._2 == b._2) false
      else if ((a._1 - b._1).abs == (a._2 - b._2).abs) false
      else true
    }
    queens forall(q => attackable(q, queen))
  }

  placeQueen(n)
}