package com.bussorenre.guice

import scala.util.Random

case class KantanOmikuji(rank: OmikujiRank, okotoba: String) extends Omikuji {}

class ShrineAOmikuji extends OmikujiInterface {
  override def pray: Omikuji = {
    val random = new Random()
    val ranks = List(
      OmikujiRank.Daikichi,
      OmikujiRank.kichi,
      OmikujiRank.kyo
    )
    KantanOmikuji(random.shuffle(ranks).head, "A神社のありがたい簡単おみくじ")
  }
}
