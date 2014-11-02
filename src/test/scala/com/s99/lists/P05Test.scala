package com.s99.lists

import org.scalatest.{FlatSpec, Matchers}

class P05Test extends FlatSpec with Matchers {

  "reverse(List(1, 1, 2, 3, 5, 8))" should "return List(8, 5, 3, 2, 1, 1)" in {
    P05.reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
  }

  "reverse(List(1))" should "return List(1)" in {
    P05.reverse(List(1)) shouldBe List(1)
  }

  "reverse(List())" should "return List()" in {
    P05.reverse(List()) shouldBe List()
  }

  "reverse(Nil)" should "return Nil" in {
    P05.reverse(Nil) shouldBe Nil
  }

}
