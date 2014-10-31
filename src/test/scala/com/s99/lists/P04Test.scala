package com.s99.lists

import org.scalatest.{Matchers, FlatSpec}

class P04Test extends FlatSpec with Matchers {

  "length(List(1, 1, 2, 3, 5, 8))" should "return 6" in {
    P04.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
  }

  "length(List(1))" should "return 1" in {
    P04.length(List(1)) shouldBe 1
  }

  "length(List())" should "return 0" in {
    P04.length(List()) shouldBe 0
  }

  "length(Nil)" should "return 0" in {
    P04.length(Nil) shouldBe 0
  }
}
