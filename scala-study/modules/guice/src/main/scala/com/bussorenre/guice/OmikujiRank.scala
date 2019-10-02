package com.bussorenre.guice

case class OmikujiRank(rank: String) {
}

case object OmikujiRank {
  val Daikichi = OmikujiRank("大吉")
  val chukichi = OmikujiRank("中吉")
  val shokichi = OmikujiRank("小吉")
  val kichi =OmikujiRank("吉")
  val kyo = OmikujiRank("凶")
  val daikyo = OmikujiRank("大凶")
}