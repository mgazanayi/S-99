package com.s99.lists

/**
    P01 (*) Find the last element of a list.
    Example:
      scala> last(List(1, 1, 2, 3, 5, 8))
      res0: Int = Some(8)
  */

object P01 {
  def last[T](elements: List[T]): Option[T] = {
    elements match {
      case head :: Nil => Some(head)
      case head::tail => last(tail)
      case _ => None
    }
  }
}