package com.bussorenre.guice

import scala.util.Random

case class FukitsuOmikuji(rank: OmikujiRank, okotoba: String) extends Omikuji {}

class ShrineBOmikuji extends OmikujiInterface {
  override def pray: Omikuji = {
    val random = new Random()
    val ranks = List(
      OmikujiRank.kyo,
      OmikujiRank.daikyo
    )
    FukitsuOmikuji(random.shuffle(ranks).head, "B神社の不吉なおみくじ")
  }
}
