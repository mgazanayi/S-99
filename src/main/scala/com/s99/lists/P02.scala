package com.s99.lists

/**
    P02 (*) Find the last but one element of a list.
    Example:
      scala> penultimate(List(1, 1, 2, 3, 5, 8))
      res0: Int = 5
 */

object P02 {
  def penultimate[A](elements: List[A]): Option[A] = {
    elements match {
      case head::_::Nil => Some(head)
      case _::tail => penultimate(tail)
      case _ => None
    }
  }
}
