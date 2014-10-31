package com.s99.lists

import org.scalatest.{Matchers, FlatSpec}

class P03Test extends FlatSpec with Matchers{

  "nth(2, List(1, 1, 2, 3, 5, 8))" should "return Some(2)" in {
    P03.nth(2, List(1, 1, 2, 3, 5, 8)) shouldBe Some(2)
  }

  "nth(2, List(1))" should "return None" in {
    P03.nth(2, List(1)) shouldBe None
  }

  "nth(2, List())" should "return None" in {
    P03.nth(2, List()) shouldBe None
  }

  "nth(2, Nil)" should "return None" in {
    P03.nth(2, Nil) shouldBe None
  }
}
