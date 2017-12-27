package fpinscala

import org.scalatest.FunSuite

class ExercisesSuite extends FunSuite with Exercises {
  test("fib") {
    assert(fib(0) == 1)
    assert(fib(1) == 1)
    assert(fib(5) == 8)
    assert(fib(6) == 13)
  }
}
