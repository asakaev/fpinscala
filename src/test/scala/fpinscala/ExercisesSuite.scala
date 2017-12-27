package fpinscala

import org.scalatest.FunSuite

class ExercisesSuite extends FunSuite with Exercises {

  /**
    * Exercise 2.1
    */
  test("fib") {
    assert(fib(0) == 0)
    assert(fib(1) == 1)
    assert(fib(2) == 1)
    assert(fib(3) == 2)
    assert(fib(4) == 3)
    assert(fib(20) == 6765)
  }

  /**
    * Exercise 2.2
    */
  test("isSorted") {
    val p: (Int, Int) => Boolean = (a, b) => a <= b
    assert(isSorted(Array(1, 2, 3), p))
    assert(isSorted(Array(1, 1), p))
    assert(!isSorted(Array(2, 1), p))
    assert(isSorted(Array(1), p))
    assert(isSorted(Array.empty, p))
  }

  /**
    * Exercise 2.3
    */
  test("curry") {
    val f: (Int, Int) => Int = (a, b) => a + b
    assert(curry(f)(1)(2) == f(1, 2))
  }

  /**
    * Exercise 2.4
    */
  test("uncurry") {
    val f: Int => Int => Int = a => b => a + b
    assert(uncurry(f)(1, 2) == f(1)(2))
  }

  /**
    * Exercise 2.5
    */
  test("compose") {
    val f: String => Int = a => a.toInt
    val g: Int => String = a => a.toString
    assert(compose(f, g)(42) == 42)
  }

}
