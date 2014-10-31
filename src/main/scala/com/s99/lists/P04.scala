package com.s99.lists

/**
    P04 (*) Find the number of elements of a list.
    Example:
      scala> length(List(1, 1, 2, 3, 5, 8))
      res0: Int = 6
  */
object P04 {
  def length(elements: List[Any]): Int = {
    elements.foldLeft(0)((length, _) => length + 1)
  }
}
