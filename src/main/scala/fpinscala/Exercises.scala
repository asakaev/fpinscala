package fpinscala

import scala.annotation.tailrec

trait Exercises {

  /**
    * Exercise 2.1
    */
  def fib(n: Int): Int = {
    @tailrec def fibAux(a: Int, b: Int, n: Int): Int =
      if (n > 0) fibAux(b, a + b, n - 1) else a

    fibAux(0, 1, n)
  }

  /**
    * Exercise 2.2
    */
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec def loop(n: Int, acc: Boolean): Boolean =
      if ((n + 1) >= as.length) acc
      else loop(n + 1, acc && ordered(as(n), as(n + 1)))

    loop(0, acc = true)
  }

  /**
    * Exercise 2.3
    */
  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    a => b => f(a, b)

}
