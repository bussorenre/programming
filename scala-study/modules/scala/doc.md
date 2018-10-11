# 依存性注入

コンポーネント間の依存関係をプログラムのソースコードから排除する。


 - 依存関係の逆転の原則の実現
 - 依存オブジェクトのモック化によるユニットテストが可能になる。



## Scala におけるDI手法

 - GuiceなどのDIコンテナを使う。
 - Cakeパターン
 - Reader モナド


## コードとか

 - di1.scala
   - http://eed3si9n.com/ja/real-world-scala-dependency-injection-di
   - DI がよくわかってない
 - di2.scala
   - https://qiita.com/pab_tech/items/1c0bdbc8a61949891f1f
   - 包囲trait をやめたパターン。さっきよりもクラス図がすっきりしてるがやっぱり何が良いかよくわからない。

   


