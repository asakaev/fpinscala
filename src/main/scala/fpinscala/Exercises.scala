package fpinscala

import scala.annotation.tailrec

trait Exercises {

  def fib(n: Int): Int = {
    @tailrec def fibAux(a: Int, b: Int, n: Int): Int =
      if (n > 0) fibAux(b, a + b, n - 1) else a

    fibAux(0, 1, n)
  }

}
