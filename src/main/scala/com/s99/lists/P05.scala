package com.s99.lists

/**
    P05 (*) Reverse a list.
    Example:
      scala> reverse(List(1, 1, 2, 3, 5, 8))
      res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 {
  def reverse[A](elements: List[A]): List[A] = {
    elements match {
      case Nil => Nil
      case head::tail => reverse(tail):::List(head)
    }
  }
}
