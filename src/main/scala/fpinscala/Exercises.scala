package fpinscala

trait Exercises {

  def fib(n: Int): Int =
    if (n <= 1) 1 else fib(n - 1) + fib(n - 2)

}
