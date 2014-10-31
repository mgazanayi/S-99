package com.s99.lists

import org.scalatest.{Matchers, FlatSpec}

class P02Test extends FlatSpec with Matchers {

  "peneltumate(List(1, 2))" should "return Some(1)" in {
    P02.penultimate(List(1, 2)) shouldBe Some(1)
  }

  "peneltumate(List(1, 1, 2, 3, 5, 8))" should "return Some(5)" in {
    P02.penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe Some(5)
  }

  "peneltumate(List())" should "return None" in {
    P02.penultimate(List()) shouldBe None
  }

  "peneltumate(Nil)" should "return None" in {
    P02.penultimate(Nil) shouldBe None
  }

  "peneltumate(List(1))" should "return None" in {
    P02.penultimate(List(1)) shouldBe None
  }

}
