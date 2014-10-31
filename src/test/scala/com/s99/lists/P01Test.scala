package com.s99.lists

import org.scalatest.{Matchers, FlatSpec}

class P01Test extends FlatSpec with Matchers {

  "Last(List(1, 2, 3))" should "return Some(3)" in {
    P01.last(List(1, 2, 3)) shouldBe Some(3)
  }

  "Last(List(1))" should "return Some(1)" in {
    P01.last(List(1)) shouldBe Some(1)
  }

  "Last(List())" should "return None" in {
    P01.last(List()) shouldBe None
  }

  "Last(Nil)" should "return None" in {
    P01.last(Nil) shouldBe None
  }

}
