object Main {
  def main(Args: Array[String]) = {
    // ここの (3) はコンストラクタ
    val greetStrings = new Array[String](3)

    // 添字[] ではなく() でインデックスを取得している。つまり単純なメソッド呼び出しである
    greetStrings(0) = "Hello"
    // greetStrings.update(0, "Hello") と同義
    greetStrings(1) = "under"
    greetStrings(2) = "the world"
    for (i <- 0 to 2) println(greetStrings(i))
  }
}