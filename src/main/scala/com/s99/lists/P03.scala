package com.s99.lists

/**
    P03 (*) Find the Kth element of a list.
    By convention, the first element in the list is element 0.
    Example:
      scala> nth(2, List(1, 1, 2, 3, 5, 8))
      res0: Int = 2
 */
object P03 {

  def nth[A](index: Int, elements: List[A]): Option[A] = {
    (index, elements) match {
      case (0, head::_) => Some(head)
      case (idx, _::tail) => nth(idx-1, tail)
      case _ => None
    }
  }

}
