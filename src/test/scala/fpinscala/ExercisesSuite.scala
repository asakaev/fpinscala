package fpinscala

import org.scalatest.FunSuite

class ExercisesSuite extends FunSuite with Exercises {
  test("fib") {
    assert(fib(0) == 0)
    assert(fib(1) == 1)
    assert(fib(2) == 1)
    assert(fib(3) == 2)
    assert(fib(4) == 3)
    assert(fib(20) == 6765)
  }
}
